package com.study.spring.spring5.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 拦截器-切面
 * 
 * @author chaozai
 * @date 2018年9月3日
 *
 */
@Aspect
@Component
public class DemoAspect {
    /**
     * 通过注解声明切点
     */
    @Pointcut("@annotation(com.study.spring.spring5.aop.MethodAction)")
    public void annotationPointCut() {
    };

    /**
     * 后置
     * 
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void afterAnnotation(JoinPoint joinPoint) {
	MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
	Method method = methodSignature.getMethod();
	MethodAction action = method.getAnnotation(MethodAction.class);
	System.out.println("【注解标记--后置通知】:" + action.message());
    }

    /**
     * 前置
     * 
     * @param joinPoint
     */
    @Before("annotationPointCut()")
    public void beforeAnnotation(JoinPoint joinPoint) {
	MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
	Method method = methodSignature.getMethod();
	MethodAction action = method.getAnnotation(MethodAction.class);
	System.out.println("【注解标记--前置通知】:" + action.message());
    }

    /**
     * 切点
     */
    @Pointcut("execution(* com.study.spring.spring5.aop.DemoMethodService.*(..))")
    public void methodPointCut() {
    };

    /**
     * 运行方法前
     * 
     * @param joinPoint
     */
    @Before("methodPointCut()")
    public void beforeMethod(JoinPoint joinPoint) {
	MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
	Method method = methodSignature.getMethod();
	System.out.println("【方法规则--前置通知】:" + method.getName());
    }

    /**
     * 方法返回后
     * 
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "methodPointCut()", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
	MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
	Method method = methodSignature.getMethod();
	System.out.println("【方法规则--返回通知】:" + method.getName() + ",return:" + result);
    }

    /**
     * 方法异常后
     * 
     * @param joinPoint
     */
    @AfterThrowing(value = "methodPointCut()", throwing = "e")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e) {
	MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
	Method method = methodSignature.getMethod();
	System.out.println("【方法规则--异常通知】:" + method.getName() + ",exception:" + e);
    }

    /**
     * 方法执行后，在异常和返回值之前
     * 
     * @param joinPoint
     */
    @After("execution(* DemoMethodService.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
	MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
	Method method = methodSignature.getMethod();
	System.out.println("【方法规则--后置通知】:" + method.getName());
    }
    /**
     * 环绕通知
     * @param jp
     * @return
     */
    @Around("methodPointCut()")
    public Object aroundMethod(ProceedingJoinPoint jp) {
	String methodName = jp.getSignature().getName();
	Object result = null;
	try {
	    System.out.println(
		    "【环绕通知--前置通知】：the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
	    // 执行目标方法
	    result = jp.proceed();
	    System.out.println("【环绕通知--后置通知】");
	    System.out.println("【环绕通知--返回通知】：the method 【" + methodName + "】 ends with " + result);
	} catch (Throwable e) {
	    System.out.println("【环绕通知--异常通知】：the method 【" + methodName + "】 occurs exception " + e);
	}
	return result;
    }
}
