package com.VaillantgroupIotWorkshop.backendblueprint.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @RequestMapping("/t")
    public String test(){
        return ("Hello World");

    }
}
