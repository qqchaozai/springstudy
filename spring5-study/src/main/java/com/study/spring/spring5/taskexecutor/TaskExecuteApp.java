package com.study.spring.spring5.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 验证多线程执行任务
 * @author chaozai
 * @date 2018年9月6日
 *
 */
public class TaskExecuteApp {
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
	AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
	for(int i=0;i<7;i++){
	    asyncTaskService.executeAsyncTask(i);
	    asyncTaskService.executeOtherAsyncTask(i);
	}
	context.close();
    }
}
