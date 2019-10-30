package com.study.spring.spring5.config.el;

import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
/**
 * EL配置类
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Configuration
@ComponentScan("com.study.spring.spring5.config.el")
@PropertySource("classpath:config/el.properties")
public class ElConfig {
    /**
     * 注入SystemProperties内属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;
    /**
     * 注入表达式结果
     */
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    /**
     * 注入其他Bean内属性
     */
    @Value("#{someConfig.message}")
    private String otherObjMessage;
    /**
     * 注入文件资源
     */
    @Value("classpath:config/el.properties")
    private Resource testFile;
    /**
     * 注入网站资源
     */
    @Value("https://blog.csdn.net/qqchaozai")
    private Resource testUrl;
    /**
     * 注入配置文件
     */
    @Value("${code.author}")
    private String codeAuthor;
//    /**
//     * 注入配置文件--两种方式冲突，会因两次加载而触发异常
//     */
//    @Autowired
//    private Environment environment;
//
//    /**
//     * 注入配置文件
//     */
//    @Bean
//    public static PropertyPlaceholderConfigurer propertyConfigure() {
//	return new PropertyPlaceholderConfigurer();
//    }

    public void outputResource() {
	try {
	    System.out.println(osName);
	    System.out.println("------------------------------------------------------------");
	    System.out.println(randomNumber);
	    System.out.println("------------------------------------------------------------");
	    System.out.println(otherObjMessage);
	    System.out.println("------------------------------------------------------------");
	    System.out.println(IOUtils.toString(testFile.getInputStream(), Charset.forName("UTF-8")));
	    System.out.println("------------------------------------------------------------");
	    System.out.println(IOUtils.toString(testUrl.getInputStream(), Charset.forName("UTF-8")).substring(0, 100));
	    System.out.println("------------------------------------------------------------");
	    System.out.println(codeAuthor);
//	    System.out.println(environment.getProperty("code.author"));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
