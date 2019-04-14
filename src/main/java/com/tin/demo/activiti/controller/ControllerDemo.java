package com.tin.demo.activiti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tin on 2019/04/13.
 */
@RestController
@RequestMapping("/test")
public class ControllerDemo {

    @RequestMapping("/hello")
    public Object hello() {
        return "Hello World!";
    }
}
