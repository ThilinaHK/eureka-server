package com.eurekaserver.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
@EnableEurekaServer
//@EnableAdminServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("============== "+Arrays.toString(args));
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
