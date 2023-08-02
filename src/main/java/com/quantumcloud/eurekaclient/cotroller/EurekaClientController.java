package com.quantumcloud.eurekaclient.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EurekaClientController {

    @Value("${spring.application.name}")
    private String appname;

    @GetMapping("/demo/hello")
        public String sayhello() {

        return "hello" + appname;
    }

}