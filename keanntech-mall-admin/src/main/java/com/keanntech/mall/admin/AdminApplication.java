package com.keanntech.mall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(
        scanBasePackages = {
                "com.keanntech.mall.common",
                "com.keanntech.mall.admin",
                "com.keanntech.mall.uidgenerator",
                "com.keanntech.mall.mbg"
        }
)
@MapperScan(
        basePackages = {
                "com.keanntech.mall.admin.mapper",
                "com.keanntech.mall.uidgenerator.mapper",
                "com.keanntech.mall.mbg.mapper"
        }
)
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
