package com.orderService.orderservice.Controller;


import com.orderService.orderservice.extrenal.Service.PaymentService;
import com.orderService.orderservice.extrenal.Service.PaymentServiceOF;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/order")
//@AllArgsConstructor
public class OrderController {

    @Value("${server.port}")
    String port;

    private final PaymentService paymentService;
    private final PaymentServiceOF paymentServiceOF;


    OrderController(PaymentService paymentService, PaymentServiceOF paymentServiceOF) {
        this.paymentService = paymentService;
        this.paymentServiceOF = paymentServiceOF;
    }

        @GetMapping("/place")
        public Object Test(HttpServletRequest request,
                           HttpServletResponse response){
            System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            response.setHeader("X-server-port",port);

            ResponseEntity<Map<?,?>> ss= paymentServiceOF.checkBalance();


            System.err.println("#####################  "+ss.getBody().toString());

            paymentService.checkBalance("Thilina");
            return  Collections.singletonMap(
                    "msg","Success port "+ port
            );
        }

}
