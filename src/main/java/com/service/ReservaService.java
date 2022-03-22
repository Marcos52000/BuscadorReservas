package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IReservaDao;
import com.dto.Reserva;
@Service
public class ReservaService implements IReservaService{
	
	@Autowired
	IReservaDao iReservaDao;

	public List<Reserva> listaReservas() {
		return iReservaDao.findAll();
	}

	public Reserva addReserva(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	public Reserva getReservaById(Long id) {
		return iReservaDao.findById(id).get();
	}

	public Reserva updateReserva(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	public void deleteReserva(Long id) {
		iReservaDao.deleteById(id);
	}


}
