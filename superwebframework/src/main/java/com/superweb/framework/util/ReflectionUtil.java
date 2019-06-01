package com.superweb.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * @author Dong Chan
 * @date 2019/6/1
 * @time 1:18 AM
 */
public class ReflectionUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * create instance
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls){
        Object instance;
        try{
            instance = cls.newInstance();
        }catch (Exception e){
            LOGGER.error("new instance failure.",e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     *
     * @param obj
     * @param field
     * @param value
     */
    public static void setField(Object obj, Field field, Object value){
        try {
            field.setAccessible(true);
            field.set(obj,value);
        }catch (Exception e){
            LOGGER.error("set field failure.",e);
            throw new RuntimeException(e);
        }
    }
}
