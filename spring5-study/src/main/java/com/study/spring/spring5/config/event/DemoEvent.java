package com.study.spring.spring5.config.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * @author chaozai
 * @date 2018年9月6日
 *
 */
public class DemoEvent extends ApplicationEvent{
    
    private static final long serialVersionUID = -1404313071348144822L;
    
    private String msg;
    
    public DemoEvent(Object source,String msg) {
	super(source);
	this.msg = msg;
    }
    public String getMsg(){
	return msg;
    }
    public void setMsg(String msg){
	this.msg = msg;
    }
}
