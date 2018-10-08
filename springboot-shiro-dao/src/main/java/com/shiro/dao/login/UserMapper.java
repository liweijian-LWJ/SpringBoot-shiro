package com.shiro.dao.login;

import com.shiro.entity.login.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser(User user);

    void insertUser(User user);
}
