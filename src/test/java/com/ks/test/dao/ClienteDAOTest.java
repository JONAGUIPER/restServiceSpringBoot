package com.ks.test.dao;

import static org.junit.Assert.assertNull;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ks.dao.IClienteDAO;
import com.ks.modelo.entities.Cliente;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class ClienteDAOTest {
	@Autowired
	private IClienteDAO clienteDAO;
	
	@Test
	public void create(){
		final Cliente clienteInsertar=new Cliente();
		clienteInsertar.setCodigo("A000117");
		clienteInsertar.setRazonSocial("primera razon social");
		final Cliente clienteInsertado =clienteDAO.save(clienteInsertar);	
		 assertNull(clienteInsertado.getId());
	}
}
