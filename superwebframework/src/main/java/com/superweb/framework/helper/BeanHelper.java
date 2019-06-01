package com.superweb.framework.helper;

import com.superweb.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dong Chan
 * @date 2019/5/31
 * @time 2:38 PM
 */
public final class BeanHelper {

    private static final Map<Class<?>,Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> beanClass : beanClassSet){
            Object obj = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass,obj);
        }
    }

    public static Map<Class<?>, Object> getBeanMap(){
        return BEAN_MAP;
    }

}
