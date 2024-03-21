package com.thk.paymentservice.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class PaymentService {


    private final RestTemplate restTemplate1;


    public void checkBalance(String username) {
        log.debug("username : {} ", username);
        List<String> js = new ArrayList<>();

        @SuppressWarnings("rawtypes")
        ResponseEntity<Map> en = restTemplate1.getForEntity("http://PAYMENT-SERVICE/payment/balance", Map.class);

        if (en.getBody() == null) {
            System.err.println("Payment Service balance check xxxxxxxxx------ is Empty" + en.getBody());
        } else {
            List<String> headers = en.getHeaders().get("X-server-pot");
//			List<InstanceInfo> list= discoveryClient.getInstancesById("payment-service");
//			for (InstanceInfo instanceInfo : list) {
//				System.err.println("instanceInfo "+instanceInfo.getAppName());
//				System.err.println("instanceInfo "+instanceInfo.getCountryId());
//				System.err.println("instanceInfo "+instanceInfo.getIPAddr());
//			}
//				headers.forEach(s->{
//					System.err.println("API X-server-pot ->> = "+s);
//				});
            Map body = en.getBody();
            Long balance = (Long) body.get("balance");
            System.err.println("OrderService balance check ------ " + balance);
        }
    }

}
