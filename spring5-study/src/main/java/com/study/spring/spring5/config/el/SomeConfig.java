package com.study.spring.spring5.config.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Component
public class SomeConfig {
    /**
     * 注入字符串
     */
    @Value("SomeConfig-message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
