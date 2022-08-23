package br.com.springboot3.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseException implements Serializable {

	private static final long serialVersionUID = -6182819101375893178L;
	
	private String message;
	private String details;
	private LocalDateTime time;	
}
