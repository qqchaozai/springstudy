package com.study.spring.spring5.annotation;

import org.springframework.stereotype.Service;
/**
 * 
 * @author chaozai
 * @date 2018年9月7日
 *
 */
@Service
public class DemoService {
    public void print(){
	System.out.println("DemoService print");
    }
}
