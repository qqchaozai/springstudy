package com.study.spring.spring5.config.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * 事件发布者
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext context;
    /**
     * 推送消息
     * @param msg
     */
    public void publishMsg(String msg){
	context.publishEvent(new DemoEvent(this, msg));
    }
}
