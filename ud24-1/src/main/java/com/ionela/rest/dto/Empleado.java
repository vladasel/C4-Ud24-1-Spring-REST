package com.ionela.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados") // en caso que la tabala sea diferente
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String trabajo;
	private Double sueldo;

	public Empleado() {

	}

	public Empleado(Long id, String nombre, String apellido, String trabajo, Double sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.trabajo = trabajo;
		this.sueldo = getSalario(trabajo);
	}

	public Empleado(String nombre, String apellido, String trabajo) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.trabajo = trabajo;
		this.sueldo = getSalario(trabajo);

	}

	public Empleado(String trabajo) {

		this.trabajo = trabajo;
		this.sueldo = getSalario(trabajo);

	}


	public Double getSalario(String trabajo) {
		double salario = 0;
		// electricista, fontanero, carpintero, peon;
		switch (trabajo) {
		case "electricista":
			salario = 2500.0;
			break;
		case "fontanero":
			salario = 2000.0;
			break;
		case "carpintero":
			salario = 4000.0;
			break;
		case "peon":
			salario = 1500.0;
			break;

		default:
			salario = 1500.0;
			break;
		}

		return salario;

	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", trabajo=" + trabajo
				+ ", sueldo=" + sueldo + "]";
	}

}