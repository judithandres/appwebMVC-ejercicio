package com.formacion.web.mvc.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="empleados")
public class Empleado implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, length=50)
	private String nombre;
	@Column(nullable=false, length=50)
	private String apellidos;
	@Column(nullable=false, length=50, unique=true)
	private String email;
	private int telefono;
	
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	private static final long serialVersionUID = 1L;
	
	
}
