package com.example.jettytest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "Hello world";
    }


    @GetMapping("/test")
    public String login(){
        return "admin";
    }
}
