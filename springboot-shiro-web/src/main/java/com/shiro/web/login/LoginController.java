package com.shiro.web.login;

import ch.qos.logback.classic.Logger;
import com.alibaba.fastjson.JSONObject;
import com.shiro.config.config.BaseController;
import com.shiro.entity.login.User;
import com.shiro.service.login.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: liweijian
 * @Date: 2018/10/8 10:58
 * @Description:
 */
@Controller
@Api(description = "登录")
public class LoginController extends  BaseController{

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String select(String userName,String userPwd) {
        if(StringUtils.isEmpty(userName)){
            return "/login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPwd);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            token.clear();
            logger.error("error================");
        }
        return "/login";
    }

    @RequestMapping(value = "/index")
    public void index() {
        System.out.println("登录成功");
    }
}
