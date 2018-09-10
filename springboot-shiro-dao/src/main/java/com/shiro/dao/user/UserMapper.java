package com.shiro.dao.user;

import com.shiro.entity.user.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser(User user);

    void insertUser(User user);
}
