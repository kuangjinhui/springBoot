package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/7 9:54
 * @Description:
 * @Remark：
 * @Version 1.0
 */

@RestController
public class HelloController {

    @RequestMapping("helllo")
    public HashMap<Object, Object> helloWorld(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("name","美丽");
        map.put("age","26");
        return map;
    }

    public static void main(String[] args) {

    }
}
