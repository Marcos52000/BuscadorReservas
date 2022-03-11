package com.service;

import java.util.List;

import com.dto.Hotel;


public interface IHotelService {

	public List<Hotel> listaHoteles();

	public Hotel addHotel(Hotel hotel);
	
	public Hotel updateHotel(Hotel hotel);
	
	public Hotel getHotelById(Long id);

	public void deleteHotel(Long id);
}
