package com.penguin.spring.test.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.penguin.spring.test.booking.domain.Booking;
import com.penguin.spring.test.booking.service.BookingService;

@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	
	
	//리스트
	@GetMapping("/booking/list")
	public String bookingList(Model model) {
		
		List<Booking> bookingList = bookingService.getBooking();
		
		model.addAttribute("bookingList", bookingList);
		
		return "/ajax/booking/list";
		
		
	}
}
