package com.penguin.spring.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.jsp.domain.Seller;

@Repository
public interface SellerRepository {

	public int insertSeller(
			@Param("nickname") String nickname
			, @Param("profileImage") String profileImage
			, @Param("temperature") double temperature
			);
	
	
	public Seller selectLastSeller();
	
	
	
	//id 조회
	public Seller selectSeller(@Param("id") int id);
	
	
	
}
