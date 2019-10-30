package com.study.spring.spring5.config.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 测试Spring事件监听
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.config.event")
public class EventApp {
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventApp.class);
	context.getBean(DemoPublisher.class).publishMsg("hello application event！");
	context.close();
    }
}
