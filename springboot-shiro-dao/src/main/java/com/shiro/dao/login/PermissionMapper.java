package com.shiro.dao.login;

import com.shiro.entity.login.Permission;
import com.shiro.entity.login.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> select(@Param("listRole") List<Role> listRole);
}