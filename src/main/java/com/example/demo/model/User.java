package com.example.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class User extends parentEntity {

	
	private static final long serialVersionUID = 186846492040550174L;

	@Column(name = "nombre", nullable=false, length=255 )
	private String nombre;
	
	@Column(name = "ci", nullable=true, length=255 )
	private String ci;
	
	@Column(name = "telefono", nullable=false, length=255 )
	private String telefono;
	
	@Column(name = "direccion", nullable=true, length=255 )
	private String direccion;
	


	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public String getci() {
		return ci;
	}
	public void setci(String ci) {
		this.ci = ci;
	}
	public String gettelefono() {
		return telefono;
	}
	public void settelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getdireccion() {
		return direccion;
	}
	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}
}
