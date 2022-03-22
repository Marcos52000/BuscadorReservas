package com.service;

import java.util.List;

import com.dto.Cliente;

public interface IClienteService {

	public List<Cliente> listaClientes();

	public Cliente addCliente(Cliente cliente);
	
	public Cliente updateCliente(Cliente cliente);
	
	public Cliente getClienteById(Long id);

	public void deleteCliente(Long id);
}
