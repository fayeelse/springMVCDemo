package com.ccunix.controller;

import com.ccunix.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("faye".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();
        //添加数据
        userList.add(new User("faye",1,"男"));
        userList.add(new User("HALU",2,"男"));
        userList.add(new User("Aki",3,"女"));
        return userList;
    }
    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if(name!=null){
            if ("admin".equals(name)){
                msg = "√";
            }else {
                msg = "×";
            }
        }
        if(pwd!=null){
            if ("123456".equals(pwd)){
                msg = "√";
            }else {
                msg = "×";
            }
        }
        return msg;
    }
}
