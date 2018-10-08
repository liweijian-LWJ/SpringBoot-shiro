package com.shiro.service.login;



import com.shiro.entity.login.Role;

import java.util.List;

public interface RoleService {

    List<Role> select(List<Role> listRole);
}
