package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
