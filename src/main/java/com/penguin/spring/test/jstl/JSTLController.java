package com.penguin.spring.test.jstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/jstl")
@Controller
public class JSTLController {

	@GetMapping("/test01")
	public String jstlTest01() {
		
		return "/jstl/jstlTest01";
	}
	
	
	
	@GetMapping("/test02")
	public String jstlTest02(Model model) {
		
		
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		
		
		model.addAttribute("musicList", musicRanking);
		
		
		return "/jstl/jstlTest02";
	}


}
