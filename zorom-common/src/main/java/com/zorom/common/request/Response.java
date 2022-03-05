package com.zorom.common.request;

/**
 * @author lenovo
 * @title: Response
 * @projectName blog
 * @description: TODO
 * @date 2022/3/517:12
 */
public   class Response {
    private String state;
    private String describe;
    private Object data;

   public Response(String state,String describe,Object data){
        this.state=state;
        this.describe=describe;
        this.data=data;
    }
   public Response(ResponseCode code,Object data){
        this.state=code.getState();
        this.describe =code.getDescribe();
        this.data =data;
    }
}