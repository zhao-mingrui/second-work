package com.zmr.controller;

import com.zmr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void testAnnotation(){
        userService.testAnnotation();
        System.out.println("测试注解注入--UserController");
    }
}
