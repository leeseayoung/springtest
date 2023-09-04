package com.penguin.spring.test.weather.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.weather.Repository.WeatherRepository;
import com.penguin.spring.test.weather.domain.Weather;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;
	
	public <List>Weather getWeather() {
		
		Weather weather = weatherRepository.selectWeather();
		
		return weather;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

