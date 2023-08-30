package com.penguin.spring.test.realtor.repository;

import org.springframework.stereotype.Repository;

import com.penguin.spring.test.realtor.domain.Realtor;

@Repository
public interface RealtorRepository {

	

	
	public int insertRealtorByObject(Realtor realtor);


	public Realtor selectLastRealtor();


}
	
