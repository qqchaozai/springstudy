package com.study.spring.spring5.config.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
/**
 * 
 * @author chaozai
 * @date 2018年9月6日
 *
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
    
}
