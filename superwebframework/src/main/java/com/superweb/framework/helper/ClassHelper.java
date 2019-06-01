package com.superweb.framework.helper;

import com.superweb.framework.annotation.Controller;
import com.superweb.framework.annotation.Service;
import com.superweb.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dong Chan
 * @date 2019/5/31
 * @time 2:38 PM
 */
public final class ClassHelper {


    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * get all class in application package.
     * @return
     */
    public static Set<Class<?>> getClassSet(){
        return CLASS_SET;
    }

    /**
     * get bean class in application package. It inclued service and controller etc.
     * @return
     */
    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }

    /**
     * get service class in application package.
     * @return
     */
    public static Set<Class<?>> getServiceClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET){
            if (cls.isAnnotationPresent(Service.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * get controller class in application package.
     * @return
     */
    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET){
            if (cls.isAnnotationPresent(Controller.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }
}
