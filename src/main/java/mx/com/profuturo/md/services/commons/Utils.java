package mx.com.profuturo.md.services.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Utils {
	
	public static final String NAME = "Modificacion de Datos MD ";
	public static final String DESCRIPTION = "Modificacion de Datos MD Controller API";
	public static final String SUMMARY = "Servicio para realizar consultas Cognos MD";
	public static final String MENSAJE_NOT_FOUND = "No se encontro el elemento.";

	public static String convertDateTime(LocalDateTime dateTime) {
		return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}

	public static String convertDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public static String formatofecha(String fecha) {
		String fecharetorno=null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		String patternreturn = "dd/MM/yyyy";
		try {
			DateFormat df = new SimpleDateFormat(patternreturn);
			Date date = formatter.parse(fecha);
			fecharetorno = df.format(date);
			return fecharetorno;
		} catch (ParseException e) {
			return fecharetorno;
		}
	}
}
