package com.example.springBoot.unitl;

import com.example.springBoot.login.service.impl.LoginServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/17 17:34
 * @Description:
 * @Remark：
 * @Version 1.0
 */
public class CheckPassWord extends LoginServiceImpl {
    private final static Logger log = LoggerFactory.getLogger(CheckPassWord.class);
    public void updatePassWord(){
        users.forEach((key,val)->{
            if (val.equals("111111")){
                users.put(key,key);
                log.info("{}你的密码为弱密码，已暂修改密码为 {}",key,key);
            }
        });
    }
}
