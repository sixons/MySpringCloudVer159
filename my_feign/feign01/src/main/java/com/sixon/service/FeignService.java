package com.sixon.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("service01")
public interface FeignService {
    @RequestMapping(value = "/showPort",method = RequestMethod.GET)
    String showPort(@RequestParam("name") String name);
}
