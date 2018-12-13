package com.example.demo.controller;

import com.example.demo.domain.NeoProperties;
import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), OYO
 *
 * @Auther: hexiaobo
 * @Date: 2018/12/13 14:51
 * @Description: hello
 */
@RestController
public class HelloWorldController {
    @Autowired
    private NeoProperties neoProperties;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName(neoProperties.getTitle());
        user.setPassWord(neoProperties.getDescription());
        int count=userMapper.queryInfo();
        return user;
    }
}
