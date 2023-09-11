package com.penguin.spring.test.booking;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
	public Map<String, String> deleteBooking(@RequestParam("id")int id) {
		int count = bookingService.deleteBooking(id);
		
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
	
	
	
	//추가 기능
	@GetMapping("/create")
	@ResponseBody
	public Map<String, String> createBooking(
			@RequestParam("name") String name
			// 2023년 09 08일
			, @DateTimeFormat(pattern="yyyy년MM월dd일")@RequestParam("date") Date date
			, @RequestParam("day") int day
			, @RequestParam("headcount") int headcount
			, @RequestParam("phoneNumber") String phoneNumber) {
		
	 int count = bookingService.addBooking(name, date, day, headcount, phoneNumber);
	 
	 //성공 했을때 
	 // 성공 : {result : success}
  	 // 실패 : {result : fail}
	 
	 
	Map<String, String> resultMap = new HashMap<>();
	if(count == 1) {
		resultMap.put("result", "success");
	} else {
		resultMap.put("result", "fail");
	}
	
	 return resultMap;
	 
	}
	
	
	
	
	
	// 이름과 전화번호를 전달 받고,
	// 일치하는 예약 번호를 response에 json으로 담아주는 API
	@GetMapping("/search")
	@ResponseBody
	public Map<String, Object> searchBooking(
			@RequestParam("name") String name
			, @RequestParam("phoneNumber") String phoneNumber) {
		
		
		Booking booking = bookingService.getBooking1(name, phoneNumber);
		
		// 응답 json에 조화된 데이터가 있는지 없는지 정보를 명확하게 정의 한다.
		
		//성공 실패 여부 성공을 하면 밑에가 출력 하게 실패하면 실패 했다라고 나오게 설정 하기!!

		//{"name" : 김인규 date: 2023-12-12 , day: ....} 
		
		// 조회 성공시{result : success, "booking" : "name" : 김인규 date: 2023-12-12 , day: ....}
		// 조회 실패시{result : fail}
		
		Map<String, Object> resultMap = new HashMap<>();
		if(booking != null) {
			resultMap.put("result", "success");
			resultMap.put("booking", booking);
		} else {
			resultMap.put("result", "fail");
			
		}
		
		return resultMap;
	}
	
	
	
	
	
	
	
	
	
}
