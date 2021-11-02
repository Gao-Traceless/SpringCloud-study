package com.gao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-11-02 22:58
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8004.class, args);

    }

}
