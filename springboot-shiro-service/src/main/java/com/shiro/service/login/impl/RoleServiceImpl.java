package com.shiro.service.login.impl;


import com.shiro.config.annotation.CurrentDataSource;
import com.shiro.dao.login.RoleMapper;
import com.shiro.entity.login.Role;
import com.shiro.service.login.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Auther: liweijian
 * @Date: 2018/10/8 13:37
 * @Description:
 */
@Service("RoleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;
    @CurrentDataSource(value = "SLAVE")
    @Override
    public List<Role> select(List<Role> listRole) {
        return roleMapper.select(listRole);
    }
}
