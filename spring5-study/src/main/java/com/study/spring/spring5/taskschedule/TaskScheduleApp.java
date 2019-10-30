package com.study.spring.spring5.taskschedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * 定时任务演示
 * @author chaozai
 * @date 2018年9月7日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.taskschedule")
@EnableScheduling
public class TaskScheduleApp {
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleApp.class);
	try {
	    Thread.sleep(7*1000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	context.close();
    }
}
