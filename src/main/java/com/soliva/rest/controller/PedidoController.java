package com.soliva.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soliva.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
	
	private PedidoService service;

	public PedidoController(PedidoService service) {
		this.service = service;
	}
	
	
}
