package com.study.spring.spring5.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author chaozai
 * @date 2018年8月31日
 *
 */
@Service
public class UseHelloService {
    @Autowired
    HelloService helloService;
    /**
     * 
     * @param msg
     * @return
     */
    public void hello(String msg){
	System.out.println(helloService.hello(msg));
    }
}
