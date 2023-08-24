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
	
	@RequestMapping("/1")
	@ResponseBody
	public Estate estate(@RequestParam("id") int id) {
		Estate estate = estateService.getEstate(id);
		return estate;
	}
		
	@RequestMapping("/2")
	@ResponseBody									//"rent" int rentPrice
		public List<Estate> estateType(@RequestParam("rentPrice") int rentPrice) {
			List<Estate> estateType = estateService.getEstateType(rentPrice);
			return estateType;
	}
	
	@RequestMapping("/3")
	@ResponseBody									//"rent" int rentPrice
		public List<Estate> estateAreaPrice(@RequestParam("area") int area, @RequestParam("type") String type) {
			List<Estate> estateAreaPrice = estateService.getEstateAreaPrice(area, type);
			return estateAreaPrice;
	}
	
	
}
