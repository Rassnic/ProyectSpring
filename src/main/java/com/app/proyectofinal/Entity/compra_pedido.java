package com.app.proyectofinal.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "compra_pedido")
public class compra_pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idcompra_pedido")
	private Integer id_compre_pedido;
	
	@Column(name="fecha_ingreso")
	@Temporal(TemporalType.DATE)
	private Date fecha_ingreso;
	
	@Column(name="monto_total")
	private Double monto_total;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="fecha_estado")
	@Temporal(TemporalType.DATE)
	private Date fecha_estado;
	
	@Column(name="fecha_entrega")
	@Temporal(TemporalType.DATE)
	private Date fecha_entrega;
	
	@Column(name="cliente_idcliente")
	private Integer cliente_idcliente;

	@OneToMany(mappedBy="iddetalle_compra")
	private List<detalle_compra>detalleCompraList;

	public Integer getId_compre_pedido() {
		return id_compre_pedido;
	}

	public void setId_compre_pedido(Integer id_compre_pedido) {
		this.id_compre_pedido = id_compre_pedido;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Double getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(Double monto_total) {
		this.monto_total = monto_total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_estado() {
		return fecha_estado;
	}

	public void setFecha_estado(Date fecha_estado) {
		this.fecha_estado = fecha_estado;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Integer getCliente_idcliente() {
		return cliente_idcliente;
	}

	public void setCliente_idcliente(Integer cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}

	public List<detalle_compra> getDetalleCompraList() {
		return detalleCompraList;
	}

	public void setDetalleCompraList(List<detalle_compra> detalleCompraList) {
		this.detalleCompraList = detalleCompraList;
	}
	
	
}
