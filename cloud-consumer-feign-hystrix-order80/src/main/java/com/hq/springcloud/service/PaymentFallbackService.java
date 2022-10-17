package com.hq.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lichaojie
 * @date 2021/4/14 14:58
 * @ClassName PaymentFallbackService
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
