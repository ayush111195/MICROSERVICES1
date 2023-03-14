package com.hotel.services.services;

import java.util.List;

import com.hotel.services.entites.Hotel;

public interface HotelService {

	//create---->>
	
	Hotel create (Hotel hotel);
	
	
	//getall
	
	List<Hotel> getAll();
	
	//getsingle
	
	Hotel get(String id);
}
