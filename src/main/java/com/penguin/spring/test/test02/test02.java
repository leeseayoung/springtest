package com.penguin.spring.test.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test02 {
	
	
	@RequestMapping("/test/test02/1")
	public List<Map<String, Object>> moveieList() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movieMap = new HashMap<>();
		movieMap.put("rate", "15");
		movieMap.put("director", "봉준호");
		movieMap.put("time", "131");
		movieMap.put("title", "기생충");
		
		movieList.add(movieMap);
		
		
		Map<String, Object> movieMap1 = new HashMap<>();
		movieMap1.put("rate", "0");
		movieMap1.put("director", "로베르토 베나니");
		movieMap1.put("time", "116");
		movieMap1.put("title", "인생은 아름다워");
		
		movieList.add(movieMap1);
		
		Map<String, Object> movieMap2 = new HashMap<>();
		movieMap2.put("rate", "12");
		movieMap2.put("director", "크리스토퍼 놀란");
		movieMap2.put("time", "147");
		movieMap2.put("title", "인셉션");
		
		movieList.add(movieMap2);
		
		return movieList;
		
		 // 여기부터 공부 하셈
//		Map<String, Object> movieMap3 = new HashMap<>();
//		map3.put("rate", "19");
//		map3.put("director", "윤종빈");
//		map3.put("time", "133");
//		map3.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
//		
//		
//		Map<String, Object> map4 = new HashMap<String, Object>();
//		map4.put("rate", "15");
//		map4.put("director", "프란시스 로렌스");
//		map4.put("time", "137");
//		map4.put("title", "헝거게임");
		
		
		
	}
	
	
	
	
}
