package com.penguin.spring.test.estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.estate.domain.Estate;
import com.penguin.spring.test.estate.repository.EstateRepository;

@Service
public class EstateService<EstateAreaPrice> {

	@Autowired	// 메소드 객체 생성 할려고 밑에 코드 사용
	private EstateRepository estaterspository;
	
	public Estate getEstate(int id) {
		
		Estate estate = estaterspository.selectEstate(id);
		
		return estate;
	}
	
	
		//                            int rentPrice
	public List<Estate> getEstateType(int rentPrice) {
																	//rentPrice
		List<Estate> estateType = estaterspository.selectEstateType(rentPrice);
		
		return estateType;
		
	}
	
	public List<EstateAreaPrice> getEstateAreaPrice(int area, String type) {
		
		List<EstateAreaPrice> estateAreaPrice = estaterspository.selectEstateAreaPrice(area, type);
		
		return estateAreaPrice;
	}
	
	// 전달 받은 객체 저장
	public int addEstate(Estate estate) {
		
		int count = estaterspository.InsertEstate1(estate);
		return count;
	}
	
	
	
	// 전달 받은 리뷰 내용 저장 기능
	public int addRealEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
		
		int count = estaterspository.InsertEstate2(realtorId, address, area, type, price, rentPrice);
		
		return count;
	}
	
	// 업데이트
	public int changeEstate(int id, String type, int price) {
		
		int count = estaterspository.updateEstate(id, type, price);
		
		return count;
		
	}
	
	public int DeleteEstate(int id) {
		 int count = estaterspository.deleteEstate(id);
		 
		 return count;
		 
	}
	
}
