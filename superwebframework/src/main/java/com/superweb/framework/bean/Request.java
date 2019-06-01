package com.superweb.framework.bean;

/**
 * encapsulate request infomation
 *
 * @author Dong Chan
 * @date 2019/6/1
 * @time 8:34 AM
 */
public class Request {

    private String requestMethod;

    private String requestPath;

    public Request(String requestMethod,String requestPath){
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }


}
