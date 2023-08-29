package com.penguin.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.jsp.service.SellerService;
@RequestMapping("/jsp/test")
@Controller
public class JspController {

	@Autowired
	public SellerService sellerService;
	
	@ResponseBody
	@GetMapping("/create")
	public String createSeller(
			@RequestParam("nickname")String nickname
			, @RequestParam("profileImage")String profileImage
			, @RequestParam("temperature")double temperature) {
		
		
		int count = sellerService.addSeller(nickname, profileImage, temperature);
		
		return "추가 성공 :" + count;
		
		
		
	}
	
	@GetMapping("/input")
	public String inputSeller() {
		
		return "jsp/selleruInput";
	}
	
	
}
