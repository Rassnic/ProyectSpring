package com.app.proyectofinal.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.proyectofinal.Entity.compra_pedido;
import com.app.proyectofinal.Repository.CompraPedidoRepository;

@RestController
@RequestMapping("/compra")
@CrossOrigin
public class CompraPedidoService {

	@Autowired
	CompraPedidoRepository compraPedidoRepository;
	
	@PostMapping(path = "/guardar")
	public compra_pedido saveCompra(@RequestBody compra_pedido compra_pedido) {
		return compraPedidoRepository.save(compra_pedido);		
	}
	
	@GetMapping(path = "/buscar/{estado}")
	public List<compra_pedido> findbycorreo(@PathVariable ("estado") String estado){
		return compraPedidoRepository.findByestado(estado);
		
	}
	
}
