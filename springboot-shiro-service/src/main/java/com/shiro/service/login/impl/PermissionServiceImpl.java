package com.shiro.service.login.impl;

import com.shiro.config.annotation.CurrentDataSource;
import com.shiro.dao.login.PermissionMapper;
import com.shiro.entity.login.Permission;
import com.shiro.entity.login.Role;
import com.shiro.service.login.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: liweijian
 * @Date: 2018/10/8 13:47
 * @Description:
 */
@Service("PermissionServiceImpl")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    @CurrentDataSource(value = "SLAVE")
    @Override
    public List<Permission> select(List<Role> listRole) {
        return permissionMapper.select(listRole);
    }
}
