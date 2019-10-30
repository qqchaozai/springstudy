package com.study.spring.spring5.config.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.config.scope")
public class ScopeApp {
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeApp.class);
	DemoSingletonService demoSingletonServiceFirst = context.getBean(DemoSingletonService.class);
	DemoSingletonService demoSingletonServiceSecond = context.getBean(DemoSingletonService.class);
	DemoPrototypeService demoPrototypeServiceFirst = context.getBean(DemoPrototypeService.class);
	DemoPrototypeService demoPrototypeServiceSecond = context.getBean(DemoPrototypeService.class);
	System.out.println("DemoSingletonService 前后两次获得对象是否相同："+demoSingletonServiceFirst.equals(demoSingletonServiceSecond));
	System.out.println("DemoPrototypeService 前后两次获得对象是否相同："+demoPrototypeServiceFirst.equals(demoPrototypeServiceSecond));
	context.close();
    }
}
