package com.newtouch.cloud.service.business.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@MapperScan("com.newtouch.cloud.service.business.client.mapper")
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @GetMapping(path = "/")
    public String getName() {
        return "Just for test.";
    }
}
