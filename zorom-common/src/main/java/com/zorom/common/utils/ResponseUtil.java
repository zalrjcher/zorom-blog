package com.zorom.common.utils;

import com.zorom.common.request.Response;
import com.zorom.common.request.ResponseCode;
import com.zorom.common.request.ZrmResponseCode;

/**
 * @author lenovo
 * @title: ResponseUtil
 * @projectName blog
 * @description: TODO
 * @date 2022/3/516:49
 */
public class ResponseUtil {

    public static Response success(Object data){
        return new Response(ZrmResponseCode.SUCCESS,data);
    }
    public static  Response error(ResponseCode code , Object data){
          return  new Response(code,data);
    }
    public static Response systemError(){
        return  new Response(ZrmResponseCode.SYSTEM_ERROR,null);
    }



}
