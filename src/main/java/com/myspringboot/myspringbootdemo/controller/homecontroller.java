package com.myspringboot.myspringbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class homecontroller {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
}
