package com.gao.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-11-03 11:50
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPost;


    @RequestMapping(value = "/payment/consul")
    public String paymantConsul(){
        return "springcloud with consul:" + serverPost + "\t" + UUID.randomUUID().toString();
    }


}
