package com.service;

import java.util.List;

import com.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listaReservas();

	public Reserva addReserva(Reserva reserva);

	public Reserva updateReserva(Reserva reserva);

	public Reserva getReservaById(Long id);

	public void deleteReserva(Long id);
}
