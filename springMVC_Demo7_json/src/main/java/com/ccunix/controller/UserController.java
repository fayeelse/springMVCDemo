package com.ccunix.controller;

import com.alibaba.fastjson.JSON;
import com.ccunix.pojo.User;
import com.ccunix.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//不会走视图解析器，会直接返回字符串
    public String jsonTest1() throws JsonProcessingException {
        User user = new User("王子一",2,"男");
        return JsonUtils.getJson(user);
    }
    @RequestMapping("j2")
    @ResponseBody
    public String jsonTest2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("王子一",2,"男");
        User user2 = new User("曲晟志",2,"男");
        User user3 = new User("HALU",2,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return JsonUtils.getJson(userList);
    }
    @RequestMapping("/j3")
    @ResponseBody
    public String jsonTest3() throws JsonProcessingException {

        Date date = new Date();
        //ObjectMapper,时间解析后的默认格式为Timestamp,时间戳
        return JsonUtils.getJson(date);
    }
    @RequestMapping("/j4")
    @ResponseBody
    public  String jsonTest4(){
        List<User> userList = new ArrayList<User>();
        User user1 = new User("王子一",2,"男");
        User user2 = new User("曲晟志",2,"男");
        User user3 = new User("HALU",2,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        String str = JSON.toJSONString(userList);
        return str;
    }
}
