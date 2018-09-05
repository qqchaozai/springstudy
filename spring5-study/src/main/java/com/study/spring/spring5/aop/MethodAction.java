package com.study.spring.spring5.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 注解类
 * @author chaozai
 * @date 2018年9月3日
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) 
@Documented
public @interface MethodAction {
    /**
     * 通过配置message传递信息
     * @return
     */
    String message();
}
