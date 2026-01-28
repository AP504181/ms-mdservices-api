package mx.com.profuturo.md.services.service;

import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto125;
import mx.com.profuturo.md.services.dto.entrada.SolicitudesMdFecha;

import java.util.List;

public interface MdSolicitudesService {
    List<ReporteSolicitudesDto> obtenersolicitudescognos24(SolicitudesMdFecha fechasmd);
    List<ReporteSolicitudesDto125> obtenersolicitudescognos125(SolicitudesMdFecha fechasmd);
}
