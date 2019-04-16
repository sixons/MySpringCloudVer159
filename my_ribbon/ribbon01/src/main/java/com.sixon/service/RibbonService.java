package com.sixon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String loadPortInfo(String name){
        return restTemplate.getForObject("http://service01/showPort?name="+name,String.class);
    }
}
