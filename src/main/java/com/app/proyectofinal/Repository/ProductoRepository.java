package com.app.proyectofinal.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.producto;

@Repository("ProductoRepository")
public interface ProductoRepository extends JpaRepository<producto, Serializable>{

}
