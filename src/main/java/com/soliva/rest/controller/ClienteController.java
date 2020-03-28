package com.soliva.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soliva.domain.entity.Cliente;
import com.soliva.domain.repository.Clientes;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private Clientes clientes;

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id) {
		Optional<Cliente> cliente = clientes.findById(id);

		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente ) {
		Cliente clienteSalvo = clientes.save(cliente);
		return ResponseEntity.ok(clienteSalvo);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable Integer id) {
		Optional<Cliente> cliente = clientes.findById(id);

		if (cliente.isPresent()) {
			clientes.delete( cliente.get() );
			return ResponseEntity.noContent().build();
		}
			return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
    public ResponseEntity update( @PathVariable Integer id, @RequestBody Cliente cliente ) {
        return clientes
                .findById(id)
                .map( clienteExistente -> {
                    cliente.setId(clienteExistente.getId());
                    clientes.save(cliente);
                    return ResponseEntity.noContent().build();
                }).orElseGet( () -> ResponseEntity.notFound().build() );
    }
}
