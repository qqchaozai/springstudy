package com.study.spring.spring5.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 * 任务配置类
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{

    @Override
    public Executor getAsyncExecutor() {
	ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
	taskExecutor.setCorePoolSize(5);//线程池核心线程数
	taskExecutor.setMaxPoolSize(10);//线程池最大线程数
	taskExecutor.setQueueCapacity(20);//缓冲(阻塞)队列
	taskExecutor.initialize();
	return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
	return AsyncConfigurer.super.getAsyncUncaughtExceptionHandler();
    }
    
}
