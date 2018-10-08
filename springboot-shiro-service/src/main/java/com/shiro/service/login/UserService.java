package com.shiro.service.login;


import com.shiro.entity.login.User;

public interface UserService {
    User select(User reqUser);
}
