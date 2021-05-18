package com.app.proyectofinal.Entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "direccion_u")
public class direccion_u implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="iddireccion_u")
	private Integer iddireccion_u;
	
	@Column(name="direccion_u")
	private String direccion_u;
	
	@Column(name="usuario_idusuario")
	private Integer usuario_idusuario;

	public Integer getIddireccion_u() {
		return iddireccion_u;
	}

	public void setIddireccion_u(Integer iddireccion_u) {
		this.iddireccion_u = iddireccion_u;
	}

	public String getDireccion_u() {
		return direccion_u;
	}

	public void setDireccion_u(String direccion_u) {
		this.direccion_u = direccion_u;
	}

	public Integer getUsuario_idusuario() {
		return usuario_idusuario;
	}

	public void setUsuario_idusuario(Integer usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}	
	
}
