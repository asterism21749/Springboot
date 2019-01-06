package com.dhee.mybatisdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(String name, String password) {

		System.out.println(name + "===" + password);
		return "hello";
	}
}
