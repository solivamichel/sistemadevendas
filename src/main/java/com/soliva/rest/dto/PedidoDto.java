package com.soliva.rest.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDto {
	
	private Integer cliente;
	
	private BigDecimal total;
	
	private List<ItemPedidoDto> items;
}