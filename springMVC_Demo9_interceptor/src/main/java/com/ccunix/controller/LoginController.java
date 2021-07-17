package com.ccunix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/main")
    public  String main(){
        return "main";
    }
    @RequestMapping("/gologin")
    public  String login(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(String username, String password,HttpSession session, Model model){
        System.out.println("login==>"+username);
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "main";
    }
    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
