package com.superweb.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Dong Chan
 * @date 2019/5/31
 * @time 6:29 PM
 */
public class StringUtil {

    public static boolean isEmpty(String str){
        if (str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
