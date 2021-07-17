package com.ccunix.controller;

import com.ccunix.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/REQ")
public class ControllerTest {
    @RequestMapping("/req1")
    public String Test(Model model){
        System.out.println(model);
        model.addAttribute("msg","RequestMappingTest1");
        return "test";
    }
}
