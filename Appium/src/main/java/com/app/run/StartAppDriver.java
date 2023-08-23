package com.app.run;

import com.google.common.collect.Lists;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @Author: 邝金辉
 * @DATE: 2023/7/31 9:12
 * @Description:
 * @Remark：
 * @Version 1.0
 */

public class StartAppDriver {
    public static AppiumDriver getAppDriver()throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //手机类型或模拟器类型
        capabilities.setCapability("deviceName", "test0106");
        //自动化测试引擎
        capabilities.setCapability("automationName", "Appium");
        //手机操作系统iOS, Android, or FirefoxOS
        capabilities.setCapability("platformName", "Android");
        //手机操作系统版本号
        capabilities.setCapability("platformVersion", "10");
        //app包名
        capabilities.setCapability("appPackage", "com.shandongwubo.tma.goods");
        //app中启动的 Activity名称
        capabilities.setCapability("appActivity", "com.yaojet.tma.goods.ui.dirverui.main.activity.SplashActivity");

        return new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AppiumDriver driver = StartAppDriver.getAppDriver();
        Thread.sleep(2000);
        System.out.println("即将关闭driver驱动！");
        driver.quit();
    }
}
