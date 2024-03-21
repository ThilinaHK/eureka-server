package com.thk.paymentservice;

import com.thk.paymentservice.Mythread.MyRunnable;
import com.thk.paymentservice.Mythread.MyThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);

//        MyThread myThread=new MyThread();
//        myThread.run();
//
//
//        MyRunnable myRunnable=new MyRunnable();
//        Thread thread=new Thread(myRunnable);
//        thread.start();
    }

}
