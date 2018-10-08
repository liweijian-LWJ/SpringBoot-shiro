package com.shiro.entity.login;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.io.Serializable;

/**
 * @Auther: liweijian
 * @Date: 2018/10/8 10:40
 * @Description:
 */
@Data
@ToString
@Getter
@Setter
public class Permission implements Serializable{

    private String id ;

    private  String permissionName;

    private Role role;
}
