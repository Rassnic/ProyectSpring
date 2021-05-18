package com.app.proyectofinal.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.proyectofinal.Entity.compra_pedido;

@Repository("CompraPedidoRepository")
public interface CompraPedidoRepository extends JpaRepository<compra_pedido, Serializable> {
	
	public List<compra_pedido>findByestado(String estado);

}
