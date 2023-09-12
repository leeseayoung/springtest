package com.penguin.spring.test.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.jpa.domain.Company;
import com.penguin.spring.test.jpa.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	
	public Company addCompany(
			
			String name 
			, String business 
			, String scale 
			, int headcount ) {
		
		// 저장 기능
		Company company = Company.builder()
							.name(name)
							.business(business)
							.scale(scale)
							.headcount(headcount)
							.build();
		
		company = companyRepository.save(company);
		
		return company;
		
		
	}	
	
	
	
	
	//업데이트 기능
	public Company updateCompany(int id, String scale, int headcount) {

		//꼭 널인지 아닌지 같이 사용해야함
		Optional<Company> OptionalCompany = companyRepository.findById(id);
		// null일 경우 에 어떤 값을 리턴할지 수행하는 기능
		Company company = OptionalCompany.orElse(null);
		
		if(company != null) {
			company = company.toBuilder()
			.scale(scale)		
			.headcount(headcount)
			.build();
			
			company = companyRepository.save(company);
		}
		
		return company;
		
	}
	
	
	
	
	
	//삭제 기능
	public void deleteCompany(int id) {
												//		.ifPresent(company -> companyRepository.delete(company))
		Company company = companyRepository.findById(id).orElse(null);
		
		if(company != null) {
			
			companyRepository.delete(company);
		}
		
		
	}
	
	
	
	
	
	
}
