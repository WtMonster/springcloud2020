package com.water.springcloud.service.serviceImpl;

import com.water.springcloud.dao.PaymentDao;
import com.water.springcloud.entities.Payment;
import com.water.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: 大水怪
 * @date: 2021/9/8 22:24
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
