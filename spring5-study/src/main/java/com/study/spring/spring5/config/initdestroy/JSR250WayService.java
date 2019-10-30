package com.study.spring.spring5.config.initdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
public class JSR250WayService {
    
    public JSR250WayService() {
	super();
	System.out.println("JSR250WayService bean create");
    }
    @PostConstruct
    public void init(){
	System.out.println("JSR250WayService init method");
    }
    @PreDestroy
    public void destory(){
	System.out.println("JSR250WayService destory method");
    }
}
