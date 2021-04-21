package com.yyx.controller;

import com.yyx.pojo.User;
import com.yyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/allUser")
    public List<User> queryUserList(){
        List<User> users = userService.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
}
