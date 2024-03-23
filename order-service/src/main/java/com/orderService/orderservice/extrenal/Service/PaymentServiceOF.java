package com.orderService.orderservice.extrenal.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentServiceOF {

    @GetMapping("/payment/balance")
    ResponseEntity<Map<?,?>> checkBalance();
}
