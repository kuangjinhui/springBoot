package com.example.springBoot.unitl;

import com.alibaba.fastjson.JSON;
import com.example.springBoot.login.service.impl.LoginServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/17 9:44
 * @Description:
 * @Remark：
 * @Version 1.0
 */

@Component
public class Scheduler{
    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);

    @Scheduled(cron = "0/60 * * * * ?")
    public void cronJobSch() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        Date now = new Date();
//        String strDate = sdf.format(now);
        new CheckPassWord().updatePassWord();
    }

    public static void main(String[] args) {

    }

}
