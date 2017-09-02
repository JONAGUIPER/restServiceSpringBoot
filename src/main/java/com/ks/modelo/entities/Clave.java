package com.ks.modelo.entities;
// Generated 02-sep-2017 16:26:57 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Clave generated by hbm2java
 */
@Entity
@Table(name = "clave", catalog = "kumibd")
public class Clave implements java.io.Serializable {

	private long id;
	private Persona persona;
	private String clave;
	private Date FAlta;
	private Date FModif;

	public Clave() {
	}

	public Clave(Persona persona, Date FAlta, Date FModif) {
		this.persona = persona;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	public Clave(Persona persona, String clave, Date FAlta, Date FModif) {
		this.persona = persona;
		this.clave = clave;
		this.FAlta = FAlta;
		this.FModif = FModif;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "persona"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "CLAVE", length = 50)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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
