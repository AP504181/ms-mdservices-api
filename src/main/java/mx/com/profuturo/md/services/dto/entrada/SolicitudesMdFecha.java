package mx.com.profuturo.md.services.dto.entrada;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@ToString
@Schema(description = "Request para enviar el registro de la solicitud al comparador")
public class SolicitudesMdFecha {

    @NotBlank
    @Schema(description = "Fecha Inicio", requiredMode = Schema.RequiredMode.REQUIRED, example = "2026-01-01")
    public String fechaInicio;

    @NotBlank
    @Schema(description = "Fecha Fin", requiredMode = Schema.RequiredMode.REQUIRED, example = "2026-01-27")
    public String fechaFin;
}
