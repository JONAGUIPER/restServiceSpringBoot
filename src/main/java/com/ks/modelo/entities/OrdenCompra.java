package com.ks.modelo.entities;
// Generated 02-sep-2017 16:26:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrdenCompra generated by hbm2java
 */
@Entity
@Table(name = "orden_compra", catalog = "kumibd")
public class OrdenCompra implements java.io.Serializable {

	private long id;
	private Persona persona;
	private Sucursal sucursal;
	private String codigo;
	private Integer diasCredito;
	private Integer idCondicionPago;
	private String observaciones;
	private Date FAlta;
	private Date FModif;
	private Set<Producto> productos = new HashSet<Producto>(0);

	public OrdenCompra() {
	}

	public OrdenCompra(long id, String codigo, Date FAlta, Date FModif) {
		this.id = id;
		this.codigo = codigo;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	public OrdenCompra(long id, Persona persona, Sucursal sucursal, String codigo, Integer diasCredito,
			Integer idCondicionPago, String observaciones, Date FAlta, Date FModif, Set<Producto> productos) {
		this.id = id;
		this.persona = persona;
		this.sucursal = sucursal;
		this.codigo = codigo;
		this.diasCredito = diasCredito;
		this.idCondicionPago = idCondicionPago;
		this.observaciones = observaciones;
		this.FAlta = FAlta;
		this.FModif = FModif;
		this.productos = productos;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERSONA")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUCURSAL")
	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Column(name = "CODIGO", nullable = false, length = 7)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DIAS_CREDITO")
	public Integer getDiasCredito() {
		return this.diasCredito;
	}

	public void setDiasCredito(Integer diasCredito) {
		this.diasCredito = diasCredito;
	}

	@Column(name = "ID_CONDICION_PAGO")
	public Integer getIdCondicionPago() {
		return this.idCondicionPago;
	}

	public void setIdCondicionPago(Integer idCondicionPago) {
		this.idCondicionPago = idCondicionPago;
	}

	@Column(name = "OBSERVACIONES", length = 500)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "F_ALTA", nullable = false, length = 19)
	public Date getFAlta() {
		return this.FAlta;
	}

	public void setFAlta(Date FAlta) {
		this.FAlta = FAlta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "F_MODIF", nullable = false, length = 19)
	public Date getFModif() {
		return this.FModif;
	}

	public void setFModif(Date FModif) {
		this.FModif = FModif;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "producto_orden", catalog = "kumibd", joinColumns = {
			@JoinColumn(name = "ID_ORDEN_COMPRA", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ID_PRODUCTO", nullable = false, updatable = false) })
	public Set<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}
