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

import com.app.proyectofinal.Entity.cliente;
import com.app.proyectofinal.Entity.direccion_c;
import com.app.proyectofinal.Entity.telefono_c;
import com.app.proyectofinal.Repository.ClienteRepository;
import com.app.proyectofinal.Repository.DireccionCRepository;
import com.app.proyectofinal.Repository.TelefonoCRepository;


@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	DireccionCRepository direcciocRepository;
	
	@Autowired
	TelefonoCRepository telefonocRepository;
	
	
	@PostMapping(path = "/guardar")
	
	public cliente saveusuario(@RequestBody cliente cliente)
		{
		List<telefono_c> telefonoc = cliente.getTelefonoCList();
		List<direccion_c> direccionc = cliente.getDireccionCList();
		
		cliente.setDireccionCList(null);
		cliente.setTelefonoCList(null);
		
		cliente = clienteRepository.save(cliente);
		
		cliente.setTelefonoCList(new LinkedList<>());
		if(telefonoc != null) {
			for(telefono_c tc : telefonoc) {
			 tc.setCliente_idcliente(cliente.getIdcliente());
			 telefonocRepository.save(tc);
			 cliente.getTelefonoCList().add(tc);
			}			
		}
				
		cliente.setDireccionCList(new LinkedList<>());
		if(direccionc != null) {
			for(direccion_c dc : direccionc) {
			 dc.setCliente_idcliente(cliente.getIdcliente());
			 direcciocRepository.save(dc);
			 cliente.getDireccionCList().add(dc);
			}			
		}
		
		Optional<cliente> clienter;		
		clienter = clienteRepository.findById(cliente.getIdcliente());
		
		if(clienter.isPresent()) {
			cliente = clienter.get();
		}
		
		return cliente;
		}
	
	@GetMapping(path = "/buscar/cliente/{correo}")
	public List<cliente> findbycorreo(@PathVariable ("correo") String correo){
		return clienteRepository.findByCorreo(correo);
		
	}
	
	@DeleteMapping(path = "/eliminar/{idcliente}")
	public void deletecliente(@PathVariable("idcliente") Integer idcliente) {
		Optional<cliente> clientE;
		clientE = clienteRepository.findById(idcliente);
		
		if(clientE.isPresent()) {
			cliente borrar = clientE.get();
			for(telefono_c tc: borrar.getTelefonoCList()) {
				telefonocRepository.delete(tc);
			}

			for(direccion_c dc: borrar.getDireccionCList()) {
				direcciocRepository.delete(dc);
			}
			clienteRepository.delete(clientE.get());
		}
	}	

}
