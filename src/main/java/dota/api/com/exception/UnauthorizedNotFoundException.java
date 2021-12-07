package dota.api.com.exception;

public class UnauthorizedNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedNotFoundException(String message) {
		super(message);
	}
}
