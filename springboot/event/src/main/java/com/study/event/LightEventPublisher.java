package com.study.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName: LightEventPublisher
 * @Description: 发布事件
 * @Author: ChenCong
 * @Date: Created in 2020/6/3 20:11
 */
@RestController
public class LightEventPublisher {
    private static final Logger LOGGER = LoggerFactory.getLogger(LightEventPublisher.class);

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping(value = "/publish")
    public Object publish() {
        LightEvent lightEvent = new LightEvent("", LightEvent.LightColorEnum.YELLOW);
        applicationEventPublisher.publishEvent(lightEvent);
        LOGGER.info("things after publish");
        return "ok";
    }

}
