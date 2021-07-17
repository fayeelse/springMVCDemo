package com.ccunix.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test(Model model){
        //转发
        /*model.addAttribute("msg","hello");
        return "forward:/index.jsp";*/
        //重定向
        model.addAttribute("msg","hello");
        return "redirect:/index.jsp";
    }
}
