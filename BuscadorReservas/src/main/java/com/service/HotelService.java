package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IHotelDao;
import com.dto.Hotel;

@Service
public class HotelService implements IHotelService{
	
	@Autowired
	IHotelDao iHotelDao;

	public List<Hotel> listaHoteles() {
		return iHotelDao.findAll();
	}

	public Hotel addHotel(Hotel hotel) {
		return iHotelDao.save(hotel);
	}

	public Hotel getHotelById(Long id) {
		return iHotelDao.findById(id).get();
	}

	public Hotel updateHotel(Hotel Hotel) {
		return iHotelDao.save(Hotel);
	}

	public void deleteHotel(Long id) {
		iHotelDao.deleteById(id);
	}


}
