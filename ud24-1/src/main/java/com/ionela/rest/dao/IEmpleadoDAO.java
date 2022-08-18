package com.ionela.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Empleado;



public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar empleados por campo nombre
	public List<Empleado> findByNombre(String nombre);
	
}