package com.app.proyectofinal.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.detalle_compra;

@Repository("DetalleCompraRepository")
public interface DetalleCompraRepository extends JpaRepository<detalle_compra, Serializable> {

}
