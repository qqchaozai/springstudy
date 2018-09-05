package com.study.spring.spring5.aop;

import org.springframework.stereotype.Service;
/**
 * 
 * @author chaozai
 * @date 2018年9月3日
 *
 */
@Service
public class DemoAnnotationService {
    @MethodAction(message="通过注解拦截:DemoAnnotationService.doSomething")
    public void doSomething(){}
}
