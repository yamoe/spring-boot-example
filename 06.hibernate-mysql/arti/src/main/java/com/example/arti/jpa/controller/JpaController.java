package com.example.arti.jpa.controller;

import com.example.arti.jpa.service.JpaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "jpa")
public class JpaController {

    @Autowired
    private JpaTestService svc;

    @RequestMapping("/select")
    public @ResponseBody String select() throws Exception {
        return svc.select().toString();
    }

}
