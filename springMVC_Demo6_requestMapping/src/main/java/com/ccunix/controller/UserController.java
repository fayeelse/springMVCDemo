package com.ccunix.controller;

import com.ccunix.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("/t1")
    /*requestParam前端必须与括号内的名字来赋值*/
    public String test1(@RequestParam("username") String name, Model model){
        /*1.接收前端参数*/
        System.out.println("接收到前端的参数为："+name);
        /*2.将返回的结果传递给前端*/
        model.addAttribute("msg",name);
        /*跳转视图*/
        return "test";
    }
    /*前端接收的是一个对象*/
    /*1.接收前端用户传递的参数，判断参数的名字，假设参数的名字直接在方法上，可以直接使用*/
    /*2.假设传递的是一个对象User,匹配User对象中的字段名，如果名字一致则OK，否则，匹配不到*/
    @GetMapping("/t2")
    public String test2(User user,Model model){
        model.addAttribute("msg",user);
        System.out.println("接收到的数据"+user);
        return "test";
    }

}
