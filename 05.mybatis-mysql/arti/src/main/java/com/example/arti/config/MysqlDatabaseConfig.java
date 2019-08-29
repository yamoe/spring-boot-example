package com.example.arti.config;

import com.example.arti.config.yaml.YamlPropertySourceFactory;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.example.arti.dao", annotationClass = MysqlConnectionMapper.class, sqlSessionFactoryRef = "mysqlSqlSessionFactory")
@EnableTransactionManagement
@PropertySource(value = {
        "classpath:/db.yml"
}, ignoreResourceNotFound = true, factory = YamlPropertySourceFactory.class)
public class MysqlDatabaseConfig {

    @Primary
    @Bean(name = "mysqlDataSource", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.mysql.datasource.hikari")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name = "mysqlSqlSessionFactory")
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource mysqlDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(mysqlDataSource);
        factory.setMapperLocations(applicationContext.getResources("classpath*:/mybatis/mysql/**/*.xml"));
        return factory.getObject();
    }

    @Primary
    @Bean(name = "oracleSqlSessionTemplate")
    public SqlSessionTemplate oracleSqlSessionTemplate(SqlSessionFactory mysqlSqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(mysqlSqlSessionFactory);
    }

}
