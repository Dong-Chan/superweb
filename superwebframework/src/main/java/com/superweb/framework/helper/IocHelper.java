package com.superweb.framework.helper;

import com.superweb.framework.annotation.Inject;
import com.superweb.framework.util.ArrayUtil;
import com.superweb.framework.util.CollectionUtil;
import com.superweb.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Inversion of Control || Dependency Injection
 *
 * @author Dong Chan
 * @date 2019/5/31
 * @time 2:39 PM
 */
public final class IocHelper {

    static {
        Map<Class<?>,Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)){
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()){
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFiedls = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFiedls)){
                    for (Field beanField : beanFiedls){
                        if (beanField.isAnnotationPresent(Inject.class)){
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null){
                                ReflectionUtil.setField(beanInstance,beanField,beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
