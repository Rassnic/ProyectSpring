package com.app.proyectofinal.Service;

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


import com.app.proyectofinal.Entity.producto;
import com.app.proyectofinal.Repository.ProductoRepository;


@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	@GetMapping(path = "/buscar")
	public List<producto>getallproductos(){
		return productoRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public producto saveAnuncio(@RequestBody producto producto) {
		return productoRepository.save(producto);		
	}

	
	@DeleteMapping(path="/eliminar/{idproducto}")
	public void deleteproducto(@PathVariable("idproducto") Integer idproducto) {
		Optional<producto> productos;
		
		productos = productoRepository.findById(idproducto);
		
		if(productos.isPresent()) {
			productoRepository.delete(productos.get());
		}
	}
}
