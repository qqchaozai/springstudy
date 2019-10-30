package com.study.spring.spring5.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
public class ApplicationContextAwareDemo implements ApplicationContextAware{

    private ApplicationContext context;
    
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
	this.context = context;
    }
    
}
