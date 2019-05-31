package com.superweb.framework.helper;

import com.superweb.framework.util.ClassUtil;

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
}
