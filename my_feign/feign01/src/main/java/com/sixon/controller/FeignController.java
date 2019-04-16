package com.sixon.controller;

import com.sixon.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/showPort")
    public String showPort(String name){
        return feignService.showPort(name);
    }
}
