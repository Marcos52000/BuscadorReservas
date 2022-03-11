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
@Table(name="Cliente")
public class Cliente {
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name ="dni")
		private String dni;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "apellido")//no hace falta si se llama igual
		private String apellido;
		@Column(name = "telefono")
		private String telefono;
		@Column(name = "email")
		private String email;
		@OneToMany
	    @JoinColumn(name="id")
	    private List<Reserva> reserva;

		//constructores
		
		public Cliente() {
			super();
		}
		
		public Cliente(Long id, String dNI, String nombre, String apellido, String telefono, String email,
				List<Reserva> reserva) {
			this.id = id;
			this.dni = dNI;
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
			this.email = email;
			this.reserva = reserva;
		}

		//getters y setters
		
		public Long getid() {
			return id;
		}

		public void setid(Long id) {
			this.id = id;
		}

		public String getDNI() {
			return dni;
		}

		public void setDNI(String dNI) {
			this.dni = dNI;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
		public List<Reserva> getReserva() {
			return reserva;
		}

		public void setReserva(List<Reserva> reserva) {
			this.reserva = reserva;
		}

		//toString
		
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", DNI=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
					+ ", Telefono=" + telefono + ", Email=" + email + ", reserva=" + reserva + "]";
		}
		
	
		
		

		
		
		
		
		
		
			
}
