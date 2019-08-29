package com.example.arti.dao;

import com.example.arti.config.MysqlConnectionMapper;
import com.example.arti.vo.MysqlTestVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
@MysqlConnectionMapper
public interface MysqlTestDAO {
    List<MysqlTestVO> select() throws Exception;
}
