package com.ks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ks.modelo.dto.ClienteDto;
import com.ks.service.IClientesServices;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	
	
	@Autowired
	private IClientesServices clienteServices;
	
	@RequestMapping(path = "",method = RequestMethod.GET)
	public List<ClienteDto> getPersonas(){
		List<ClienteDto> clientes=this.clienteServices.getClientes();
		
		return clientes;
		
		
		
	}
}
