package com.study.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @ClassName: LightEventAnnotationListener
 * @Description: 信号灯注解方式监听
 * @Author: ChenCong
 * @Date: Created in 2020/6/3 20:07
 */
@Component
public class LightEventAnnotationListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(LightEventAnnotationListener.class);

    @EventListener
    @Async
    public void handler(LightEvent event) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("traffic light: [{}]", event.getLightColor().getMessage());
        LOGGER.info(Thread.currentThread().getName());
    }
}
