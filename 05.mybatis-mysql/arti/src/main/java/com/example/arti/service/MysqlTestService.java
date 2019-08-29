package com.example.arti.service;

import com.example.arti.vo.MysqlTestVO;
import java.util.List;

public interface MysqlTestService {

    List<MysqlTestVO> select() throws Exception;
}
