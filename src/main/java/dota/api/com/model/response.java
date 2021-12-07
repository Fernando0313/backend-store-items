package dota.api.com.model;

import java.util.List;
import java.util.Map;

public class response<E> {
	private String message;
	private Map content;
	
	public response() {
		// TODO Auto-generated constructor stub
	}
	
	public response(String message, Map content) {
		super();
		this.message = message;
		this.content = content;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map getContent() {
		return content;
	}
	public void setContent(Map content) {
		this.content = content;
	}
	
	
}
