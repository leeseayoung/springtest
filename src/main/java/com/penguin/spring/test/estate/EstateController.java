package com.penguin.spring.test.estate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.estate.domain.Estate;
import com.penguin.spring.test.estate.service.EstateService;

@Controller
@RequestMapping("/test/estate")
public class EstateController {
	
	@Autowired
	private EstateService estateService; 
	
	@RequestMapping("/select/1")
	@ResponseBody
	public Estate estate(@RequestParam("id") int id) {
		Estate estate = estateService.getEstate(id);
		return estate;
	}
		
	@RequestMapping("/select/2")
	@ResponseBody									//"rent" int rentPrice
		public List<Estate> estateType(@RequestParam("rentPrice") int rentPrice) {
			List<Estate> estateType = estateService.getEstateType(rentPrice);
			return estateType;
	}
	
	@RequestMapping("/select/3")
	@ResponseBody									
		public List<Estate> estateAreaPrice(@RequestParam("area") int area, @RequestParam("type") String type) {
			List<Estate> estateAreaPrice = estateService.getEstateAreaPrice(area, type);
			return estateAreaPrice;
	}
	
	@RequestMapping("/select/4")
	@ResponseBody
	public String insertRealEstate() {
		Estate estate = new Estate();
		estate.setRealtorId(3);
		estate.setAddress("푸르지용 리버 303동 1104호");
		estate.setArea(89);
		estate.setType("매매");
		estate.setPrice(100000);
		
		int count = estateService.addEstate(estate);
		
		return "입력 성공 : " + count;
		
		
	}
	@RequestMapping("/select/5")
	@ResponseBody
	public String insertEstate(@RequestParam("realtorId")int realtorId) {
		int count = estateService.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "입력 성공 : " + count;
	}
	
	
	// 업데이트
	@RequestMapping("/slecet/6")
	@ResponseBody
	//id가 24인
	public String updateEstate(@RequestParam("id")int id) {
		
	int count = estateService.changeEstate(id, "전세", 70000);
		
		return "입력 성공 : " + count;
	}

	
	// 삭제
	@RequestMapping("/slecet/7")
	@ResponseBody
	public String deleteEstate(@RequestParam("id")int id) {
		int count = estateService.DeleteEstate(id);
		
		return "삭제 성공 : " + count;
		
	}
	
	
	
}
