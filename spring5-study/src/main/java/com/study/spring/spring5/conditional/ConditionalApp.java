package com.study.spring.spring5.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
/**
 * 条件注解验证
 * @author chaozai
 * @date 2018年9月7日
 *
 */
@Configuration
public class ConditionalApp {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
	return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
	return new LinuxListService();
    }
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalApp.class);
	ListService service = context.getBean(ListService.class);
	System.out.println("【"+context.getEnvironment().getProperty("os.name")+"】 list cmd:"+service.showListCmd());
	context.close();
    }
}
