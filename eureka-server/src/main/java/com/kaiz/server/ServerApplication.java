package com.kaiz.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 下午5:30 2021/3/29.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
