package com.water.springcloud.controller;

import com.water.springcloud.entities.CommonResult;
import com.water.springcloud.entities.Payment;
import com.water.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/8 22:27
 */
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

        log.info("*****插入结果："+result);

        if(result > 0){
            return new CommonResult(200,"插入数据库成功 serverPort:"+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);

        log.info("*****插入结果："+payment);

        System.out.println("test");

        if(payment != null){
            return new CommonResult(200,"获取数据成功 serverPort:"+serverPort,payment);
        }else{
            return new CommonResult(444,"获取数据失败 serverPort:"+serverPort,null);
        }

    }


}
