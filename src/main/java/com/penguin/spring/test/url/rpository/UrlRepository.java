package com.penguin.spring.test.url.rpository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.url.domain.Url;

@Repository
public interface UrlRepository {

	//url 리스트
	public List<Url> selectUrlList();
	
	
	//추가 하는거
	public int insertUrl(
			@Param("name") String name
			, @Param("url") String url);



		
		

	
}
