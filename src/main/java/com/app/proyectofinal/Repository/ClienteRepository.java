package com.app.proyectofinal.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.cliente;

@Repository("ClienteRepository")

public interface ClienteRepository extends JpaRepository<cliente, Serializable>{

	public List<cliente>findByCorreo(String correo);
	
}
