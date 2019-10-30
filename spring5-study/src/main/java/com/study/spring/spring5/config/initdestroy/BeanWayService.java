package com.study.spring.spring5.config.initdestroy;

/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
public class BeanWayService {
    
    public BeanWayService() {
	super();
	System.out.println("BeanWayService bean create");
    }
    
    public void init(){
	System.out.println("BeanWayService init method");
    }
    
    public void destroy(){
	System.out.println("BeanWayService destory method");
    }
    
}
