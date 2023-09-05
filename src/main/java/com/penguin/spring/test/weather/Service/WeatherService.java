package com.penguin.spring.test.weather.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.weather.Repository.WeatherRepository;
import com.penguin.spring.test.weather.domain.Weather;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeatherHistory() {
		
		 List<Weather> weatherHistory = weatherRepository.selectWeatherHistory();
		
		return weatherHistory;
		
	}
	
	public int addWeather(
			String date
			, String weather
			, double temperatures
			, double precipitation
			,String microDust
			, double windSpeed) {
		
		int count = weatherRepository.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
	
	    return count;
	}
	
	
	public int addWeather1(Weather weather) {
		int count = weatherRepository.insertWeatherByObject(weather);
		
		return count;
	}
	
	
}

