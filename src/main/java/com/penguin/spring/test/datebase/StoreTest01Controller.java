package com.penguin.spring.test.datebase;

import java.util.List;

import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.datebase.service.StoreTest01Service;

@Controller
public class StoreTest01Controller {
	
	//밑에 친구가 알아서 해줌 
	@Autowired
	private StoreTest01Service storeTest01Service;
	
	// Store 데이터 조회 결과 json으로 response에 채운다
	@RequestMapping("/db/store/list")
	@ResponseBody
	public List<Store> storeList() {
		
		// 데이터 얻기 컨트롤러꺼
		List<Store> storeList = storeTest01Service.getStoreList();
		// 값 리턴
		return storeList;
		
	}
	
	
	
}
