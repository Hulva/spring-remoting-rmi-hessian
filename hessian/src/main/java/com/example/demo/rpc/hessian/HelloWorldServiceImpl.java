package com.example.demo.rpc.hessian;

import com.example.demo.rpc.api.HelloWorldService;

import java.util.Date;

/**
 * @author Luva
 * @description TODO
 * @date 2020/11/8 23:03
 * @since
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHelloWithHessian(String msg) {
        System.out.println("=============server side==============");
        System.out.println("msg : " + msg);
        return "Hello " + msg + " Response time :: " + new Date();
    }
}
