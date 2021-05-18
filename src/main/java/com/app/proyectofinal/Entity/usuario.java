package com.app.proyectofinal.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "usuario")
public class usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idusuario")
	private Integer idusuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
	
	@Column(name="rol_idrol")
	private Integer rol_idrol;
	
	@OneToMany(mappedBy="idtelefono_u")
	private List<telefono_u>telefonoUList;
	
	@OneToMany(mappedBy="iddireccion_u")
	private List<direccion_u>direccionUList;

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIdrol_idrol() {
		return rol_idrol;
	}

	public void setIdrol_idrol(Integer idrol_idrol) {
		this.rol_idrol = idrol_idrol;
	}

	public List<telefono_u> getTelefonoUList() {
		return telefonoUList;
	}

	public void setTelefonoUList(List<telefono_u> telefonoUList) {
		this.telefonoUList = telefonoUList;
	}

	public List<direccion_u> getDireccionUList() {
		return direccionUList;
	}

	public void setDireccionUList(List<direccion_u> direccionUList) {
		this.direccionUList = direccionUList;
	}
	
}
