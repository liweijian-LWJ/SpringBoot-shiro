package com.shiro.config.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println("【数据源】当前数据源为: "+ DataSourceContextHoler.getDB());
        return DataSourceContextHoler.getDB();
    }
}
