package com.orderService.orderservice.extrenal.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class PaymentService {

    private final RestTemplate restTemplate;

    public PaymentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void checkBalance(String userName){
      try {
          log.debug("Username : {}",userName);
//          List<String>
//      ResponseEntity<Map> entity= restTemplate.getForEntity("http://localhost:8109/payment/balance", Map.class);
//          ResponseEntity<Map> entity= restTemplate.getForEntity("http://PAYMENT-SERVICE/payment/balance", Map.class);
//          ResponseEntity<Map> entity= restTemplate.getForEntity("http://payment-service/payment/balance", Map.class);
//        ResponseEntity<Map> entity= restTemplate.getForEntity("http://payment-api/payment/balance", Map.class);
//                  ResponseEntity<Map> entity= restTemplate.getForEntity("http://localhost:8080/payment-api/payment/balance", Map.class);

          ResponseEntity<Map> entity= restTemplate.getForEntity("http://PAYMENT-SERVICE/payment/balance", Map.class);


          Map body=entity.getBody();
          System.err.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ------------ "+body.toString());
          log.info("Balance is ::: ",body.toString());
//          Long blance= (Long) body.get("balance");
          log.debug("Balance is ::: ",body.toString());
      }catch (Exception e){
          e.printStackTrace();
      }
//      return true;
    }
}
