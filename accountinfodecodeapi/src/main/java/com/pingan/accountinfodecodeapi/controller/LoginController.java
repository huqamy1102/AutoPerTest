package com.pingan.accountinfodecodeapi.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RestController()
public class LoginController {

    private static final String PUBLIC_KEY = "";

    @RequestMapping(value = "/info")
    public Map<String, String> getDecodedInfo(String info, String key){
        Map<String, String> result = new HashMap<>();
        result.put("hello","world");
        return result;


    }
}
