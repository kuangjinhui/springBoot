package com.example.springBoot.login.service;


import com.example.springBoot.login.Vo.LoginVo;

import java.util.Collection;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/16 14:55
 * @Description:
 * @Remark：
 * @Version 1.0
 */

public interface LoginService {
    void login(LoginVo loginVo);
    void register(LoginVo loginVo);
    String getAll();
}
