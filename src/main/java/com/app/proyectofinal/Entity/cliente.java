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
@Table (name = "cliente")
public class cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idcliente")
	private Integer idcliente;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nit")
	private String nit;
	
	@Column(name="correo")
	private String correo;
	
	@OneToMany(mappedBy="idtelefono_c")
	private List<telefono_c>telefonoCList;
	
	@OneToMany(mappedBy="iddireccion_c")
	private List<direccion_c>direccionCList;

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<telefono_c> getTelefonoCList() {
		return telefonoCList;
	}

	public void setTelefonoCList(List<telefono_c> telefonoCList) {
		this.telefonoCList = telefonoCList;
	}

	public List<direccion_c> getDireccionCList() {
		return direccionCList;
	}

	public void setDireccionCList(List<direccion_c> direccionCList) {
		this.direccionCList = direccionCList;
	}

	

}
