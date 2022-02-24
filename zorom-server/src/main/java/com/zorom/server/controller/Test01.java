package com.zorom.server.controller;

import com.zorom.server.model.ZrmUserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test01 {
    @RequestMapping("/et")
    public String test(){
        ZrmUserInfo zrmUserInfo = new ZrmUserInfo();
        zrmUserInfo =zrmUserInfo.selectById(1001);
        System.out.println(zrmUserInfo.getAge());
        return "hhhhhhh";
    }
}
