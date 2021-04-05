package com.kaiz.product.controller;

import com.kaiz.product.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 下午5:37 2021/3/29.
 */
@RestController
public class ProductController {

	@Autowired
	@Qualifier(value = "restTemplate")
	private RestTemplate restTemplate;

	@Autowired
	private UserService userService;

	@GetMapping("/products")
	public String getProducts(@RequestParam String product, @RequestParam String name) {
//		String userResult = this.restTemplate.getForEntity("http://userservice:8081/hello?name=" + name,String.class, "").getBody();
		String userResult = userService.hello(name);
		return "product: " + product + ",user service info :" + userResult;
	}
}
