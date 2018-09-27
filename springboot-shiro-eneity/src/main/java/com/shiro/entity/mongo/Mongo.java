package com.shiro.entity.mongo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auther: liweijian
 * @Date: 2018/9/27 15:09
 * @Description:
 */
@Data
@Getter
@Setter
@ToString
public class Mongo implements Serializable{

    private String id;

    private String name;
}