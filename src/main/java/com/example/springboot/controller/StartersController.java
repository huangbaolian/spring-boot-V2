package com.example.springboot.controller;


import com.demo.starter.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StartersController {
    @Resource
    private DemoService demoService;
    @GetMapping("/say")
    public String getStarterTest(){
       return demoService.say();
    }
}
