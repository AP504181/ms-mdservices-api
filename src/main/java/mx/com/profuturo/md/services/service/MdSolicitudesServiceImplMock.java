package mx.com.profuturo.md.services.service;

import com.opencsv.CSVReader;
import lombok.extern.slf4j.Slf4j;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto125;
import mx.com.profuturo.md.services.dto.entrada.SolicitudesMdFecha;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MdSolicitudesServiceImplMock implements MdSolicitudesServiceMock {
    @Override
    public List<ReporteSolicitudesDto> obtenersolicitudescognos24(SolicitudesMdFecha fechasmd) {
        List<ReporteSolicitudesDto> lista = new ArrayList<>();
        try (
                InputStream is = new ClassPathResource("csv/Cognos24.csv").getInputStream();
                CSVReader reader = new CSVReader( new InputStreamReader(is, StandardCharsets.UTF_8))
        ) {

            if (is == null) {
                throw new RuntimeException("No se encontró Cognos24.csv en resources");
            }

            String[] r;
            boolean encabezado = true;

            while ((r = reader.readNext()) != null) {

                // Saltar encabezado
                if (encabezado) {
                    encabezado = false;
                    continue;
                }

                ReporteSolicitudesDto dto = new ReporteSolicitudesDto();

                dto.setDivision(get(r, 0));
                dto.setSucursal(get(r, 1));
                dto.setRegion(get(r, 2));
                dto.setTipoModificacion(get(r, 3));
                dto.setFechaModificacion(get(r, 4));
                dto.setFolioSolicitudMd(get(r, 5));
                dto.setNumeroCuenta(get(r, 6));
                dto.setCurp(get(r, 7));
                dto.setNss(get(r, 8));
                dto.setNombreCompleto(get(r, 9));
                dto.setEstatusSolicitud(get(r, 10));
                dto.setMotivoDeRechazoProcesar(get(r, 11));
                dto.setMotivoDeRechazoOperaciones(get(r, 12));
                dto.setFechaSolicitud(get(r, 13));
                dto.setNumeroEmpleado(get(r, 14));
                dto.setNombreEmpleado(get(r, 15));
                dto.setIdFolioUnico(get(r, 16));
                dto.setTipoTramite(get(r, 17));
                dto.setEstatusMarca(get(r, 18));
                dto.setNumeroEnviosProcesar(get(r, 19));
                dto.setIndicadorFinado(get(r, 20));
                dto.setOrigenSolicitud(get(r, 21));
                dto.setEstatusFolioUnico(get(r, 22));
                dto.setFlujoValidacion(get(r, 23));
                dto.setIndicadorTransitorioCuo(get(r, 24));
                dto.setEstatusEnrolamiento(get(r, 25));
                dto.setExpIdCapturado(get(r, 26));
                dto.setEnrolamientoCapturado(get(r, 27));
                dto.setExpedientePlus(get(r, 28));
                dto.setExpedienteBatch(get(r, 29));
                dto.setTipoSolicitante(get(r, 30));
                dto.setCurpSolicitante(get(r, 31));
                dto.setFolio(get(r, 32));
                dto.setNombreIne(get(r, 33));
                dto.setExcepcionAutenticacion(get(r, 34));
                dto.setDescripcionExcepcion(get(r, 35));
                dto.setIdTipoSolicitud(get(r, 36));
                dto.setTipoSolicitud(get(r, 37));

                lista.add(dto);
            }

        } catch (Exception e) {
            throw new RuntimeException("Error leyendo CSV", e);
        }

        return lista;
    }

    @Override
    public List<ReporteSolicitudesDto125> obtenersolicitudescognos125(SolicitudesMdFecha fechasmd) {
        List<ReporteSolicitudesDto125> lista = new ArrayList<>();
        try (
                InputStream is = new ClassPathResource("csv/Cognos125.csv").getInputStream();
                CSVReader reader = new CSVReader( new InputStreamReader(is, StandardCharsets.UTF_8))
        ) {

            if (is == null) {
                throw new RuntimeException("No se encontró Cognos24.csv en resources");
            }
            String[] r;
            boolean encabezado = true;

            while ((r = reader.readNext()) != null) {

                // Saltar encabezado
                if (encabezado) {
                    encabezado = false;
                    continue;
                }

                ReporteSolicitudesDto125 dto = new ReporteSolicitudesDto125();

                dto.setFechaModificacion(get(r, 0));
                dto.setTipoTramite(get(r, 1));
                dto.setFolioSolicitudMd(get(r, 2));
                dto.setIdFolioUnico(get(r, 3));
                dto.setDivision(get(r, 4));
                dto.setSucursal(get(r, 5));
                dto.setNumeroCuenta(get(r, 6));
                dto.setNss(get(r, 7));
                dto.setCurp(get(r, 8));
                dto.setNombreCompleto(get(r, 9));
                dto.setEstatusSolicitud(get(r, 10));
                dto.setFechaSolicitud(get(r, 11));
                dto.setMotivoDeRechazoProcesar(get(r, 12));
                dto.setMotvoRechazoOperaciones(get(r, 13));
                dto.setMotivoRechazoEnrolamiento(get(r, 14));
                dto.setUseridEmpleado(get(r, 15));
                dto.setNombreCompleto3(get(r, 16));
                dto.setEstatusMarca(get(r, 17));
                dto.setNumeroEnviosProcesar(get(r, 18));
                dto.setOrigenSolicitud(get(r, 19));
                dto.setEstatusFolioUnico(get(r, 20));
                dto.setEstatusEnrolamiento(get(r, 21));
                dto.setExpIdCapturado(get(r, 22));
                dto.setEnrolamientoCapturado(get(r, 23));
                dto.setExpedienteCompleto1(get(r, 24));
                dto.setExpedienteCompleto(get(r, 25));
                dto.setTipoSolicitante(get(r, 26));
                dto.setCurpSolicitante(get(r, 27));
                dto.setFolio(get(r, 28));
                dto.setNombreCompleto2(get(r, 29));
                dto.setExcepcionAutenticacion(get(r, 30));
                dto.setDescripcionExcepcion(get(r, 31));
                dto.setIdTipoSolicitud(get(r, 32));
                dto.setTipoSolicitud(get(r, 33));

                lista.add(dto);
            }

        } catch (Exception e) {
            throw new RuntimeException("Error leyendo CSV Cognos125", e);
        }

        return lista;
    }

    private static String get(String[] r, int index) {
        return index < r.length && r[index] != null && !r[index].trim().isEmpty()
                ? r[index].trim()
                : null;
    }
}
