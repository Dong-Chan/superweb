package com.superweb.framework.helper;

import com.superweb.framework.annotation.Action;
import com.superweb.framework.bean.Handler;
import com.superweb.framework.bean.Request;
import com.superweb.framework.util.ArrayUtil;
import com.superweb.framework.util.CollectionUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Dong Chan
 * @date 2019/5/31
 * @time 2:39 PM
 */
public final class ControllerHelper {

    private static final Map<Request,Handler> ACTION_MAP = new HashMap<Request, Handler>();

    static {
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        if (CollectionUtil.isNotEmpty(controllerClassSet)){
            for (Class<?> controllerClass : controllerClassSet){
                Method[] methods = controllerClass.getDeclaredMethods();
                if (ArrayUtil.isNotEmpty(methods)){
                    for (Method method : methods){
                        if (method.isAnnotationPresent(Action.class)){
                            Action action = method.getAnnotation(Action.class);
                            String mapping = action.value();
                            if (mapping.matches("\\w+:/\\w*")){
                                String[] array = mapping.split(":");
                                if (ArrayUtil.isNotEmpty(array) && array.length == 2){
                                    String requestMethod = array[0];
                                    String requestPath = array[1];
                                    Request request = new Request(requestMethod,requestPath);
                                    Handler handler = new Handler(controllerClass,method);
                                    ACTION_MAP.put(request,handler);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
