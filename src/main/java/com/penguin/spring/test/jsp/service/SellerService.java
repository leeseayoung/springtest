package com.penguin.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	public SellerRepository sellerRepository;
	
	public int addSeller(String nickname, String profileImage, double temperature) {
		 
		int count = sellerRepository.insertSeller(nickname, profileImage, temperature);
		
		return count;
		
	}
	
	
	
	
	
	
	
	
	
	
}
