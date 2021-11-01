package com.gao.springcloud.service;


import com.gao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-24 19:00
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPayment(@Param("id")Long id);

}
