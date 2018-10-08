package com.shiro.web.login;

import com.alibaba.fastjson.JSONObject;
import com.shiro.config.config.BaseController;
import com.shiro.entity.login.User;
import com.shiro.service.login.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: liweijian
 * @Date: 2018/10/8 10:58
 * @Description:
 */
@Controller
@RequestMapping(value = "/LoginController")
@Api(description = "登录")
public class LoginController extends BaseController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/select")
    @ResponseBody
    @ApiOperation(value = "测试")
    public Object select(){
        User reqUser = new User();
        reqUser.setId("1");
        User user = userService.select(reqUser);
        logger.info(user.toString());
        return user;
    }

}
