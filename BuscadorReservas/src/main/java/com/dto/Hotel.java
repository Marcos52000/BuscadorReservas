package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "direccion")//no hace falta si se llama igual
	private String direccion;
	@Column(name = "telefono")
	private int telefono;
	@Column(name = "pais")
	private String pais;
	@Column(name = "estrellas")
	private int estrellas;
	@Column(name = "notamedia")
	private double notamedia;
	@Column(name = "precio")
	private double precio;
	@Column(name = "imagen")
	private String imagen;
	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> reserva;
	
	
	//contructores
	public Hotel() {
		super();
	}

	public Hotel(Long id, String nombre, String direccion, int telefono, String pais, int estrellas, double notamedia,
			double precio, String imagen, List<Reserva> reserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.pais = pais;
		this.estrellas = estrellas;
		this.notamedia = notamedia;
		this.precio = precio;
		this.imagen = imagen;
		this.reserva = reserva;
	}


	//getters y setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public double getNotamedia() {
		return notamedia;
	}

	public void setNotamedia(double notamedia) {
		this.notamedia = notamedia;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")

	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	//toString
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", pais=" + pais + ", estrellas=" + estrellas + ", notamedia=" + notamedia + ", precio=" + precio
				+ ", imagen=" + imagen + ", reserva=" + reserva + "]";
	}



	

	
	
	

	

	
	
	
	
	
	
}
