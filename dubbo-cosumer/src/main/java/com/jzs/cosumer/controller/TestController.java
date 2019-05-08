package com.jzs.cosumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jzs.provider.service.Demoservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference(interfaceClass = Demoservice.class,check = false,cache = "lru")
    private Demoservice demoservice;
    private
    @GetMapping("/test")
    String helloWord(){

        return demoservice.test();

    }
}
