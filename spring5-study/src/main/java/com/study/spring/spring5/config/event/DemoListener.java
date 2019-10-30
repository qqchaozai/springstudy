package com.study.spring.spring5.config.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
 * 自定义事件监听器
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent event) {
	String msg = event.getMsg();
	System.out.println("receive msg from publisher,msg info:"+msg);
    }

}
