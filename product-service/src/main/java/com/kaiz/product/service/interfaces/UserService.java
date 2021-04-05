package com.kaiz.product.service.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 上午11:39 2021/3/30.
 */
@FeignClient("userservice:8081")
public interface UserService {
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	String hello(String name);
}
