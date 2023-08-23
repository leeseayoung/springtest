package com.penguin.spring.test.datebase.repository;

import java.util.List;

import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

//Mybatis 프레임워크
//데이터 베이스 담당
//퀴리 수행
@Repository
public interface StoreTest01Repository {

	//store 데이터 모든행 조회
	public List<Store> selectStoreTest01List();
	
}
