package com.penguin.spring.test.url.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.url.domain.Url;
import com.penguin.spring.test.url.rpository.UrlRepository;

@Service
public class UrlService {

	
	@Autowired
	private UrlRepository urlRepository;
	
	
	//리스트
	public List<Url> getUrlList() {
		
		List<Url> urlList = urlRepository.selectUrlList();
		
		return urlList;
		
	}
	
	
	
	//저장해주는 기능
	public int addUrl(String name, String url) {
		
		int count = urlRepository.insertUrl(name, url);
		
		return count;
	}
	

	//9월6일 수업
	// 중복이 있는지 없는지 true,false
	public boolean isDuplicateUrl(String url) {
		
		int count = urlRepository.selectCountUrl(url);
		
//		if(count == 0) {
//			//중복이 없으면
//			return false;
//		} else {
//			//중복이면 count 1이상이면 
//			return true;
//		}
		
		// 이렇게도 표현 가능
		return count != 0; 
	}










}


