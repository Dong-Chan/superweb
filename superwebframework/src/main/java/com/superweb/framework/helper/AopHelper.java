package com.superweb.framework.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Aspect-Oriented Programming
 * @author Dong Chan
 * @date 2019/5/31
 * @time 2:38 PM
 */
public final class AopHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(AopHelper.class);

    static {
        Map<Class<?>, Set<Class<?>>> proxyMap = createProxyMap();
    }

    private static Map<Class<?>, Set<Class<?>>> createProxyMap(){
        Map<Class<?>, Set<Class<?>>> proxyMap = new HashMap<Class<?>, Set<Class<?>>>();
        addAspectProxy(proxyMap);
        addTransactionProxy(proxyMap);
        return proxyMap;
    }

    private static void addAspectProxy(Map<Class<?>, Set<Class<?>>> proxyMap){

    }

    private static void addTransactionProxy(Map<Class<?>, Set<Class<?>>> proxyMap){

    }
}
