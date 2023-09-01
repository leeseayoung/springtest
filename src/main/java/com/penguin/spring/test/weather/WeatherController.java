package com.penguin.spring.test.weather;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WeatherController {

	
	@GetMapping("/weather/test")
	public String weather() {
		
		return "";
	}
	
	
	
}

