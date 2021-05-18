package com.app.proyectofinal.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.usuario;

@Repository("UsuarioRepository")

public interface UsuarioRepository extends JpaRepository<usuario, Serializable> {
	
	public List<usuario>findByUsuarioAndPassword(String usuario, String password);
	
	public List<usuario>findByUsuario(String usuario);

}
