package com.penguin.spring.test.booking.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.booking.domain.Booking;

@Repository
public interface BookingRepository {

	
	//list
	public List<Booking> selectBookingList();
	
	
	//삭제 기능
	public int deleteBooking(
			@Param("name") String name);
	
}
