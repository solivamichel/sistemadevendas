package com.soliva.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soliva.domain.repository.Pedidos;
import com.soliva.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private Pedidos repository;
	
}
