package com.sixon.controller;

import com.sixon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/showPort")
    public String showPort(String name){
        return ribbonService.loadPortInfo(name);
    }
}
