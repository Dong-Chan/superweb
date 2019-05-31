package com.superweb.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dong Chan
 * @date 2019/5/31
 * @time 9:08 AM
 */
public class ClassUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

    public static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }

    /**
     * default isInitialized is true
     * @param className
     * @return
     */
    public static Class<?> loadClass(String className){
        return loadClass(className,true);
    }

    public static Class<?> loadClass(String className, boolean isInitialized){
        Class<?> cls;
        try{
            cls = Class.forName(className, isInitialized, getClassLoader());
        }catch (ClassNotFoundException e){
            LOGGER.error("load class failure.",e);
            throw new RuntimeException(e);
        }
        return cls;
    }

    /**
     * take sepecial package
     * @param packageName
     * @return
     */
    public static Set<Class<?>> getClassSet(String packageName){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        try {
            Enumeration<URL> urls = getClassLoader().getResources(packageName.replace(".", "/"));
            while (urls.hasMoreElements()){
                URL url = urls.nextElement();
                if (url != null){

                }
            }
        }catch (Exception e){
            LOGGER.error("get class set failure.",e);
            throw new RuntimeException(e);
        }
        return classSet;
    }
}
