package com.payments.hrpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPayApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrPayApplication.class, args);
    }

}
