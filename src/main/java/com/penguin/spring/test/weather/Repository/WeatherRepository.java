package com.penguin.spring.test.weather.Repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.weather.domain.Weather;

@Repository
public interface WeatherRepository {

	public <List>Weather selectWeather();
	
}
