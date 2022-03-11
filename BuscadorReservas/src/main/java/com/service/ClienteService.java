package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IClienteDao;
import com.dto.Cliente;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	IClienteDao iClienteDao;

	public List<Cliente> listaClientes() {
		return iClienteDao.findAll();
	}

	public Cliente addCliente(Cliente cliente) {
		return iClienteDao.save(cliente);
	}

	public Cliente getClienteById(Long id) {
		return iClienteDao.findById(id).get();
	}

	public Cliente updateCliente(Cliente Cliente) {
		return iClienteDao.save(Cliente);
	}

	public void deleteCliente(Long id) {
		iClienteDao.deleteById(id);
	}

	
}
