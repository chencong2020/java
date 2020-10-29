package com.study.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName：WebController
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/11 15:42
 */
@RestController
@RequestMapping(value = "/api")
@Api(tags = "api")
public class WebController {
    private Logger logger = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/hello1")
    @ApiOperation(value = "hello1")
    public String hello() {
        return "你好啊";
    }

    @PostMapping("/hello2")
    @ApiOperation(value = "hello2")
    public boolean success() {
        return true;
    }

    @GetMapping("/logback")
    public String logback() {
        for (int i = 0; i < 10; i++) {
            //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
            logger.trace("日志输出 trace");
            logger.debug("日志输出 debug");
            logger.info("日志输出 info");
            logger.warn("日志输出 warn");
            logger.error("日志输出 error");
        }
        return "我是陈聪";
    }
}

