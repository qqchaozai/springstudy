package com.study.spring.spring5.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * 任务类
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Service
@Async
public class AsyncTaskService {
//    @Async
    public void executeAsyncTask(int i){
	System.out.println("execute async task:"+i);
    }
//    @Async
    public void executeOtherAsyncTask(int i){
	System.out.println("execute other async task:"+i);
    }
}
