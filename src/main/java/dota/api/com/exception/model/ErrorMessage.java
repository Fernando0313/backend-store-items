package dota.api.com.exception.model;

import java.util.Date;

public class ErrorMessage {
	private int statusCode;
	private Date timestamp;
	private String message;
	private String descrption;
	public ErrorMessage(int statusCode, Date timestamp, String message, String descrption) {
		super();
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.descrption = descrption;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDescrption() {
		return descrption;
	}
}
