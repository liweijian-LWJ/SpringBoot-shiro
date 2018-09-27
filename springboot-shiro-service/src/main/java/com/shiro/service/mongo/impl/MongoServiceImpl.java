package com.shiro.service.mongo.impl;

import com.alibaba.fastjson.JSONObject;
import com.shiro.entity.mongo.Mongo;
import com.shiro.service.mongo.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: liweijian
 * @Date: 2018/9/27 14:46
 * @Description:
 */
@Service("MongoServiceImpl")
public class MongoServiceImpl implements MongoService{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void insertMongo(JSONObject jsonObject) {
        Mongo mongo = jsonObject.toJavaObject(Mongo.class);
        mongoTemplate.save(mongo);
    }
}
