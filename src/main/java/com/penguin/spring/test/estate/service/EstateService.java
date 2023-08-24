package com.penguin.spring.test.estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.estate.domain.Estate;
import com.penguin.spring.test.estate.repository.EstateRepository;

@Service
public class EstateService {

	@Autowired	// 메소드 객체 생성 할려고 밑에 코드 사용
	private EstateRepository estaterspository;
	
	public Estate getEstate(int id) {
		
		Estate estate = estaterspository.selectEstate(id);
		
		return estate;
	}
	
	
		//                            int rentPrice
	public List<Estate> getEstateType(String type) {
																	//rentPrice
		List<Estate> estateType = estaterspository.selectEstateType(type);
		
		return estateType;
		
	}
	
	
	
}
