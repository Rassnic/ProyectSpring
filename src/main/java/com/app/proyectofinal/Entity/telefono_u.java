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
@Table (name = "telefono_u")
public class telefono_u implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idtelefono_u")
	private Integer idtelefono_u;
	
	@Column(name="telefono_u")
	private String telefono_u;
	
	@Column(name="usuario_idusuario")
	private Integer usuario_idusuario;

	public Integer getIdtelefono_u() {
		return idtelefono_u;
	}

	public void setIdtelefono_u(Integer idtelefono_u) {
		this.idtelefono_u = idtelefono_u;
	}

	public String getTelefono_u() {
		return telefono_u;
	}

	public void setTelefono_u(String telefono_u) {
		this.telefono_u = telefono_u;
	}

	public Integer getUsuario_idusuario() {
		return usuario_idusuario;
	}

	public void setUsuario_idusuario(Integer usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}
		

}
