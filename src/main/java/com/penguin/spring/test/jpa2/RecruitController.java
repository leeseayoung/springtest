package com.penguin.spring.test.jpa2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.jpa2.Repository.RecruitRepository;
import com.penguin.spring.test.jpa2.domain.Recruit;

@Controller
public class RecruitController {

	
	@Autowired
	private RecruitRepository recruitRepository;
	
	
	
	
	@GetMapping("/recruit/select")
	@ResponseBody
	public List<Recruit> selectRecruit() {
		
		
	//id가 8인
//	List<Recruit> recruitList = recruitRepository.findById(8);
//	Optional<Recruit> optionalRecruit = recruitRepository.findById(8);
//	Recruit recruit = optionalRecruit.orElse(null);
	
	
	//전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
//	List<Recruit> recruitList = recruitRepository.findTop1ByCompanyIdOrderByIdDesc(1);

	//정규직 포지션 중복 찾기
//	List<Recruit> recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
	
		
	//정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
//	List<Recruit> recruitList = recruitRepository.findByTypeOrSalaryBetween("정규직", 9000, 20000);
	
	
	//계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
//	List<Recruit> recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
	
	
	//성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
	List<Recruit> recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
	
	//마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
//	List<Recruit> recruitList = recruitRepository.findBySalaryAndTypeQuery(8100, "정규직", "2026-04-10");
	

	
	
	return recruitList;
	
	}
	
	
	@GetMapping("/recruit/select2")
	@ResponseBody
	public List<Recruit> jpaTest02(@RequestParam("companyId") int companyId) {
		
		List<Recruit> recruitList = recruitRepository.findByCompanyId(companyId);
		
		return recruitList;
	}
	
	
	@GetMapping("/recruit/select3")
	@ResponseBody
	public List<Recruit> jpaTest03() {
		
		List<Recruit> recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		return recruitList;
		
	}
	
	@GetMapping("/recruit/select4")
	@ResponseBody
	public List<Recruit> jpaTest04() {
		
		
		List<Recruit> recruitList = recruitRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
				
			
		return recruitList;
		
		
	}
	
	
	@GetMapping("/recruit/select5")
	@ResponseBody
	public List<Recruit> jpaTest05() {
		
		List<Recruit> recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
		
		
		return recruitList;
		
	}
	
	
	@GetMapping("/recruit/select6")
	@ResponseBody
	public List<Recruit> jpaTest06() {
		
		
		List<Recruit> recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		
		return recruitList;
		
	}
	
	
	
	
	@GetMapping("/recruit/select7")
	@ResponseBody
	public List<Recruit> jpaTest07() {
		List<Recruit> recruitList = recruitRepository.findBySalaryAndTypeAndDeadlineQuery(8100, "정규직", "2026-04-10");
				
		return recruitList;
	}
	
	

}

