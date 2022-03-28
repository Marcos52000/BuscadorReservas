package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Hotel;
import com.service.HotelService;

@RestController
@CrossOrigin(origins="https://main.d2ckn95sow20us.amplifyapp.com")

@RequestMapping("/api")
public class HotelController {
	@Autowired
	HotelService HotelService;

	@GetMapping("/hoteles")
	public List<Hotel> listaHotels() {
		return HotelService.listaHoteles();
	}

	@PostMapping("/hoteles")
	public Hotel addHotel(@RequestBody Hotel Hotel) {

		return HotelService.addHotel(Hotel);
	}

	@GetMapping("/hoteles/{id}")
	public Hotel getHotelById(@PathVariable(name = "id") Long id) {

		return HotelService.getHotelById(id);
	}

	@PutMapping("/hoteles/{id}")
	public Hotel updateHotel(@PathVariable(name = "id") Long id, @RequestBody Hotel hotel) {
		System.out.println(hotel);
		Hotel Hotel_seleccionado = new Hotel();
		Hotel Hotel_actualizado = new Hotel();
		
		Hotel_seleccionado = HotelService.getHotelById(id);
		Hotel_seleccionado.setNombre(hotel.getNombre());
		Hotel_seleccionado.setDireccion(hotel.getDireccion());
		Hotel_seleccionado.setTelefono(hotel.getTelefono());
		Hotel_seleccionado.setPais(hotel.getPais());
		Hotel_seleccionado.setEstrellas(hotel.getEstrellas());
		Hotel_seleccionado.setNotamedia(hotel.getNotamedia());
		Hotel_actualizado = HotelService.updateHotel(Hotel_seleccionado);

		System.out.println("El Hotel actualizado es: " + Hotel_actualizado);

		return Hotel_actualizado;
	}

	@DeleteMapping("/hoteles/{id}")
	public void deleteHotel(@PathVariable(name = "id") Long id) {
		HotelService.deleteHotel(id);
	}
}
