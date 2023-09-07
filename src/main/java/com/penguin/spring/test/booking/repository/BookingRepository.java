package com.penguin.spring.test.booking.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.penguin.spring.test.booking.domain.Booking;

@Repository
public interface BookingRepository {

	
	//list
	public List<Booking> selectBookingList();
}
