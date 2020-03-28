package com.soliva.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPedidoDto {
	
	private Integer produto;
	
	private Integer quantidade;
}
