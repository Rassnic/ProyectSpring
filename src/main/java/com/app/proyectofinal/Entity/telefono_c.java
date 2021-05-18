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
@Table (name = "telefono_c")
public class telefono_c implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idtelefono_c")
	private Integer idtelefono_c;
	
	@Column(name="telefono_c")
	private String telefono_c;
	
	@Column(name="cliente_idcliente")
	private Integer cliente_idcliente;

	public Integer getIdtelefono_c() {
		return idtelefono_c;
	}

	public void setIdtelefono_c(Integer idtelefono_c) {
		this.idtelefono_c = idtelefono_c;
	}

	public String getTelefono_c() {
		return telefono_c;
	}

	public void setTelefono_c(String telefono_c) {
		this.telefono_c = telefono_c;
	}

	public Integer getCliente_idcliente() {
		return cliente_idcliente;
	}

	public void setCliente_idcliente(Integer cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}
	

}
