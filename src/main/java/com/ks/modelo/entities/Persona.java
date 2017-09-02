package com.ks.modelo.entities;
// Generated 02-sep-2017 16:26:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona", catalog = "kumibd")
public class Persona implements java.io.Serializable {

	private Long id;
	private Perfil perfil;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Date FAlta;
	private Date FModif;
	private Set<Sucursal> sucursals = new HashSet<Sucursal>(0);
	private Set<OrdenCompra> ordenCompras = new HashSet<OrdenCompra>(0);
	private Clave clave;

	public Persona() {
	}

	public Persona(String nombre, String apellido1, String apellido2, Date FAlta, Date FModif) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	public Persona(Perfil perfil, String nombre, String apellido1, String apellido2, Date FAlta, Date FModif,
			Set<Sucursal> sucursals, Set<OrdenCompra> ordenCompras, Clave clave) {
		this.perfil = perfil;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.FAlta = FAlta;
		this.FModif = FModif;
		this.sucursals = sucursals;
		this.ordenCompras = ordenCompras;
		this.clave = clave;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERFIL")
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Column(name = "NOMBRE", nullable = false, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDO1", nullable = false, length = 100)
	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "APELLIDO2", nullable = false, length = 100)
	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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
	@JoinTable(name = "persona_sucursal", catalog = "kumibd", joinColumns = {
			@JoinColumn(name = "ID_PERSONA", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ID_SUCURSAL", nullable = false, updatable = false) })
	public Set<Sucursal> getSucursals() {
		return this.sucursals;
	}

	public void setSucursals(Set<Sucursal> sucursals) {
		this.sucursals = sucursals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<OrdenCompra> getOrdenCompras() {
		return this.ordenCompras;
	}

	public void setOrdenCompras(Set<OrdenCompra> ordenCompras) {
		this.ordenCompras = ordenCompras;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	public Clave getClave() {
		return this.clave;
	}

	public void setClave(Clave clave) {
		this.clave = clave;
	}

}
