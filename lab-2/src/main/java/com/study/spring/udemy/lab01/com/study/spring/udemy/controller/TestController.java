package com.study.spring.udemy.lab01.com.study.spring.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String test() {
        return "hello";
    }

}
