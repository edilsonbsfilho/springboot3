package br.com.springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot3.dto.ClientDTO;

@RestController
@RequestMapping(value = "client")
public class ClientController {

	private static final String template = "Client: %s";
	
	@GetMapping(value = "/{name}")
	public ClientDTO getClient(@PathVariable String name) {
		return new ClientDTO(String.format(template, name));
	}
}
