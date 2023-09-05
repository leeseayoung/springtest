package com.penguin.spring.test.url;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {

	@GetMapping("/ajax/url/input")
	public String urlInput() {
		
		return "ajax/urlInput";
	}
	
}
