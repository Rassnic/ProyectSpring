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

import com.app.proyectofinal.Repository.DireccionURepository;
import com.app.proyectofinal.Repository.TelefonoURepository;
import com.app.proyectofinal.Repository.UsuarioRepository;
import com.app.proyectofinal.Entity.direccion_u;
import com.app.proyectofinal.Entity.telefono_u;
import com.app.proyectofinal.Entity.usuario;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	DireccionURepository direcciouRepository;
	
	@Autowired
	TelefonoURepository telefonouRepository;
	
	/*@GetMapping(path = "/login/{usuario}/{password}")	
	public String login(@PathVariable("usuario") String usuario, @PathVariable("password") String password) {
		String login = "ERROR";
		
		List<usuario> usuarios =  usuarioRepository.findByUsuarioAndPassword(usuario, password);
		
		if(!usuarios.isEmpty()){login = "OK";}
		
		return login;
	}	*/
	
	
	@PostMapping(path = "/login")	
	public usuario login(@RequestBody usuario usuario ) {
		
		List<usuario> usuarios =  usuarioRepository.findByUsuarioAndPassword(usuario.getUsuario(), usuario.getPassword());
		
		if(!usuarios.isEmpty()){
			return usuarios.get(0);
		}		
		return null;
	}	
	
	@PostMapping(path = "/guardar")
	
	public usuario saveusuario(@RequestBody usuario usuario)
		{
		List<telefono_u> telefonou = usuario.getTelefonoUList();
		List<direccion_u> direccionu = usuario.getDireccionUList();
		
		usuario.setDireccionUList(null);
		usuario.setTelefonoUList(null);
		
		usuario = usuarioRepository.save(usuario);
		
		usuario.setTelefonoUList(new LinkedList<>());
		if(telefonou != null) {
			for(telefono_u tu : telefonou) {
			 tu.setUsuario_idusuario(usuario.getIdusuario());
			 telefonouRepository.save(tu);
			 usuario.getTelefonoUList().add(tu);
			}			
		}
				
		usuario.setDireccionUList(new LinkedList<>());
		if(direccionu != null) {
			for(direccion_u du : direccionu) {
			 du.setUsuario_idusuario(usuario.getIdusuario());
			 direcciouRepository.save(du);
			 usuario.getDireccionUList().add(du);
			}			
		}
		
		Optional<usuario> usuarior;		
		usuarior = usuarioRepository.findById(usuario.getIdusuario());
		
		if(usuarior.isPresent()) {
			usuario = usuarior.get();
		}
		
		return usuario;
		}
	
	@GetMapping(path = "/buscar/usuario/{usuario}")
	public List<usuario> findbyusuario(@PathVariable ("usuario") String usuario){
		return usuarioRepository.findByUsuario(usuario);		
	}
	
	
	@GetMapping(path = "/buscar")
	public List<usuario>getallusuarios(){
		return usuarioRepository.findAll();
	}	
	
	
	@DeleteMapping(path = "/eliminar/{idusuario}")
	public void deleteusuario(@PathVariable("idusuario") Integer idusuario) {
		Optional<usuario> usuario;
		usuario = usuarioRepository.findById(idusuario);
		
		if(usuario.isPresent()) {
			usuario borrar = usuario.get();
			for(telefono_u tu : borrar.getTelefonoUList()) {
				telefonouRepository.delete(tu);
			}

			for(direccion_u du : borrar.getDireccionUList()) {
				direcciouRepository.delete(du);
			}
			usuarioRepository.delete(usuario.get());
		}
	}	

}
