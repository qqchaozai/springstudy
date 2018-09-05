package com.study.spring.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 测试拦截器
 * @author chaozai
 * @date 2018年9月3日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.aop")
@EnableAspectJAutoProxy
public class AopMain {
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopMain.class);
	DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
	DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
	demoAnnotationService.doSomething();
	demoMethodService.doSomething();
	context.close();
    }

}
