package com.penguin.spring.test.url.rpository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.url.domain.Url;

@Repository
public interface UrlRepository {

	//url 리스트
	public List<Url> selectUrlList();
	
	
	
	
	//추가 하는거                틀림 = insert 추가 안했음
	public int insertUrl(
			@Param("name") String name
			, @Param("url") String url);



	public int selectCountUrl(
			@Param("url") String url);
		

	
}
