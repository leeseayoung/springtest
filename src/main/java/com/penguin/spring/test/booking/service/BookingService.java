package com.penguin.spring.test.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.test.booking.domain.Booking;
import com.penguin.spring.test.booking.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	//리스트
	public List<Booking> getBooking() {
		
		List<Booking> bookingList =  bookingRepository.selectBookingList();
		
		 
		return bookingList;
	}
	
	
	public int deleteBooking(String name) {
		
		int count = bookingRepository.deleteBooking(name);
		
		return count;
	}
	
	
	
	
	
	
	
	
}
