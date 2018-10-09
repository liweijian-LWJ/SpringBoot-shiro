package com.shiro.entity.login;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Getter
@Setter
public class User implements Serializable{

    private String id;

    private String userName;

    private String userPwd;

    private String salt;

    private List<Role> listRole;

    public String getCredentialsSalt(){
        return  this.userName+this.getSalt();
    }
}
