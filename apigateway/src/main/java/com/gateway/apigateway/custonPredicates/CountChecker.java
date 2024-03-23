package com.gateway.apigateway.custonPredicates;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.function.Predicate;


public class CountChecker{}

//@Slf4j
//@Component
//public class CountChecker extends
//        AbstractRoutePredicateFactory<CountChecker.Config> {
//
//
//	public CountChecker(Class<Config> configClass) {
//		super(configClass);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Data
//	@NoArgsConstructor
//	public static class Config{
//		private Integer maxCount;
//	}
//
//	@Override
//	public Predicate<ServerWebExchange> apply(Config config) {
//		// TODO Auto-generated method stub
//		return exchange ->{
//			HttpHeaders headers=exchange.getRequest().getHeaders();
//			if (	headers.containsKey("X-count") ||
//					Integer.parseInt(headers.get("X-count").get(0)) >config.getMaxCount() 	) {
//				return true;
//			}else {
//				return false;
//			}
//
//
//		};
//	}
//}

