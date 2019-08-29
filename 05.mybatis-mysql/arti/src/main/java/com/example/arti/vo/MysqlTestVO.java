package com.example.arti.vo;


import lombok.Builder;
import lombok.Data;
import java.sql.Timestamp;

@Data
@Builder
public class MysqlTestVO {
    public Long id;
    public String str;
    public Timestamp date;
}
