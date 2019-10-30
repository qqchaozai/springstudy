package com.study.spring.spring5.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * Windows大写W
 * @author chaozai
 * @date 2018年9月7日
 *
 */
public class WindowsCondition implements Condition{

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
	return context.getEnvironment().getProperty("os.name").contains("Windows");
    }

}