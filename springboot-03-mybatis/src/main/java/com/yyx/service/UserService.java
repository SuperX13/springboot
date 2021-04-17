package com.yyx.service;

import com.yyx.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryUserList();
    User queryUserById(int id);
    int addUser(User user);
    int updUser(User user);
    int delUser(int id);
}
