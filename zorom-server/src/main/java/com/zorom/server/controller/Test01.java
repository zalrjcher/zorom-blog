package com.zorom.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test01 {
    @RequestMapping("/et")
    public String test(){
        return "hhhhhhh";
    }
}
