package com.penguin.spring.test.estate.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.estate.domain.Estate;

@Repository
public interface EstateRepository {
	
	//id가 맞는걸 조회
	public Estate selectEstate(@Param("id")int id);
	
	
	// 월세 조건이 맞는거							"rent" int rentPrice
	public List<Estate> selectEstateType(@Param("type")String type);
}
