package com.example.arti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "th")
public class ThymeleafController {

    @RequestMapping("/page")
    public ModelAndView mav() throws Exception{
        // page 이름
        ModelAndView mv = new ModelAndView("thymeleaf-page");

        // 변수,값 설정
        mv.addObject("fruit", "Pineapple");

        return mv;
    }
}
