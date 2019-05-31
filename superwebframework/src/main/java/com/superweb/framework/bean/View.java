package com.superweb.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * the class return view object
 * @author Dong Chan
 * @date 2019/5/30
 * @time 11:15 PM
 */
public class View {


    private String path;

    private Map<String,Object> model;

    public View(String path){
        this.path = path;
        model = new HashMap<String, Object>();
    }

    public View addModel(String key, Object value){
        model.put(key,  value);
        return this;
    }
}
