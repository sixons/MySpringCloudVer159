package com.sixon.hystrix;

import com.sixon.service.FeignService;

public class FeignHystrix implements FeignService {
    @Override
    public String showPort(String name) {
        return null;
    }
}
