package com.ks.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ks.modelo.entities.Cliente;

@Transactional
public interface IClienteDAO extends CrudRepository<Cliente, Long> {

}
