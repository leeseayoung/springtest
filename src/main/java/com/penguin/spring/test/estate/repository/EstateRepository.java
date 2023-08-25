package com.penguin.spring.test.estate.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.estate.domain.Estate;

@Repository
public interface EstateRepository<EstateAreaPrice> {
	
	//id가 맞는걸 조회
	public Estate selectEstate(@Param("id")int id);
	
	
	// 월세 조건이 맞는거							"rent" int rentPrice
	public List<Estate> selectEstateType(@Param("rentPrice")int rentPrice);
	
	// 넓이와 타입이 맞는거
	public List<EstateAreaPrice> selectEstateAreaPrice(@Param("area")int area, @Param("type")String type);
	
	
	
	// 객체를 이용해서 insert 하는 기능 만듬
	public int InsertEstate1(Estate estate);
	
	
	// field 로 insert 하기
	
	public int InsertEstate2(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice
			);
	
	// update 결과 보기
	public int updateEstate(
			@Param("id") int id
			, @Param("type")String type
			, @Param("price")int price 
			);
	
	
}
