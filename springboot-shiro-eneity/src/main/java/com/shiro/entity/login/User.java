package com.shiro.entity.login;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Getter
@Setter
public class User implements Serializable{

    private String userId;

    private String userName;
}
