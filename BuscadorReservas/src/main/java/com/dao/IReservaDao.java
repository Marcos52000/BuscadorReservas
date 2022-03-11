package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Reserva;

public interface IReservaDao extends JpaRepository<Reserva, Long> {

}
