package com.example.demo.rpc.hessian;

import com.example.demo.rpc.api.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

/**
 * @author Luva
 * @description TODO
 * @date 2020/11/8 23:06
 * @since 1.0.0
 */
@Configuration
public class HessianConfig {
    @Bean(name = "/hellohessian")
    RemoteExporter sayHelloServiceHessian() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(new HelloWorldServiceImpl());
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }
}
