package com.wangli.sleepy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleepyController {

    @RequestMapping("/")
    public String hello(){
      return "hello docker";  
    }
}
