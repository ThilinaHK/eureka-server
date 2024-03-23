package com.thk.paymentservice.Controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    String port;

//        @ResponseBody
        @GetMapping("/balance")
        public Object Test(HttpServletRequest request,
                           HttpServletResponse response){

            response.setHeader("X-server-port",port);

            return  Collections.singletonMap(
                    "balance",new Random().nextLong()+" port ------>> "+port
            );
        }

}
