package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Reserva;
import com.service.ReservaService;
@RestController
@RequestMapping("/api")
public class ReservaController {
	
	@Autowired
	ReservaService reservaService;
	
	@GetMapping("/reservas")
	public List<Reserva> listaReservas(){
		return reservaService.listaReservas();
	}
	
	
	@PostMapping("/reservas")
	public Reserva addReserva(@RequestBody Reserva reserva) {
		return reservaService.addReserva(reserva);
	}
	
	
	@GetMapping("/reservas/{id}")
	public Reserva getReservaById(@PathVariable(name="id") Long id) {
		
		return reservaService.getReservaById(id);
	}
	
	@PutMapping("/reservas/{id}")
	public Reserva updateReserva(@PathVariable(name="id")Long id,@RequestBody Reserva reserva) {
		
		Reserva Reserva_seleccionado= new Reserva();
		Reserva Reserva_actualizado= new Reserva();
		
		Reserva_seleccionado= reservaService.getReservaById(id);
		Reserva_seleccionado.setFecha_entrada(reserva.getFecha_entrada());
		Reserva_seleccionado.setFecha_salida(reserva.getFecha_salida());
		Reserva_seleccionado.setImporte(reserva.getImporte());
		Reserva_actualizado = reservaService.updateReserva(Reserva_seleccionado);
		
		System.out.println("El Reserva actualizado es: "+ Reserva_actualizado);
		
		return Reserva_actualizado;
	}
	
	@DeleteMapping("/reservas/{id}")
	public void deleteReserva(@PathVariable(name="id")Long id) {
		reservaService.deleteReserva(id);
	}

}
