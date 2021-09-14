package com.water.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/10 20:53
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args){
        SpringApplication.run(EurekaMain7001.class, args);
    }

}
