package com.kaiz.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 下午5:36 2021/3/29.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {
	@LoadBalanced
	@Bean(value = "restTemplate")
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
}
