package com.shiro.config.shiro;

import com.shiro.entity.login.User;
import com.shiro.service.login.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

/**
 * @Auther: liweijian
 * @Date: 2018/10/8 14:39
 * @Description:
 */
public class MyShiroRealm extends AuthorizingRealm{

    @Autowired
    private UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = authenticationToken.getPrincipal().toString();
        User reqUser = new User();
        reqUser.setUserName(userName);
        User user = userService.select(reqUser);
        if(!ObjectUtils.isEmpty(user)){
            return  new SimpleAuthenticationInfo(user,user.getUserPwd(),user.getUserName());
        }
        return null;
    }
}
