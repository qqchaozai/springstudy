package com.study.spring.spring5.config.initdestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 * 
 */
@Configuration
@ComponentScan("com.study.spring.spring5.config.initdestroy")
public class InitDestroyApp {
    
    @Bean(initMethod="init",destroyMethod="destroy")
    BeanWayService beanWayService(){
	return new BeanWayService();
    }
    @Bean
    JSR250WayService jSR250WayService(){
	return new JSR250WayService();
    }
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitDestroyApp.class);
	context.getBean(BeanWayService.class);
	context.getBean(JSR250WayService.class);
	context.close();
    }
    
}
