package com.shiro.entity.login;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: liweijian
 * @Date: 2018/10/8 10:39
 * @Description:
 */
@Data
@Getter
@Setter
@ToString
public class Role implements Serializable{

    private String id;

    private String roleName;

    private List<Permission> listPermission;

}