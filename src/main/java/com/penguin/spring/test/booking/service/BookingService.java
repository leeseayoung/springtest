package com.penguin.spring.test.booking.service;

import java.util.Date;
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
	
	
	
	//삭제 기능
	public int deleteBooking(int id) {
		
		int count = bookingRepository.deleteBooking(id);
		
		return count;
	}
	
	
	
	
	//추가 기능
	public int addBooking(
			String name
			, Date date
			, int day
			, int headcount
			, String phoneNumber) {
			
		
																					// input에 없는데 추가 해야하면 이렇게 임시로 넣어두됨
			int count =	bookingRepository.insertBooking(name, date, day, headcount, phoneNumber, "대기중");
	
			return count;
	}
	
	
	
	
	// 조회 기능 (8일)
	
	public Booking getBooking1(String name, String phonenumber) {
		
		Booking booking = bookingRepository.selectBooking(name, phonenumber);
		
		return booking;
	}
	
	
	
	
	
	
	
}
