package com.soliva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.soliva.domain.entity.Cliente;
import com.soliva.domain.repositorio.Clientes;

@SpringBootApplication
public class VendasApplication {
	
	@Bean
	public CommandLineRunner init( @Autowired Clientes clientes) {
		return args -> {
			System.out.println("Salvando Clientes");
			clientes.save(new Cliente("Dougllas"));
			clientes.save(new Cliente("Outro Cliente"));
			
			boolean existe = clientes.existsByNome("Dougllsas");
			System.out.println("Existe um cliente com o nome douglas ? " + existe);
			
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}
