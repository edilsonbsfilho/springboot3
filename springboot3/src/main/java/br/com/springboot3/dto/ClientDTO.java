package br.com.springboot3.dto;

public class ClientDTO {

	private final String name;

	public ClientDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
