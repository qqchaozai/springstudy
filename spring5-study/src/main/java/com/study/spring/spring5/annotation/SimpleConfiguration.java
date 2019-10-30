package com.study.spring.spring5.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;
/**
 * @Configuration和@ComponentScan组合注解
 * 
 * @author chaozai
 * @date 2018年9月7日
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Documented
@Configuration
@ComponentScan
public @interface SimpleConfiguration {
    
    @AliasFor(annotation = ComponentScan.class)
    String[] value() default {};
    
}
