package com.example.sericefeign.web;

import com.example.sericefeign.feign.FeignHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameHiController
 * @Description
 * @Author
 * @Date2020/7/16 15:45
 * @Version V1.0
 **/
@RestController
public class HiController {
    @Autowired
    FeignHi feign;

    @GetMapping(value = "/he")
    public String sayHi(@RequestParam String name) {
        return feign.sayHiFromClientOne( name );
    }
}
