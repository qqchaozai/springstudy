package com.study.spring.spring5.hellospring;

import org.springframework.stereotype.Service;
/**
 * 
 * @author chaozai
 * @date 2018年8月31日
 *
 */
@Service
public class HelloService {
    /**
     * 
     * @param msg
     * @return
     */
    public String hello(String msg){
	return "hello "+msg;
    }
}
