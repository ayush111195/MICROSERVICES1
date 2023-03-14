package com.hotel.services.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hotel.services.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String >{
	
	
}
