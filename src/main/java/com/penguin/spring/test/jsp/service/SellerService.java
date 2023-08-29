package com.penguin.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.jsp.domain.Seller;
import com.penguin.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {
	//spring가 알아서 해준다 객체를
	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(String nickname, String profileImage, double temperature) {
		 
		int count = sellerRepository.insertSeller(nickname, profileImage, temperature);
		
		return count;
		
	}
	
	public Seller getLastSeller() {
		
		Seller seller = sellerRepository.selectLastSeller();
		
		return seller;
		
	}
	
	
	
	
	
	
	
	
}
