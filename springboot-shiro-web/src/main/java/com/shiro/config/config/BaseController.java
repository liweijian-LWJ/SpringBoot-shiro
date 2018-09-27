package com.shiro.config.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(basePackages = "com.shiro.web.*")
@Slf4j
public class BaseController {
    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler({Exception.class,RuntimeException.class})
    public ModelAndView handleException(Exception e){
        ModelAndView modelAndView = new ModelAndView("error");
        return modelAndView ;
    }

}
