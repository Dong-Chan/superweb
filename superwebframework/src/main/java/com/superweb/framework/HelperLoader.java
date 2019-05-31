package com.superweb.framework;

import com.superweb.framework.helper.*;
import com.superweb.framework.util.ClassUtil;

/**
 * the class load helper of class
 *
 * @author Dong Chan
 * @date 2019/5/31
 * @time 2:37 PM
 */
public final class HelperLoader {

    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName());
        }
    }
}
