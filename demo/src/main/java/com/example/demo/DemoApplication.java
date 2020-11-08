package com.example.demo;

import com.example.demo.rpc.api.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        HessianProxyFactoryBean invoker = new HessianProxyFactoryBean();
        invoker.setServiceUrl("http://localhost:8080/hellohessian");
        invoker.setServiceInterface(HelloWorldService.class);
        invoker.afterPropertiesSet();
        HelloWorldService helloWorldService = (HelloWorldService) invoker.getObject();
        helloWorldService.sayHelloWithHessian("Luva");
    }

}
