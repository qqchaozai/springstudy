package com.study.spring.spring5.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 
 * @author chaozai
 * @date 2018年9月8日
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("dev")
public class TestApp {
    @Autowired
    TestBean bean;
    @Test
    public void devProductBeanInject(){
	String expected = "development test bean";
	String actual = bean.getContent();
	Assert.assertEquals(expected, actual);
    }
    @Test
    public void prodProductBeanInject(){
	String expected = "production test bean";
	String actual = bean.getContent();
	Assert.assertEquals(expected, actual);
    }
}
