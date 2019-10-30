package com.study.spring.spring5.aware;

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
@ComponentScan("com.study.spring.spring5.aware")
public class AwareApp {
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareApp.class);
	AwareService awareService = context.getBean(AwareService.class);
	awareService.outputResult();
	context.close();
    }
}
