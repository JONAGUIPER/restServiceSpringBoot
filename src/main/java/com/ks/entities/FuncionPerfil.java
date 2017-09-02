package com.ks.entities;
// Generated 02-sep-2017 16:26:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FuncionPerfil generated by hbm2java
 */
@Entity
@Table(name = "funcion_perfil", catalog = "kumibd")
public class FuncionPerfil implements java.io.Serializable {

	private long id;
	private Integer idPerfil;
	private String codigo;
	private String nombre;
	private String descripcion;
	private Date FAlta;
	private Date FModif;

	public FuncionPerfil() {
	}

	public FuncionPerfil(long id, String codigo, String nombre, Date FAlta, Date FModif) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	public FuncionPerfil(long id, Integer idPerfil, String codigo, String nombre, String descripcion, Date FAlta,
			Date FModif) {
		this.id = id;
		this.idPerfil = idPerfil;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "ID_PERFIL")
	public Integer getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
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
