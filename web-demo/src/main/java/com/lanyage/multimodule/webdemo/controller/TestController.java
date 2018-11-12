package com.lanyage.multimodule.webdemo.controller;

import com.lanyage.multimodule.servicedemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    @Qualifier(value = "testService")
    private TestService testService;

    @GetMapping(value = "/tests",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object tests() {
        return testService.tests();
    }
}
