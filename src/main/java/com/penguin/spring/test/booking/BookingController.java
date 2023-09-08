package com.penguin.spring.test.booking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.test.booking.domain.Booking;
import com.penguin.spring.test.booking.service.BookingService;
@RequestMapping("/booking")
@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	
	
	//리스트
	@GetMapping("/list")
	public String bookingList(Model model) {
		
		List<Booking> bookingList = bookingService.getBooking();
		
		model.addAttribute("bookingList", bookingList);
		
		return "/ajax/booking/list";
		
		
	}
	
	
	//input
	@GetMapping("/input")
	public String bookingInput() {
		
		return "ajax/booking/input";
	}
	
	
	
	//홈페이지
	@GetMapping("/homepage")
	public String bookingHomepage() {
		
		return "ajax/booking/homepage";
	}
	
	
	// 삭제 기능
	@ResponseBody
	@GetMapping("/delete")
	public Map<String, String> deleteBooking(@RequestParam("name")String name) {
		int count = bookingService.deleteBooking(name);
		
		//json 
		// 성공 : {"result": "success"}
		// 실패 : {"result": "fail"}
		
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {
			//성공
			resultMap.put("result", "success");
		} else {
			//실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
