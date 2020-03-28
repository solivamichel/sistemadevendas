package com.soliva.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soliva.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer>{
	
	
}
