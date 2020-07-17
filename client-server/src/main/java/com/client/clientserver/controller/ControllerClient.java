package com.client.clientserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameControllerClient
 * @Description
 * @Author
 * @Date2020/7/16 14:36
 * @Version V1.0
 **/
@RestController
public class ControllerClient {
    
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "peicq") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
