package com.app.proyectofinal.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.anuncios;


@Repository("AnuncioRepository")
public interface AnunciosRepository extends JpaRepository<anuncios, Serializable>{

	public List<anuncios>findByidanuncios(Integer idanuncios);
	
}
