package com.water.springcloud.service;

import com.water.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/8 22:22
 */
public interface  PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
