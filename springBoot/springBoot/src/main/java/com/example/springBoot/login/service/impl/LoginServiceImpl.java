package com.example.springBoot.login.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.springBoot.login.Vo.LoginVo;
import com.example.springBoot.login.service.LoginService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/16 15:02
 * @Description:
 * @Remark：
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    public static Map<Object,Object> users = new HashMap<>();

    static {
        users.put("admin","111111");
    }

    @Override
    public void login(LoginVo loginVo) {
        Assert.isTrue(users.containsKey(loginVo.getLoginName()) && users.get(loginVo.getLoginName()).equals(loginVo.getPassWord()),"login fail!");
    }

    @Override
    public void register(LoginVo loginVo) {
        Assert.isTrue(!users.containsKey(loginVo.getLoginName()),"User already exists!");
        users.put(loginVo.getLoginName(),loginVo.getPassWord());
    }

    @Override
    public String getAll() {
        return JSON.toJSONString(users);
    }

    public static Map<Object, Object> getUsers() {
        return users;
    }
}
