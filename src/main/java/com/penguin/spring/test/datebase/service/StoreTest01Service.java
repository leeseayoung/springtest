package com.penguin.spring.test.datebase.service;

import java.util.List;

import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.datebase.repository.StoreTest01Repository;

@Service
public class StoreTest01Service {

	
	@Autowired
	private StoreTest01Repository storeTest01Repository;
	
	//store 모든 데이터 조회
	public List<Store> getStoreList() {
		
		
		List<Store> storeList = storeTest01Repository.selectStoreTest01List();
		return storeList;							
	}
	
}
