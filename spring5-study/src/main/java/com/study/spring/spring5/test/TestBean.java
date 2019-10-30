package com.study.spring.spring5.test;
/**
 * 
 * @author chaozai
 * @date 2018年9月8日
 *
 */
public class TestBean {
    private String content;

    public TestBean(String content) {
	this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
