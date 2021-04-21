package com.yyx.springboottest.controller;

import com.yyx.springboottest.pojo.User;
import com.yyx.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/showAll")
    public List<User> show(){
        return userService.queryUserList();
    }
}
