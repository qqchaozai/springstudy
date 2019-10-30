package com.study.spring.spring5.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author chaozai
 * @date 2018年9月7日
 *
 */
@SimpleConfiguration
public class AnnotationApp {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationApp.class);
	DemoService service = context.getBean(DemoService.class);
	service.print();
	context.close();
    }
    
}
