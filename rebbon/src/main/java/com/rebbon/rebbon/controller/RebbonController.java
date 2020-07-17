package com.rebbon.rebbon.controller;

import com.rebbon.rebbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameRebbonController
 * @Description
 * @Author
 * @Date2020/7/16 14:49
 * @Version V1.0
 **/
@RestController
public class RebbonController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
