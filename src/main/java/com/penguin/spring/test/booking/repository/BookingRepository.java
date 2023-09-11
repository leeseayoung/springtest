package com.penguin.spring.test.booking.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.test.booking.domain.Booking;

@Repository
public interface BookingRepository {

	
	//list 여러행이니까 list
	public List<Booking> selectBookingList();
	
	
	
	
	
	
	
	
	
	//삭제 기능
	public int deleteBooking(
			@Param("id") int id);
	
	
	
	
	
	
	
	
	
	//insert 기능
	public int insertBooking(
			@Param("name") String name
			, @Param("date")Date date
			, @Param("day")int day
			, @Param("headcount")int headcount
			, @Param("phoneNumber")String phoneNumber
			, @Param("state")String state);
	
	
	
	
	
	//조회
	public Booking selectBooking(
			@Param("name") String name
			, @Param("phoneNumber")String phoneNumber);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
