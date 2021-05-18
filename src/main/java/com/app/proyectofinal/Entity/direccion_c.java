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
@Table (name = "direccion_c")
public class direccion_c implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 6L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Basic(optional = false)
		@Column(name="iddireccion_c")
		private Integer iddireccion_c;
		
		@Column(name="direccion_c")
		private String direccion_c;
		
		@Column(name="cliente_idcliente")
		private Integer cliente_idcliente;

		public Integer getIddireccion_c() {
			return iddireccion_c;
		}

		public void setIddireccion_c(Integer iddireccion_c) {
			this.iddireccion_c = iddireccion_c;
		}

		public String getDireccion_c() {
			return direccion_c;
		}

		public void setDireccion_c(String direccion_c) {
			this.direccion_c = direccion_c;
		}

		public Integer getCliente_idcliente() {
			return cliente_idcliente;
		}

		public void setCliente_idcliente(Integer cliente_idcliente) {
			this.cliente_idcliente = cliente_idcliente;
		}
			
}
