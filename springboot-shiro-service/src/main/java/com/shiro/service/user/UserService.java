package com.shiro.service.user;

import com.shiro.entity.user.User;

import java.util.List;

public interface UserService {
    List<User> selectUser(User user);

    void isnertUser(User user);
}
