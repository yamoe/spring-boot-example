package com.example.arti.jpa.service;


import com.example.arti.jpa.entity.Test;
import com.example.arti.jpa.repo.JpaTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaTestService {

    @Autowired
    JpaTestRepository repo;

    public List<Test> select() throws Exception {
        return repo.findAll();
    }
}
