package com.kaiz.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 下午5:35 2021/3/29.
 */
@RestController
public class UserController {
	@Value("${server.port}")
	private String port;

	@GetMapping("/hello")
	public String hello(@RequestParam(required = false) String name) {
		System.out.println("name:" + name);
		return "hello " +  name + ",port: " + port;
	}

}
