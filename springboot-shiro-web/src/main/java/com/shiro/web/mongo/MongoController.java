package com.shiro.web.mongo;

import com.alibaba.fastjson.JSONObject;
import com.shiro.config.config.BaseController;
import com.shiro.config.config.ResEnum;
import com.shiro.config.config.ResponseData;
import com.shiro.service.mongo.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: liweijian
 * @Date: 2018/9/27 14:43
 * @Description:
 */
@Controller
@RequestMapping(value = "/MongoController")
public class MongoController extends BaseController{

    @Autowired
    MongoService mongoService;

    @RequestMapping(value = "/insertMongo")
    @ResponseBody
    public ResponseData insert(@RequestBody JSONObject jsonObject){
        if(ObjectUtils.isEmpty(jsonObject)){
            return  new ResponseData(ResEnum.FAIL.getCode(),"parameter error");
        }
        ResponseData responseData = new ResponseData(ResEnum.SUCCESS.getCode(),ResEnum.SUCCESS.getMessage());
        mongoService.insertMongo(jsonObject);
        return responseData;
    }
}
