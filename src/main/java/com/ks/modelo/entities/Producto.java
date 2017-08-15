package com.ks.modelo.entities;
// Generated 15-ago-2017 22:28:36 by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "kumibd")
public class Producto implements java.io.Serializable {

	private long id;
	private String codigo;
	private String nombre;
	private String descripcion;
	private Long precioActual;
	private Set<ProductoOrden> productoOrdens = new HashSet<ProductoOrden>(0);

	public Producto() {
	}

	public Producto(long id, String codigo, String nombre) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Producto(long id, String codigo, String nombre, String descripcion, Long precioActual,
			Set<ProductoOrden> productoOrdens) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioActual = precioActual;
		this.productoOrdens = productoOrdens;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "CODIGO", nullable = false, length = 7)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "NOMBRE", nullable = false, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "DESCRIPCION", length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "PRECIO_ACTUAL", precision = 10, scale = 0)
	public Long getPrecioActual() {
		return this.precioActual;
	}

	public void setPrecioActual(Long precioActual) {
		this.precioActual = precioActual;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<ProductoOrden> getProductoOrdens() {
		return this.productoOrdens;
	}

	public void setProductoOrdens(Set<ProductoOrden> productoOrdens) {
		this.productoOrdens = productoOrdens;
	}

}
