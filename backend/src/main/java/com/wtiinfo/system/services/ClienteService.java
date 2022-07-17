package com.wtiinfo.system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtiinfo.system.entities.Cliente;
import com.wtiinfo.system.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> getClientes() {
		return repository.findAll();
	}
}
