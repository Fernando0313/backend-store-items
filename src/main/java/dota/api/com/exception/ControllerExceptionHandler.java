package dota.api.com.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;
import org.springframework.web.context.request.WebRequest;

import dota.api.com.exception.model.ErrorMessage;




@RestControllerAdvice
public class ControllerExceptionHandler {
	

	
	
	/*@ExceptionHandler(Exception.class)
	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorMessage globalExceptionHandler(Exception ex,
			WebRequest request) {
		ErrorMessage message=new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return message;
	}*/
	
	@ExceptionHandler(ResouceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMessage resouceNotFoundException(ResouceNotFoundException ex,
			WebRequest request) {
		ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND.value(), new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return message;
	}
	
	@ExceptionHandler(UnauthorizedNotFoundException.class)
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	public ErrorMessage resouceNotFoundExceptionl(UnauthorizedNotFoundException ex,
			WebRequest request) {
		ErrorMessage message=new ErrorMessage(HttpStatus.UNAUTHORIZED.value(), new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return message;
	}
	
	/*@ExceptionHandler(ResouceNotFoundException.class)
	@ResponseStatus(value= HttpStatus.UNAUTHORIZED)
	public ErrorMessage sessionError(ResouceNotFoundException ex,
			WebRequest request) {
		ErrorMessage message=new ErrorMessage(HttpStatus.UNAUTHORIZED.value(), new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return message;
	}*/
	
	
}
