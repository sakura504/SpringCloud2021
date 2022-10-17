package com.hq.springcloud.service.impl;

import com.hq.springcloud.dao.PaymentDao;
import com.hq.springcloud.entities.Payment;
import com.hq.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lichaojie
 * @date 2021/4/8 11:28
 * @ClassName PaymentServiceImpl
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
