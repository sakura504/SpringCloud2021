package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lichaojie
 * @date 2021/4/15 17:17
 * @ClassName GatWayMain9527
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatWayMain9527.class,args);
    }
}
