package com.shiro.web;

import com.shiro.entity.login.Permission;
import com.shiro.entity.login.Role;
import com.shiro.entity.login.User;
import com.shiro.service.login.PermissionService;
import com.shiro.service.login.RoleService;
import com.shiro.service.login.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShiroWebApplicationTests {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;
	@Autowired
	private PermissionService permissionService;
	@Test
	public void contextLoads() {
		User user = new User();
		user.setId("1");
		User select = userService.select(user);
		System.out.println(select);
		List<Role> listRole = roleService.select(select.getListRole());
		System.out.println(listRole);
		List<Permission> listPermission=  permissionService.select(select.getListRole());
		System.out.println(listPermission);
	}

}
