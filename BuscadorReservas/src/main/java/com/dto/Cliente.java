package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
		@OneToMany
	    @JoinColumn(name="id")
	    private List<Reserva> reserva;
		@ManyToOne
	    @JoinColumn(name="id_user")
	    private Usuario usuario;
		
		//constructores
		
		public Cliente(Long id, String dni, String nombre, String apellido, String telefono, List<Reserva> reserva,
				Usuario usuario) {
			super();
			this.id = id;
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
			this.reserva = reserva;
			this.usuario = usuario;
		}

		public Cliente() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
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

		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
		public List<Reserva> getReserva() {
			return reserva;
		}

		public void setReserva(List<Reserva> reserva) {
			this.reserva = reserva;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		@Override
		public String toString() {
			return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
					+ ", telefono=" + telefono + ", reserva=" + reserva + ", Usuario=" + usuario + "]";
		}
		

		
		
		
		
	
		
		

		
		
		
		
		
		
			
}
