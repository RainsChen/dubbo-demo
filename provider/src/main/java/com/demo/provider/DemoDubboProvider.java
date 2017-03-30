package com.demo.provider;

import com.demo.api.HelloWorldApi;

/**
 * Created by Chenjie on 2017/3/29.
 */
public class DemoDubboProvider implements HelloWorldApi {
    @Override
    public String getHelloWorld(String name) {
        return "hello: " + name;
    }
}
