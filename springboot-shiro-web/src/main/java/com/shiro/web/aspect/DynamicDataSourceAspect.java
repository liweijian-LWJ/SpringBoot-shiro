package com.shiro.web.aspect;



import com.shiro.dao.annotation.CurrentDataSource;
import com.shiro.dao.config.DataSourceContextHoler;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;



@Component
@Aspect
@Slf4j
public class DynamicDataSourceAspect {

    @Before("@annotation(currentDataSource)")
    public void beforeSwitchDS(JoinPoint joinPoint, CurrentDataSource currentDataSource) {
        //获取当前访问的class
        Class clazz = joinPoint.getTarget().getClass();
        //获得访问的方法名
        String methodName = joinPoint.getSignature().getName();
        //得到方法的参数类型
        Class[] argClazz = ((MethodSignature) joinPoint.getSignature()).getParameterTypes();

        String dbType = DataSourceContextHoler.DEFAULT_DATA_SOURCE_TYPE;
        try {
            Method method = clazz.getMethod(methodName, argClazz);
            CurrentDataSource annotation = method.getAnnotation(CurrentDataSource.class);
            if (annotation != null) {
                dbType = annotation.value();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHoler.setDB(dbType);
    }

    @After("@annotation(currentDataSource)")
    public void afterSwitchDS(JoinPoint joinPoint, CurrentDataSource currentDataSource) {
        DataSourceContextHoler.cleanDB();
    }


}
