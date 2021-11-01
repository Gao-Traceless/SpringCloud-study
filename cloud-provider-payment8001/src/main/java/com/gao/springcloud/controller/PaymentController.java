package com.gao.springcloud.controller;

import com.gao.springcloud.entities.Payment;
import com.gao.springcloud.service.PaymentService;
import com.gao.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-24 19:05
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果：" + result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功,serverPort:"+ serverPort, result);
        }else {
            return new CommonResult(444,"插入失败", null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        log.info("****查询结果：" + payment);

        if (payment != null){
            return new CommonResult(200,"查询数据库成功,serverPort:" + serverPort, payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID：" + id, null);
        }

    }


}
