package com.penguin.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	//response에 담는다
	@ResponseBody
	//메소드위에다가 한다
	@RequestMapping("/hello/test")
	public String helloworld() {
		return "Hello World!!";
	}
	
	
	
}