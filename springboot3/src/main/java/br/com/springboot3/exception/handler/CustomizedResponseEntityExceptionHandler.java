package br.com.springboot3.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.springboot3.exception.BusinessException;
import br.com.springboot3.exception.ResponseException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ResponseException> handleAllExceptions(Exception ex, WebRequest request) {
		
		return getResponseEntity(ex, request, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(BusinessException.class)
	public final ResponseEntity<ResponseException> handleAllBusinessExceptions(Exception ex, WebRequest request) {
		
		return getResponseEntity(ex, request, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	private final ResponseEntity<ResponseException> getResponseEntity(Exception ex, WebRequest request, HttpStatus httpStatus) {
		ResponseException exception = new ResponseException(
				ex.getMessage(), 
				request.getDescription(false), 
				LocalDateTime.now());
		
		return new ResponseEntity<ResponseException>(exception, httpStatus);
	}
}
