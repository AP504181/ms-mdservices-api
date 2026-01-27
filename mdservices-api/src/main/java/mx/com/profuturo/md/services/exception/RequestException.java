package mx.com.profuturo.md.services.exception;

import lombok.Data;

@Data
public class RequestException extends RuntimeException {
	private static final long serialVersionUID = 7101035984055175490L;

	public RequestException(String message) {
		super(message);
	}
}
