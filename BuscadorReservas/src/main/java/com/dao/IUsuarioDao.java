package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Usuario;

public interface IUsuarioDao extends JpaRepository <Usuario,Integer> {
Usuario findByEmail(String email);
}
