package com.penguin.spring.test.weather.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.weather.domain.Weather;

@Repository
public interface WeatherRepository {
	
	
	//이걸 도메인 (엔티티)
	public List<Weather> selectWeatherHistory();
	
	
	// 
	public int insertWeather(
			@Param("date") String date
			, @Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("precipitation") double precipitation
			, @Param("microDust") String microDust
			, @Param("windSpeed") double windSpeed
			
			);
	
	public int insertWeatherByObject(Weather weather);
	
}
