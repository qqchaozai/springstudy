package com.study.spring.spring5.aware;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    
    private String beanName;
    private ResourceLoader loader;
    
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
	this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {
	this.beanName = name;
    }
    /**
     * 调用组合对象
     */
    public void outputResult(){
	System.out.println("Bean Name:"+beanName);
	Resource resource = loader.getResource("classpath:config/awareservice.txt");
	try {
	    System.out.println("Resource 获取文件内容："+IOUtils.toString(resource.getInputStream(),Charset.forName("UTF-8")));
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
