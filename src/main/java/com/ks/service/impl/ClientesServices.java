package com.ks.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ks.constantes.ConstantesDozer;
import com.ks.dao.IClienteDAO;
import com.ks.modelo.dto.ClienteDto;
import com.ks.modelo.entities.Cliente;
import com.ks.service.IClientesServices;

@Service
public class ClientesServices implements IClientesServices {
	@Autowired
	private Mapper mapper;
	
	@Autowired
	private IClienteDAO clientesDAO;
	
	@Transactional(readOnly=true)
	@Override
	public List<ClienteDto> getClientes() {
		List<Cliente> clientesEntity=(List<Cliente>) this.clientesDAO.findAll();
		List<ClienteDto> clientes= new  ArrayList<ClienteDto>();
		
		for (Cliente clinenteEntity : clientesEntity) {
			ClienteDto clenteDto=new ClienteDto();
			clenteDto=(ClienteDto)this.mapper.map(clinenteEntity, ClienteDto.class, ConstantesDozer.LISTA_CLIENTES_MAP);
			clientes.add(clenteDto);
		}
		
//		clientes=clientesEntity
//				.stream()
//				.map(itemEntity->this.mapper.map(itemEntity, ClienteDto.class,ConstantesDozer.LISTA_CLIENTES_MAP))
//				.collect(Collectors.toCollection(ArrayList::new));
		return clientes;
	}

}
