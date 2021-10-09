package com.kid.controller;

import com.kid.util.MyBatisUtil;
import com.kid.pojo.Sign;
import com.kid.service.SignService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SignController extends MyBatisUtil {

    SignService signService = null;

    //不会走视图解析器
    @ResponseBody
    //请求地址
    @RequestMapping(value = "/add", produces = "text/html;charset=UTF-8;")
    public String add(Sign sign) {

        signService = getSqlSession().getMapper(SignService.class);

        System.out.println("这里是SignController类中的add方法");//测试信息
        System.out.println("sign = " + sign);//测试信息

        signService.addSign(sign);

        closeSession();

        return "1";
    }

    //不走视图解析器
    @ResponseBody
    //请求地址
    @RequestMapping(value = "/queryAll", produces = "text/html;charset=UTF-8;")
    public String queryAll() {
        //测试信息
        System.out.println("这里是SignController类中的queryAll方法");

        signService = getSqlSession().getMapper(SignService.class);

        List<Sign> signList = signService.queryAll();

        signList.toString();

        JSONArray jsonArray = new JSONArray(signList);

        closeSession();

        return jsonArray.toString();
    }

    @ResponseBody
    @RequestMapping(value = "queryOne", produces = "text/html;charset=UTF-8;")
    public String queryOne(String index) {
        //测试信息
        System.out.println("这里是SignController类中的queryOne方法");
        System.out.println("index = " + index);

        signService = getSqlSession().getMapper(SignService.class);
        Sign sign = signService.queryOne(Integer.parseInt(index));

        System.out.println("sign = " + sign);

        JSONObject jsonObject = new JSONObject(sign);

        return jsonObject.toString();
    }

}
