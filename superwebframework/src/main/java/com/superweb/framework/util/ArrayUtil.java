package com.superweb.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author Dong Chan
 * @date 2019/6/1
 * @time 7:57 AM
 */
public final class ArrayUtil {

    public static boolean isNotEmpty(Object[] array){
        return !ArrayUtils.isEmpty(array);
    }

    public static boolean isEmpty(Object[] array){
        return ArrayUtils.isEmpty(array);
    }
}
