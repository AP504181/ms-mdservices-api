package mx.com.profuturo.md.services.commons;

import lombok.Getter;

public enum SendEmailEnum {
    ACEPTADO("ACEPTADO"),
    RECHAZADO("RECHAZADO"),
    MICROSERVICIO("ms-registro-solicitud"),
    REMITENTE("mitaforeuser@profuturo.com.mx"),
    PLANTILLA_EMAIL("23"),
    DESTINATARIOS_EMAIL("24"),
    ENCABEZADO_MAIL("COMPARADOR PROCESAR"),
    TIPO_CONTENIDO("text/html"),
    TIEMPO_EXCEDIDO_PROCESAR("SE EXCEDIÓ EN EL TIEMPO DE RESPUESTA DE PROCESAR"),
    RECHAZO_VALOR("02");

    SendEmailEnum(String idValor) {
        this.idValor = idValor;
    }

    @Getter
    private final String idValor;
}
