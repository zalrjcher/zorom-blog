package com.zorom.common.request;

/**
 * @author lenovo
 * @title: ResultCode
 * @projectName blog
 * @description: TODO
 * @date 2022/3/516:09
 */
public enum ZrmResponseCode implements ResponseCode {
    SUCCESS("SUCCESS", "处理成功"),
    MESSAGE_ERROR("MESSAGE_ERROR", "操作失败，请稍后再试"),
    MESSAGE_SUCCESS("MESSAGE_SUCCESS", "处理成功"),
    SERVER_ERROR("SERVER_ERROR", "服务器忙，请稍后再试"),
    NO_FOUND("NO_FOUND", "您访问的资源不存在"),
    FORBIDDEN("FORBIDDEN", "您没的权限访问此资源"),
    NO_LOGIN("NO_LOGIN", "您还没有登录，请先登录"),
    SYSTEM_ERROR("SYSTEM_ERROR","系统异常请联系管理员");
    private String state;
    private String describe;

    /**
     *
     * @param state 响应吗
     * @param describe 描述
     */
    ZrmResponseCode(String state,String describe){
    this.state=state;
    this.describe=describe;
    }

    public String getState() {
        return state;
    }


    public String getDescribe() {
        return describe;
    }

}
