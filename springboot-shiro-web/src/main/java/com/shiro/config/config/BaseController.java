package com.shiro.config.config;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice(basePackages = "com.shiro.web.*")
public class BaseController {
    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

}
