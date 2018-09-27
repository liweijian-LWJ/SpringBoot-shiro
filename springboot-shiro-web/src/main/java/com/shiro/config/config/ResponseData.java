package com.shiro.config.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Auther: liweijian
 * @Date: 2018/9/27 14:50
 * @Description:
 */
@Data
@Getter
@Setter
@ToString
public class ResponseData {

    private String code;

    private String message;

    private  Object data;

    public ResponseData(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseData(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
