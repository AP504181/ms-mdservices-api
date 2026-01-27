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
	
	public static final String NAME = "Registro solicitud";
	public static final String DESCRIPTION = "Registro Solicitud Controller API";
	public static final String SUMMARY = "Servicio para realizar el registro de la solicitud del comparador";
	public static final String MENSAJE = "No se pudo crear la solicitud o error en la comunicación: ";
	public static final String PROFUTURO_CLAVE = "534";
	public static final String ID_SERVICIO = "919";
	public static final String ID_EBUSINESS = "53";
	public static final String ID_CLIENTE = "4";
	public static final String REGISTRO_IMSS = "01";
	public static final String REGISTRO_NO_AFILIADOS = "02";
	public static final Long REGISTRO_NORMAL = 9L;
	public static final Long REGISTRO_INDEPENDIENTE = 10L;
	public static final Long REGISTRO_FINADO = 11L;
	public static final Long IMSS = 12L;
	public static final String CONFORMAR_EXPEDIENTE = "1";
	public static final String ENROLAR = "1";
	public static final String AUTORIZA_UNIFICACION_MIXTA = "1";
	public static final Integer CODIGO_ERROR = 103;
	public static final String SE_VALIDO_CURP = "1";
	public static final String NO_SE_VALIDO_CURP = "0";
	public static final String AFORE = "01";
	public static final String PLATAFORMA = "02";
	public static final String CURP = "5";
	public static final Integer LONGITUD_DOCUMENTO_PROBATORIO = 10;
	public static final String INTENTOS_ENVIAR_EMAIL = "3";
	public static final String MENSAJE_ERROR_PETICION = "Error al enviar la petición a procesar registro: ";
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
