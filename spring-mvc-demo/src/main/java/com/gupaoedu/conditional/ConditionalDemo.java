package com.gupaoedu.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:52
 */
public class ConditionalDemo  implements Condition {
    public boolean matches(final ConditionContext conditionContext, final AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
