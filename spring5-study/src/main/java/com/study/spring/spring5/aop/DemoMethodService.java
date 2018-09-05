package com.study.spring.spring5.aop;

import org.springframework.stereotype.Service;
/**
 * 
 * @author chaozai
 * @date 2018年9月3日
 *
 */
@Service
public class DemoMethodService {
    public String doSomething(){
	System.out.println("doSomething execute!");
	return "hello aop";
    }
}
