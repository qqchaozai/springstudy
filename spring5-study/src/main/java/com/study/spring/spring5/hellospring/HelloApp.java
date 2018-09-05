package com.study.spring.spring5.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Spring 演示程序
 * @author chaozai
 * @date 2018年8月31日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.hellospring")
public class HelloApp {
    
    public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(HelloApp.class);
	UseHelloService service = context.getBean(UseHelloService.class);
	service.hello("spring");
    }
}
