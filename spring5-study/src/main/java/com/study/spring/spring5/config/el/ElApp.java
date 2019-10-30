package com.study.spring.spring5.config.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
public class ElApp {
    public static void main(String[] args) {
	System.out.println(System.getProperty("user.dir"));
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
	ElConfig elConfig = context.getBean(ElConfig.class);
	elConfig.outputResource();
	context.close();
    }
}
