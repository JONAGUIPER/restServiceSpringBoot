package com.ks.entities;
// Generated 15-ago-2017 22:28:36 by Hibernate Tools 5.2.3.Final

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sucursal generated by hbm2java
 */
@Entity
@Table(name = "sucursal", catalog = "kumibd")
public class Sucursal implements java.io.Serializable {

	private long id;
	private Cliente cliente;
	private String codigo;
	private int tipo;
	private String direccionDespacho;
	private Date horaIniLab;
	private Date horaFinLab;
	private Date horaIniDescanso;
	private Date horaFinDescanso;
	private Date horaIniDespacho;
	private Date horaFinDespacho;
	private int idTipoContribuyente;
	private Long idVendedor;
	private int idZona;
	private String representante;
	private Integer idCondPago;
	private Date FModif;
	private Date FAlta;
	private Set<Persona> personas = new HashSet<Persona>(0);
	private Set<OrdenCompra> ordenCompras = new HashSet<OrdenCompra>(0);

	public Sucursal() {
	}

	public Sucursal(long id, Cliente cliente, String codigo, int tipo, int idTipoContribuyente, int idZona, Date FModif,
			Date FAlta) {
		this.id = id;
		this.cliente = cliente;
		this.codigo = codigo;
		this.tipo = tipo;
		this.idTipoContribuyente = idTipoContribuyente;
		this.idZona = idZona;
		this.FModif = FModif;
		this.FAlta = FAlta;
	}

	public Sucursal(long id, Cliente cliente, String codigo, int tipo, String direccionDespacho, Date horaIniLab,
			Date horaFinLab, Date horaIniDescanso, Date horaFinDescanso, Date horaIniDespacho, Date horaFinDespacho,
			int idTipoContribuyente, Long idVendedor, int idZona, String representante, Integer idCondPago, Date FModif,
			Date FAlta, Set<Persona> personas, Set<OrdenCompra> ordenCompras) {
		this.id = id;
		this.cliente = cliente;
		this.codigo = codigo;
		this.tipo = tipo;
		this.direccionDespacho = direccionDespacho;
		this.horaIniLab = horaIniLab;
		this.horaFinLab = horaFinLab;
		this.horaIniDescanso = horaIniDescanso;
		this.horaFinDescanso = horaFinDescanso;
		this.horaIniDespacho = horaIniDespacho;
		this.horaFinDespacho = horaFinDespacho;
		this.idTipoContribuyente = idTipoContribuyente;
		this.idVendedor = idVendedor;
		this.idZona = idZona;
		this.representante = representante;
		this.idCondPago = idCondPago;
		this.FModif = FModif;
		this.FAlta = FAlta;
		this.personas = personas;
		this.ordenCompras = ordenCompras;
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
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "CODIGO", nullable = false, length = 7)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "TIPO", nullable = false)
	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Column(name = "DIRECCION_DESPACHO", length = 200)
	public String getDireccionDespacho() {
		return this.direccionDespacho;
	}

	public void setDireccionDespacho(String direccionDespacho) {
		this.direccionDespacho = direccionDespacho;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_INI_LAB", length = 8)
	public Date getHoraIniLab() {
		return this.horaIniLab;
	}

	public void setHoraIniLab(Date horaIniLab) {
		this.horaIniLab = horaIniLab;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_FIN_LAB", length = 8)
	public Date getHoraFinLab() {
		return this.horaFinLab;
	}

	public void setHoraFinLab(Date horaFinLab) {
		this.horaFinLab = horaFinLab;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_INI_DESCANSO", length = 8)
	public Date getHoraIniDescanso() {
		return this.horaIniDescanso;
	}

	public void setHoraIniDescanso(Date horaIniDescanso) {
		this.horaIniDescanso = horaIniDescanso;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_FIN_DESCANSO", length = 8)
	public Date getHoraFinDescanso() {
		return this.horaFinDescanso;
	}

	public void setHoraFinDescanso(Date horaFinDescanso) {
		this.horaFinDescanso = horaFinDescanso;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_INI_DESPACHO", length = 8)
	public Date getHoraIniDespacho() {
		return this.horaIniDespacho;
	}

	public void setHoraIniDespacho(Date horaIniDespacho) {
		this.horaIniDespacho = horaIniDespacho;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_FIN_DESPACHO", length = 8)
	public Date getHoraFinDespacho() {
		return this.horaFinDespacho;
	}

	public void setHoraFinDespacho(Date horaFinDespacho) {
		this.horaFinDespacho = horaFinDespacho;
	}

	@Column(name = "ID_TIPO_CONTRIBUYENTE", nullable = false)
	public int getIdTipoContribuyente() {
		return this.idTipoContribuyente;
	}

	public void setIdTipoContribuyente(int idTipoContribuyente) {
		this.idTipoContribuyente = idTipoContribuyente;
	}

	@Column(name = "ID_VENDEDOR")
	public Long getIdVendedor() {
		return this.idVendedor;
	}

	public void setIdVendedor(Long idVendedor) {
		this.idVendedor = idVendedor;
	}

	@Column(name = "ID_ZONA", nullable = false)
	public int getIdZona() {
		return this.idZona;
	}

	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}

	@Column(name = "REPRESENTANTE", length = 50)
	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	@Column(name = "ID_COND_PAGO")
	public Integer getIdCondPago() {
		return this.idCondPago;
	}

	public void setIdCondPago(Integer idCondPago) {
		this.idCondPago = idCondPago;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "F_MODIF", nullable = false, length = 19)
	public Date getFModif() {
		return this.FModif;
	}

	public void setFModif(Date FModif) {
		this.FModif = FModif;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "F_ALTA", nullable = false, length = 19)
	public Date getFAlta() {
		return this.FAlta;
	}

	public void setFAlta(Date FAlta) {
		this.FAlta = FAlta;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "persona_sucursal", catalog = "kumibd", joinColumns = {
			@JoinColumn(name = "ID_SUCURSAL", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ID_PERSONA", nullable = false, updatable = false) })
	public Set<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sucursal")
	public Set<OrdenCompra> getOrdenCompras() {
		return this.ordenCompras;
	}

	public void setOrdenCompras(Set<OrdenCompra> ordenCompras) {
		this.ordenCompras = ordenCompras;
	}

}
