package com.penguin.spring.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.jpa.domain.Company;
import com.penguin.spring.test.jpa.service.CompanyService;
@RequestMapping("/jpa/company")
@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	
	
	//추가 기능
	@GetMapping("/create")
	@ResponseBody
	public Company createCompany() {
		
		String name = "버블팡";
		String business = "여신 금융업";
		String scale = "대기업";
		int headcount = 6934;
		
		Company company = companyService.addCompany(name, business, scale, headcount);
		


		
		return company;
	}
	
	
	
	
	
	//업데이트 기능
	@GetMapping("/update")
	@ResponseBody
	public Company updateCompany() {
		
	 Company company =  companyService.updateCompany(8, "중소기업", 34);
	 
	 return company;
		
	}
	
	
	
	
	
	//삭제기능
	@GetMapping("/delete")
	@ResponseBody
	public String deleteCompany() {
		
		companyService.deleteCompany(8);
		
		return "수행 완료!";
		
	}
	
	
	
	
	
	
	
	
	
}
