package com.penguin.spring.test.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.penguin.spring.test.weather.Service.WeatherService;
import com.penguin.spring.test.weather.domain.Weather;


@Controller
public class WeatherController {

	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/weather/lest")
	public String weather(Model model) {
		
	 List<Weather> weatherHistory = weatherService.getWeatherHistory();	
		
	 model.addAttribute("WeatherHistory", weatherHistory);
		
		return "jstl/weather";
		
		
		
		
		
	
//	List<Weather> weathers = new ArrayList<>();	
//	
//	Weather weather = new Weather();
//	weather.setDay("2015년7월1일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//	weather.setTemperatures(21.9);
//	weather.setPrecipitation(83.5);
//	weather.setFinedust("보통");
//	weather.setWindspeed(2.9);
//	weathers.add(weather);
//	//비
//	weather = new Weather();
//	weather.setDay("2015년7월2일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//	weather.setTemperatures(22.6);
//	weather.setPrecipitation(59.5);
//	weather.setFinedust("보통");
//	weather.setWindspeed(2.5);
//	weathers.add(weather);
//	
//	//흐림
//	weather = new Weather();
//	weather.setDay("2015년7월3일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/cloudy.jpg");
//	weather.setTemperatures(27.4);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("좋음");
//	weather.setWindspeed(2.9);
//	weathers.add(weather);
//		
//	//맑음
//	weather = new Weather();
//	weather.setDay("2015년7월4일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg");
//	weather.setTemperatures(27.3);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("좋음");
//	weather.setWindspeed(6.1);
//	weathers.add(weather);
//	
//	//구름 조금	
//	weather = new Weather();
//	weather.setDay("2015년7월5일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg");
//	weather.setTemperatures(25.3);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("나쁨");
//	weather.setWindspeed(4.3);
//	weathers.add(weather);
//	
//	
//	weather = new Weather();
//	weather.setDay("2015년7월6일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg");
//	weather.setTemperatures(23.9);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("나쁨");
//	weather.setWindspeed(6.5);
//	weathers.add(weather);
//	
//	
//	weather = new Weather();
//	weather.setDay("2015년7월7일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg");
//	weather.setTemperatures(23.7);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("좋음");
//	weather.setWindspeed(5.8);
//	weathers.add(weather);
//	
//	weather = new Weather();
//	weather.setDay("2015년7월8일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg");
//	weather.setTemperatures(23.3);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("좋음");
//	weather.setWindspeed(5.4);
//	weathers.add(weather);
//	
//	weather = new Weather();
//	weather.setDay("2015년7월9일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//	weather.setTemperatures(20.8);
//	weather.setPrecipitation(14.0);
//	weather.setFinedust("보통");
//	weather.setWindspeed(4.0);
//	weathers.add(weather);
//	
//	weather = new Weather();
//	weather.setDay("2015년7월10일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//	weather.setTemperatures(23.7);
//	weather.setPrecipitation(16.5);
//	weather.setFinedust("보통");
//	weather.setWindspeed(2.5);
//	weathers.add(weather);
//		
//	weather = new Weather();
//	weather.setDay("2015년7월11일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//	weather.setTemperatures(26.8);
//	weather.setPrecipitation(3.0);
//	weather.setFinedust("좋음");
//	weather.setWindspeed(4.7);
//	weathers.add(weather);
//	
//	weather = new Weather();
//	weather.setDay("2015년7월12일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/rainy.jpg");
//	weather.setTemperatures(26.6);
//	weather.setPrecipitation(1.0);
//	weather.setFinedust("나쁨");
//	weather.setWindspeed(5.4);
//	weathers.add(weather);
//	
//	weather = new Weather();
//	weather.setDay("2015년7월13일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/partlyCloudy.jpg");
//	weather.setTemperatures(27.3);
//	weather.setPrecipitation(1.0);
//	weather.setFinedust("최악");
//	weather.setWindspeed(6.5);
//	weathers.add(weather);
//	
//	weather = new Weather();
//	weather.setDay("2015년7월14일");
//	weather.setImg("http://marondal.com/material/images/dulumary/web/jstl/sunny.jpg");
//	weather.setTemperatures(27.3);
//	weather.setPrecipitation(0.0);
//	weather.setFinedust("보통");
//	weather.setWindspeed(6.8);
//	weathers.add(weather);
//	
//
//	
//		
//	model.addAttribute("weatherList", weathers);	
		
		

		
	}
	// 컨트롤러 -> 서비스 -> 래파스토리 -> xml(쿼리) -> 서비스 -> 컨트롤러 -> -> -> -> -> ->
	//@ResponseBody
	
	@GetMapping("/weather/create")
	public String createWeather(
			//날짜 변경법
			// 2023년09월04일 자바한테 알려죠야됨 @DateTimeFormat(pattern="yyyy년MM월dd일") @RequestParam("date") Date date
//			@RequestParam("date") String date
//			,@RequestParam("weather") String weather
//			,@RequestParam("temperatures") double temperatures
//			,@RequestParam("precipitation") double precipitation
//			,@RequestParam("microDust") String microDust
//			,@RequestParam("windSpeed") double windSpeed
			//도메인 에서 정보를 받아 쓸수있다
			@ModelAttribute Weather weather
			) {
		
		
//		int count = weatherService.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
		//밑에 문자열을 출력할려면 리스폰스바디 죠야됨
		
		int count = weatherService.addWeather1(weather);
		
		
		return  "redirect:/weather/lest";
	}

	
	
	

	
	
	
	@GetMapping("weather/input")
	public String input() {
		
		return "jstl/weatherInput";
	}
	
}

