package mx.com.profuturo.md.services.commons;

import lombok.Getter;

public enum EstatusEnum {
    FOLIO_GENERADO(1L),
    ARCHIVOS_ENVIADOS(2L),
    VIDEO_ENVIADO(3L),
    TRAMITE_ENVIADO(4L),
    ESTATUS_ACTUALIZADOS(5L);

    EstatusEnum(Long idValor) {
        this.idValor = idValor;
    }
    
    @Getter
    private final Long idValor;
}
