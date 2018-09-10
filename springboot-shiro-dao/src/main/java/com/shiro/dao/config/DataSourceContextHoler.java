package com.shiro.dao.config;


public class DataSourceContextHoler {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();
    public static final String DEFAULT_DATA_SOURCE_TYPE = "MASTER";

    //设置数据源名
    public static void setDB(String dbType) {
        System.out.println("【设置数据源】切换到数据源: "+ dbType);
        CONTEXT_HOLDER.set(dbType);
    }

    //获取数据源名
    public static String getDB() {
        return CONTEXT_HOLDER.get();
    }

    //清除数据源
    public static void cleanDB() {
        CONTEXT_HOLDER.remove();
    }
}
