package com.example.sericefeign.feign;

import org.springframework.stereotype.Component;

/**
 * @ClassNameFeignHiImpl
 * @Description
 * @Author
 * @Date2020/7/16 16:24
 * @Version V1.0
 **/
@Component
public class FeignHiImpl implements FeignHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "feign降级";
    }
}
