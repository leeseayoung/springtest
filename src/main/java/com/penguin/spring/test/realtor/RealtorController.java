package com.penguin.spring.test.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.realtor.domain.Realtor;
import com.penguin.spring.test.realtor.service.RealtorService;

@Controller
public class RealtorController {

	@Autowired
	private RealtorService realtorService;
	
	@GetMapping("/jsp/test/create")
	@ResponseBody
	public String createRealtor(
			@RequestParam("office") String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade
			, Model model) {
	
		
		Realtor realtor = new Realtor();
		realtor.setOffice(office);
		realtor.setPhoneNumber(phoneNumber);
		realtor.setAddress(address);
		realtor.setGrade(grade);
		
		int count = realtorService.addRealtorByObject(realtor);
		
		model.addAttribute("Realtor", realtor);
		
		return "jsp/realtorInfo";
		
	
	}
	
	@GetMapping("/jsp/test/input")
	public String inputRealotr() {
		
		return "jsp/realtorInput";
	}
	
	
}
