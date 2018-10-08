package com.shiro.service.login;

import com.shiro.entity.login.User;

import java.util.List;

public interface UserService {
    List<User> selectUser(User user);

    void isnertUser(User user);
}
