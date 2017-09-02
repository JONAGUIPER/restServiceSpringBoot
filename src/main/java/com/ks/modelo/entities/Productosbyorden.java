package com.ks.modelo.entities;
// Generated 02-sep-2017 16:26:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Productosbyorden generated by hbm2java
 */
@Entity
@Table(name = "productosbyorden", catalog = "kumibd")
public class Productosbyorden implements java.io.Serializable {

	private Integer id;
	private long idOrdenCompra;
	private long idProducto;
	private double precioUnitario;
	private int cantidad;
	private Date FAlta;
	private Date FModif;

	public Productosbyorden() {
	}

	public Productosbyorden(long idOrdenCompra, long idProducto, double precioUnitario, int cantidad, Date FAlta,
			Date FModif) {
		this.idOrdenCompra = idOrdenCompra;
		this.idProducto = idProducto;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ID_ORDEN_COMPRA", nullable = false)
	public long getIdOrdenCompra() {
		return this.idOrdenCompra;
	}

	public void setIdOrdenCompra(long idOrdenCompra) {
		this.idOrdenCompra = idOrdenCompra;
	}

	@Column(name = "ID_PRODUCTO", nullable = false)
	public long getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "PRECIO_UNITARIO", nullable = false, precision = 10, scale = 0)
	public double getPrecioUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Column(name = "CANTIDAD", nullable = false)
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

}