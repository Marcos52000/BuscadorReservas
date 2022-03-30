package com.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "fecha_entrada")//no hace falta si se llama igual
	private String fecha_entrada;
	@Column(name = "fecha_salida")//no hace falta si se llama igual
	private String fecha_salida;
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

	public Reserva(Long id, String fecha_entrada, String fecha_salida, int importe, Cliente cliente, Hotel hotel) {
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
	public String getFecha_entrada() {
		return fecha_entrada;
	}
	public void setFecha_entrada(String fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	public String getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(String fecha_salida) {
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
