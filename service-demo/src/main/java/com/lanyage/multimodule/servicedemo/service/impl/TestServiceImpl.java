package com.lanyage.multimodule.servicedemo.service.impl;

import com.lanyage.multimodule.servicedemo.service.TestService;

import java.util.ArrayList;
import java.util.List;

public class TestServiceImpl implements TestService {
    @Override
    public List<String> tests() {
        List<String> tests = new ArrayList<>();
        tests.add("Hello");
        tests.add("World");
        tests.add("@");
        return tests;
    }
}
