package com.ccunix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {
    @RequestMapping("/faye")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2_test1");
        return "test";
    }
    @RequestMapping("/halu")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest2_test2");
        return "test";
    }
}
