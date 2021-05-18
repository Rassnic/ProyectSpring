package com.app.proyectofinal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.proyectofinal.Entity.anuncios;
import com.app.proyectofinal.Repository.AnunciosRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class AnuncioService {
	
	@Autowired
	AnunciosRepository anuncioRepository;
	
	@GetMapping(path = "/buscar")
	public List<anuncios>getallanuncios(){
		return anuncioRepository.findAll();
	}
	
	
	@PostMapping(path = "/guardar")
	public anuncios saveAnuncio(@RequestBody anuncios anuncio) {
		return anuncioRepository.save(anuncio);		
	}
	
	@DeleteMapping(path="/eliminar/{idanuncios}")
	public void deleteanuncio(@PathVariable("idanuncios") Integer idanuncios) {
		Optional<anuncios> anuncios;
		
		anuncios = anuncioRepository.findById(idanuncios);
		
		if(anuncios.isPresent()) {
			anuncioRepository.delete(anuncios.get());
		}
	}
	
	@GetMapping(path = "/buscar/anuncio/{idanuncios}")
	public List<anuncios> findbyidanuncios(@PathVariable ("idanuncios") Integer idanuncios){	
		return anuncioRepository.findByidanuncios(idanuncios);		
	}
	
	@PutMapping(path = "/editar/{idanuncios}")
	public anuncios editanuncio(@PathVariable ("idanuncios") Integer idanuncios, @RequestBody anuncios Anuncios) {
		Anuncios.setIdanuncios(idanuncios);
		return anuncioRepository.save(Anuncios);
	}	
	
	}

