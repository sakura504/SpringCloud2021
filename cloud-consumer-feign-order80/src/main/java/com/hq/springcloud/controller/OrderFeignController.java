package com.hq.springcloud.controller;

import com.hq.springcloud.entities.CommonResult;
import com.hq.springcloud.entities.Payment;
import com.hq.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lichaojie
 * @date 2021/4/13 17:23
 * @ClassName OrderFeignController
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String feignTimeout(){
        return paymentFeignService.feignTimeout();
    }
}
