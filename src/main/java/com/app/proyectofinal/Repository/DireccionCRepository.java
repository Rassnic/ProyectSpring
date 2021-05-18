package com.app.proyectofinal.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.app.proyectofinal.Entity.direccion_c;

@Repository("DireccionCRepository")
public interface DireccionCRepository extends JpaRepository<direccion_c, Serializable>{

}
