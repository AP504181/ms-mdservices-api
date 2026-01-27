package mx.com.profuturo.md.services.commons;

import lombok.Getter;

public enum DomicilioEnum {
    DOMICILIO_PARTICULAR(6L),
    DOMICILIO_LABORAL(7L);

    DomicilioEnum(Long idValor) {
        this.idValor = idValor;
    }
    
    @Getter
    private final Long idValor;
}
