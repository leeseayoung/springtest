package com.penguin.spring.test.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSTLController {

	@GetMapping("/jstl/test")
	public String jstlTest01() {
		
		return "jstl/jstlTest01";
	}
}
