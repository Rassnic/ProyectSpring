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
@Table (name = "detalle_compra")
public class detalle_compra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="iddetalle_compra")
	private Integer iddetalle_compra;
	
	@Column(name="cantida")
	private Integer cantida;
	
	@Column(name="subtotal")
	private Double subtotal;
	
	@Column(name="producto_idproducto")
	private Integer producto_idproducto;
	
	@Column(name="compra_pedido_idcompra_pedido")
	private Integer compra_pedido_idcompra_pedido;

	public Integer getIddetalle_compra() {
		return iddetalle_compra;
	}

	public void setIddetalle_compra(Integer iddetalle_compra) {
		this.iddetalle_compra = iddetalle_compra;
	}

	public Integer getCantida() {
		return cantida;
	}

	public void setCantida(Integer cantida) {
		this.cantida = cantida;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getProducto_idproducto() {
		return producto_idproducto;
	}

	public void setProducto_idproducto(Integer producto_idproducto) {
		this.producto_idproducto = producto_idproducto;
	}

	public Integer getCompra_pedido_idcompra_pedido() {
		return compra_pedido_idcompra_pedido;
	}

	public void setCompra_pedido_idcompra_pedido(Integer compra_pedido_idcompra_pedido) {
		this.compra_pedido_idcompra_pedido = compra_pedido_idcompra_pedido;
	}

}
