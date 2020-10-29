package com.study.swagger.controller;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @ClassName：WebControllerTest
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2020/1/15 20:42
 */
public class WebControllerTest {
    private WebController webController=new WebController();

    @Test
    public void testHello() {
        webController.hello();
    }

}