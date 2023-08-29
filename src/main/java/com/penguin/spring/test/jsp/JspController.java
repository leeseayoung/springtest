package com.penguin.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.jsp.domain.Seller;
import com.penguin.spring.test.jsp.service.SellerService;
@RequestMapping("/jsp/test")
@Controller
public class JspController {

	@Autowired
	private SellerService sellerService;
	
	@ResponseBody
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("nickname")String nickname
			, @RequestParam("profileImage")String profileImage
			, @RequestParam("temperature")double temperature) {
		
		
		int count = sellerService.addSeller(nickname, profileImage, temperature);
		
		return "추가 성공 :" + count;
		
		
		
	}
	
	@GetMapping("/input")
	public String inputSeller() {
		
		return "jsp/sellerInput";
	}
	
	
	
	@GetMapping("/last")
	public String lastSeller(Model model) {
		
		Seller seller = sellerService.getLastSeller();
		
		model.addAttribute("seller", seller);
		
		return "jsp/sellerInfo";
	}
	
	
	
	@GetMapping("/info")					//벨류, false 생략이되었슴 null이 불가능 int는
	public String sellerInfo(@RequestParam(value="id", required=false) Integer id
			, Model model) {
		//이건 옵션 중복 코드가 없는게 유지보수에 좋음
		Seller seller = null;
		// id 파라미터가 있으면, id가 일치하는 판매자 정보
		if(id != null) {
			seller = sellerService.getSeller(id);
			
			
			
			model.addAttribute("seller", seller);
		} else {// id 파라미터가 없으면, 최근 등록된 판매자 정보
			
			seller = sellerService.getLastSeller();
			model.addAttribute("seller" , seller);

		}
		

		return "jsp/sellerInfo";
	}
	
	
	
	
	
}
