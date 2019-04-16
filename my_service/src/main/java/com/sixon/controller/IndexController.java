package com.sixon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/showPort",method = RequestMethod.GET)
    public String showPort(@RequestParam("name") String name){
        return "hello,"+name+",you see this from port -> "+port;
    }

}
