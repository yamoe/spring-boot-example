package com.example.arti.service;

import com.example.arti.dao.MysqlTestDAO;
import com.example.arti.vo.MysqlTestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MysqlTestServiceImpl implements MysqlTestService {

    @Autowired
    private MysqlTestDAO dao;

    public List<MysqlTestVO> select() throws Exception {
        return dao.select();
    }

}
