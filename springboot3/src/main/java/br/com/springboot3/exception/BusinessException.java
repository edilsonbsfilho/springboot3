package br.com.springboot3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 2919112456402736019L;
	
	public BusinessException(String message) {
		super(message);
	}

}
