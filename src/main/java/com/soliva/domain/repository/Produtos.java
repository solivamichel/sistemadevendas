package com.soliva.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soliva.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer>{
	
	
}
