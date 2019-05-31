package com.superweb.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * action annotation class
 * @author Dong Chan
 * @date 2019/5/30
 * @time 11:13 PM
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {

    /**
     * value is a request and path.
     * @return
     */
    String value();
}
