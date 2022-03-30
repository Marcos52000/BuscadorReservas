package com.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="Reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@JsonFormat(pattern = "dd-mm-yyyy")
	@Column(name = "fecha_entrada")//no hace falta si se llama igual
	private LocalDate fecha_entrada;
	@JsonFormat(pattern = "dd-mm-yyyy")
	@Column(name = "fecha_salida")//no hace falta si se llama igual
	private LocalDate fecha_salida;
	@Column(name = "importe")
	private int importe;
	@ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
	@ManyToOne
    @JoinColumn(name="id_hotel")
    private Hotel hotel;
	
	//constructores
	
	public Reserva() {
		super();
	}

	public Reserva(Long id, LocalDate fecha_entrada, LocalDate fecha_salida, int importe, Cliente cliente, Hotel hotel) {
		this.id = id;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.importe = importe;
		this.cliente = cliente;
		this.hotel = hotel;
	}
	
	
	//getters y setters
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public LocalDate getFecha_entrada() {
		return fecha_entrada;
	}
	public void setFecha_entrada(LocalDate fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	public LocalDate getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(LocalDate fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", Fecha_entrada=" + fecha_entrada + ", Fecha_salida="
				+ fecha_salida + ", Importe=" + importe + ", cliente=" + cliente + ", hotel=" + hotel + "]";
	}
	
	
	
	

}
