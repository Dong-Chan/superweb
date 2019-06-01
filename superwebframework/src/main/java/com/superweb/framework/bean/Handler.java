package com.superweb.framework.bean;

import java.lang.reflect.Method;

/**
 * encapsulate action information
 *
 * @author Dong Chan
 * @date 2019/6/1
 * @time 8:38 AM
 */
public class Handler {

    private Class<?> controllerClass;

    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
