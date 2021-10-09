package com.kid.service;

import com.kid.pojo.Sign;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学生签到业务的接口
 */
public interface SignService {

    //查找所有签到
    public List<Sign> queryAll();

    //根据唯一编号查找签到信息
    public Sign queryOne(@Param("id") Integer id);

    //添加一个签到信息
    public void addSign(Sign sign);

}
