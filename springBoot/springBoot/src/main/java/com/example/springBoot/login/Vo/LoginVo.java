package com.example.springBoot.login.Vo;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author: 邝金辉
 * @DATE: 2023/8/16 13:10
 * @Description:
 * @Remark：
 * @Version 1.0
 */

public class LoginVo {
    @NotBlank(message = "loginName 不能为空")
    private String loginName;
    @NotBlank(message = "passWord 不能为空")
    private String passWord;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
