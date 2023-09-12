package com.penguin.spring.test.jpa2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	//전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
	List<Recruit> recruitList = recruitRepository.findTop1ByCompanyIdOrderByIdDesc(1);
	
	
	
	
	
	
	return recruitList;
	}
	
	
	
	
	
	
	
	
	
	
	
}

