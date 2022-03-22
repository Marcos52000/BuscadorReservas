package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Hotel;

public interface IHotelDao extends JpaRepository<Hotel, Long> {

}
