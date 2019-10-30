package com.study.spring.spring5.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * 
 * @author chaozai
 * @date 2018年9月8日
 *
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
	return new TestBean("development test bean");
    }
    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
	return new TestBean("production test bean");
    }
    
}
