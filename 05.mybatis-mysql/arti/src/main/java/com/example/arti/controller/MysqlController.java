package com.example.arti.controller;

import com.example.arti.service.MysqlTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "mysql")
public class MysqlController {

    @Autowired
    private MysqlTestService svc;

    @RequestMapping("/select")
    public @ResponseBody String select() throws Exception {
        return svc.select().toString();
    }

}
