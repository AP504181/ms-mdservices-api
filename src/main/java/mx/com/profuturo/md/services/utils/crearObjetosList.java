package mx.com.profuturo.md.services.utils;

import lombok.extern.slf4j.Slf4j;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto125;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class crearObjetosList {

    public static List<ReporteSolicitudesDto> crearSolicitudesObj024(List<Object[]> objSolicitudes) {
        List<ReporteSolicitudesDto> listaretorno=new ArrayList<ReporteSolicitudesDto>();
        try {
            for (Object[] r : objSolicitudes) {

                ReporteSolicitudesDto dto = new ReporteSolicitudesDto();

                dto.setDivision(r[0] != null ? r[0].toString() : null);
                dto.setSucursal(r[1] != null ? r[1].toString() : null);
                dto.setRegion(r[2] != null ? r[2].toString() : null);
                dto.setTipoModificacion(r[3] != null ? r[3].toString() : null);
                dto.setFechaModificacion(r[4] != null ? r[4].toString() : null);
                dto.setFolioSolicitudMd(r[5] != null ? r[5].toString() : null);
                dto.setNumeroCuenta(r[6] != null ? r[6].toString() : null);
                dto.setCurp(r[7] != null ? r[7].toString() : null);
                dto.setNss(r[8] != null ? r[8].toString() : null);
                dto.setNombreCompleto(r[9] != null ? r[9].toString() : null);
                dto.setEstatusSolicitud(r[10] != null ? r[10].toString() : null);
                dto.setMotivoDeRechazoProcesar(r[11] != null ? r[11].toString() : null);
                dto.setMotivoDeRechazoOperaciones(r[12] != null ? r[12].toString() : null);
                dto.setFechaSolicitud(r[13] != null ? r[13].toString() : null);
                dto.setNumeroEmpleado(r[14] != null ? r[14].toString() : null);
                dto.setNombreEmpleado(r[15] != null ? r[15].toString() : null);
                dto.setIdFolioUnico(r[16] != null ? r[16].toString() : null);
                dto.setTipoTramite(r[17] != null ? r[17].toString() : null);
                dto.setEstatusMarca(r[18] != null ? r[18].toString() : null);
                dto.setNumeroEnviosProcesar(r[19] != null ? r[19].toString() : null);
                dto.setIndicadorFinado(r[20] != null ? r[20].toString() : null);
                dto.setOrigenSolicitud(r[21] != null ? r[21].toString() : null);
                dto.setEstatusFolioUnico(r[22] != null ? r[22].toString() : null);
                dto.setFlujoValidacion(r[23] != null ? r[23].toString() : null);
                dto.setIndicadorTransitorioCuo(r[24] != null ? r[24].toString() : null);
                dto.setEstatusEnrolamiento(r[25] != null ? r[25].toString() : null);
                dto.setExpIdCapturado(r[26] != null ? r[26].toString() : null);
                dto.setEnrolamientoCapturado(r[27] != null ? r[27].toString() : null);
                dto.setExpedientePlus(r[28] != null ? r[28].toString() : null);
                dto.setExpedienteBatch(r[29] != null ? r[29].toString() : null);
                dto.setTipoSolicitante(r[30] != null ? r[30].toString() : null);
                dto.setCurpSolicitante(r[31] != null ? r[31].toString() : null);
                dto.setFolio(r[32] != null ? r[32].toString() : null);
                dto.setNombreIne(r[33] != null ? r[33].toString() : null);
                dto.setExcepcionAutenticacion(r[34] != null ? r[34].toString() : null);
                dto.setDescripcionExcepcion(r[35] != null ? r[35].toString() : null);
                dto.setIdTipoSolicitud(r[36] != null ? r[36].toString() : null);
                dto.setTipoSolicitud(r[37] != null ? r[37].toString() : null);

                listaretorno.add(dto);
            }
        }catch(Exception ex){
            log.info("Error al crear Solicitudes Obj"+ ex.getLocalizedMessage());
        }
        return listaretorno;
    }


    public static List<ReporteSolicitudesDto125> crearSolicitudesObj125(List<Object[]> objSolicitudes) {
        List<ReporteSolicitudesDto125> listaretorno=new ArrayList<ReporteSolicitudesDto125>();
        try {
            for (Object[] r : objSolicitudes) {

                ReporteSolicitudesDto125 dto = new ReporteSolicitudesDto125();



                listaretorno.add(dto);
            }
        }catch(Exception ex){
            log.info("Error al crear Solicitudes Obj"+ ex.getLocalizedMessage());
        }
        return listaretorno;
    }
}
