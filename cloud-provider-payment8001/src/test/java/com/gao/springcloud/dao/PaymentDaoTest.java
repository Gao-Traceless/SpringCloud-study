package com.gao.springcloud.dao;


import com.gao.springcloud.entities.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @program: cloud2020
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-24 21:05
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentDaoTest {

    @Resource
    private PaymentDao paymentDao;

    @Test
    public void getPaymentDao(){

        Payment paymentById = paymentDao.getPaymentById(31l);
        if (paymentById != null){
            System.out.println(paymentById);
        }


    }

}