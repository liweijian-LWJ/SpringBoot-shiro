package com.shiro.service.login.impl;


import com.shiro.dao.login.UserMapper;
import com.shiro.service.login.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

}
