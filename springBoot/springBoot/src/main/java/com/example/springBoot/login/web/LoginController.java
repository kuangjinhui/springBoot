package com.example.springBoot.login.web;

import com.alibaba.fastjson.JSON;
import com.example.springBoot.login.Vo.LoginVo;
import com.example.springBoot.login.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/16 15:06
 * @Description:
 * @Remark：
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Validated LoginVo loginVo){
        log.info("loginVo: {}", JSON.toJSONString(loginVo));
        loginService.login(loginVo);
        return new ResponseEntity<>("login successfully", HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll(){
        return new ResponseEntity<>(loginService.getAll(),HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody @Validated LoginVo loginVo){
        loginService.register(loginVo);
        return new ResponseEntity<>("register successfully",HttpStatus.OK);
    }
}
