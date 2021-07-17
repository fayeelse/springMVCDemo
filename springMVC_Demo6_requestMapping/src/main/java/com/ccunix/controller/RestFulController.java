package com.ccunix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {
    //原来的 ：http://localhost:8080/add?add?a=1&b=2
    //RestFul : http://localhost:8080/add/a/b
    //@RequestMapping(name="/add/{a}/{b}",method = RequestMethod.GET)
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test(@PathVariable int a,@PathVariable String b, Model model){
        String  res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable String b,Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}
