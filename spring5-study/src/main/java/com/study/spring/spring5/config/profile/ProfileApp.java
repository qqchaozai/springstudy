package com.study.spring.spring5.config.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.config.profile")
public class ProfileApp {
    
    @Bean
    @Profile("prod")
    DemoBean prodDemoBean(){
	return new DemoBean("product");
    }
    
    @Bean
    @Profile("dev")
    DemoBean devDemoBean(){
	return new DemoBean("develop");
    }
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.getEnvironment().setActiveProfiles("prod");
	context.register(ProfileApp.class);
	context.refresh();
	context.getBean(DemoBean.class);
	context.close();
	context = new AnnotationConfigApplicationContext();
	context.getEnvironment().setActiveProfiles("dev");
	context.register(ProfileApp.class);
	context.refresh();
	context.getBean(DemoBean.class);
	context.close();
    }
    
}
