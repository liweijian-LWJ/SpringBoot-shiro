package com.shiro.service.login;

import com.shiro.entity.login.Permission;
import com.shiro.entity.login.Role;

import java.util.List;

public interface PermissionService {
    List<Permission> select(List<Role> listRole);
}
