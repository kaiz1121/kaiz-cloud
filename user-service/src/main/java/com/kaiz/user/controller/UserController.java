package com.kaiz.user.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@RequestParam(required = false) String name) {
		if (StringUtils.isEmpty(name)) {
			name = "kaiz";
		}
		System.out.println("name:" + name);
		return "hello " +  name + ",port: " + port;
	}

}
