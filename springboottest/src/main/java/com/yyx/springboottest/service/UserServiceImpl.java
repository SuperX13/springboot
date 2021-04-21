package com.yyx.springboottest.service;

import com.yyx.springboottest.mapper.UserMapper;
import com.yyx.springboottest.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
