package com.superweb.framework.util;

import com.superweb.framework.helper.ConfigHelper;
import org.junit.Test;

import java.util.Set;

/**
 * @author Dong Chan
 * @date 2019/5/31
 * @time 5:47 PM
 */

public class ClassUtilTest {

    @Test
    public void testGetClassSet(){
        Set set = ClassUtil.getClassSet("com.superweb.framework");

    }
}
