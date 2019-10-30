package com.study.spring.spring5.taskschedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * 定时任务类
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Service
public class ScheduledTaskService {
    
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
    /**
     * 每隔固定时间执行
     */
    @Scheduled(fixedRate=5000)
    public void fixedRateTime(){
	System.out.println("every five second："+SIMPLE_DATE_FORMAT.format(new Date()));
    }
    /**
     * 指定时间执行
     */
    @Scheduled(cron="0/1 * * * * ?")
    public void cronTime(){
	System.out.println("every one second："+SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
