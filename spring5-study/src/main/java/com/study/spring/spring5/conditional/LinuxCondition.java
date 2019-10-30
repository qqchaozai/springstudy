package com.study.spring.spring5.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * Linux大写L
 * @author chaozai
 * @date 2018年9月7日
 *
 */
public class LinuxCondition implements Condition{

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
	return context.getEnvironment().getProperty("os.name").contains("Linux");
    }

}
