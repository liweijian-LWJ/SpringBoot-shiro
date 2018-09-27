package com.shiro.web.user;

import com.shiro.config.config.BaseController;
import com.shiro.entity.user.User;
import com.shiro.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
@Api
public class UserController extends BaseController{


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUser", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询测试")
    public List<User> selectUser(@RequestBody User user) {
        return userService.selectUser(user);
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增测试")
    public void isnertUser(@RequestBody User user) {
        userService.isnertUser(user);
    }
}
