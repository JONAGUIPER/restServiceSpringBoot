package com.ks.modelo.dto;

import java.util.Date;

public class ClienteDto implements java.io.Serializable {
	private static final long serialVersionUID = 6795058518308109186L;
		
	private Long id;
	private String codigo;
	private String razonSocial;
	
	public ClienteDto() {
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

}

