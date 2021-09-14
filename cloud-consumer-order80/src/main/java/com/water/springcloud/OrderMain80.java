package com.water.springcloud;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/9 20:09
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class,DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class, args);
    }

}
