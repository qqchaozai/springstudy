package com.study.spring.spring5.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author chaozai
 * @date 2018年9月3日
 *
 */
@Configuration
public class HelloConfiguration {
    
    @Bean(name="configService")
    public ConfigService getConfigService(){
	return new ConfigService();
    }
    
    public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigService.class,HelloApp.class);
	ConfigService configService = context.getBean(ConfigService.class);
	System.out.println(configService.getConfig());
    }
    
}
