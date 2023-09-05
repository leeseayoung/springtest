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
	
	
	
	public List<Url> getUrlList() {
		
		List<Url> urlList = urlRepository.selectUrlList();
		
		return urlList;
		
	}
	
	
	public int addUrl(String name, String url) {
		
		int count = urlRepository.insertUrl(name, url);
		
		return count;
	}
	
}
