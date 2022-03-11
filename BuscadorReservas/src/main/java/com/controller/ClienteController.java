package com.controller;

import com.service.ClienteService;

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

import com.dto.Cliente;
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listaClientes(){
		return clienteService.listaClientes();
	}
	
	
	@PostMapping("/clientes")
	public Cliente addCliente(@RequestBody Cliente cliente) {
		
		return clienteService.addCliente(cliente);
	}
	
	
	@GetMapping("/clientes/{id}")
	public Cliente getClienteById(@PathVariable(name="id") Long id) {
		
		return clienteService.getClienteById(id) ;
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@PathVariable(name="id")Long id,@RequestBody Cliente cliente) {
		
		Cliente Cliente_seleccionado= new Cliente();
		Cliente Cliente_actualizado= new Cliente();
		
		Cliente_seleccionado= clienteService.getClienteById(id);
		Cliente_seleccionado.setDNI(cliente.getDNI());
		Cliente_seleccionado.setNombre(cliente.getNombre());
		Cliente_seleccionado.setApellido(cliente.getApellido());
		Cliente_seleccionado.setTelefono(cliente.getTelefono());
		Cliente_seleccionado.setEmail(cliente.getEmail());
		
		Cliente_actualizado = Cliente_seleccionado;
		clienteService.updateCliente(Cliente_actualizado);
		System.out.println("El Cliente actualizado es: "+ Cliente_actualizado);
		
		return Cliente_actualizado;
	}
	
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable(name="id")Long id) {
		clienteService.deleteCliente(id);
	}
}
