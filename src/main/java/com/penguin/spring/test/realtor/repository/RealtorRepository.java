package com.penguin.spring.test.realtor.repository;

import org.springframework.stereotype.Repository;

import com.penguin.spring.test.realtor.domain.Realtor;

@Repository
public interface RealtorRepository {

	

	//객체를 전달받아서 인서트로 저장하는기능 정해져 있음 실행되는 행의 수
	public int insertRealtorByObject(Realtor realtor);


	


}
	
