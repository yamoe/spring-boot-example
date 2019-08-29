package com.example.arti.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "jsp")
public class JspController {
    @RequestMapping("/page1")
    public String test() throws Exception {
        return "page";
    }

    @RequestMapping("/page2")
    public ModelAndView mav() throws Exception{
        // page 이름
        ModelAndView mv = new ModelAndView("page");

        // 변수,값 설정
        mv.addObject("fruit", "apple");

        return mv;
    }

    @RequestMapping("/page3")
    public String view(Model model) {

        // 변수,값 설정
        model.addAttribute("fruit", "banana");

        return "page";
    }


    // 문자열 전달
    @RequestMapping("/str")
    public @ResponseBody String str() throws Exception {
        return "str";
    }
}
