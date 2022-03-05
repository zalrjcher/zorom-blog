package com.zorom.server.controller;

import com.zorom.common.request.Response;
import com.zorom.common.utils.ResponseUtil;
import com.zorom.server.model.ZrmUserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class Test01 {

    @PostMapping("/login")
    public Response test(@RequestBody Map<String,String> parar){
        System.out.println(parar);
        return ResponseUtil.success("aaaaaa");
    }
}
