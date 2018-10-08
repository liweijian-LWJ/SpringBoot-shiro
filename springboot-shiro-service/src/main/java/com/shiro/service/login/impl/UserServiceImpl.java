package com.shiro.service.login.impl;

import com.shiro.config.annotation.CurrentDataSource;
import com.shiro.dao.login.UserMapper;
import com.shiro.entity.login.User;
import com.shiro.service.login.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @CurrentDataSource(value = "SLAVE")
    public List<User> selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    @CurrentDataSource
    public void isnertUser(User user) {
        userMapper.insertUser(user);
    }
}
