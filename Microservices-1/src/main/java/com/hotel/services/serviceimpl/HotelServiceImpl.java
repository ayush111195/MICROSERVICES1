package com.hotel.services.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.services.entites.Hotel;
import com.hotel.services.excaption.ResourceNotFindException;
import com.hotel.services.repository.HotelRepository;
import com.hotel.services.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
 private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		
		String rendomHotelId = UUID.randomUUID().toString();
		hotel.setId(rendomHotelId);;
		
		return  hotelRepository.save(hotel);
		
	
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFindException("hotel with given id id not found"));
	}

}
