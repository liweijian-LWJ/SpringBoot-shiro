package com.shiro.web.login;


import com.shiro.config.config.BaseController;
import com.shiro.service.login.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
@Api
public class UserController extends BaseController {


    @Autowired
    private UserService userService;

}
