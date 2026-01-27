package mx.com.profuturo.md.services.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = 8915436500602081559L;

	private HttpStatus status;

	public BusinessException(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}
}
