package com.penguin.spring.test.test02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Controller {
	
	@RequestMapping("/lifecycle/test01")
	public String test03View() {
		return "lifecycle/test01";
	}
	
	
	
}
