package mx.com.profuturo.md.services.service;

import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto125;
import mx.com.profuturo.md.services.dto.entrada.SolicitudesMdFecha;
import mx.com.profuturo.md.services.repository.afognp.SolicitudesRepository;
import mx.com.profuturo.md.services.utils.crearObjetosList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MdSolicitudesServiceImpl implements MdSolicitudesService {
	//@Autowired
	//private SolicitudesRepository solicitudesrepository;

	@Override
	public List<ReporteSolicitudesDto> obtenersolicitudescognos24(SolicitudesMdFecha fechasmd) {
		log.info("Entro obtenersolicitudescognos24 entrada: {} ", fechasmd);
		List<ReporteSolicitudesDto> retorno=new ArrayList<ReporteSolicitudesDto>();
		try{

			//List<Object[]> consulta024=solicitudesrepository.obtenerReporteCognosMdR0024("","");
			//retorno= crearObjetosList.crearSolicitudesObj024(consulta024);
			log.info("Retorno de datos obtenersolicitudescognos24: {} ", retorno);

		}catch (Exception ex){
			log.error("Error de datos obtenersolicitudescognos24: {} ", ex);
		}

		return retorno;
	}

	@Override
	public List<ReporteSolicitudesDto125> obtenersolicitudescognos125(SolicitudesMdFecha fechasmd) {
		log.info("Entro obtenersolicitudescognos125 entrada: {} ", fechasmd);
		List<ReporteSolicitudesDto125> retorno=new ArrayList<ReporteSolicitudesDto125>();
		try{

			//List<Object[]> consulta0125=solicitudesrepository.obtenerReporteCognosMdR0125("","");
			//List<ReporteSolicitudesDto125> retorno125= crearObjetosList.crearSolicitudesObj125(consulta0125);
			log.info("Retorno de datos obtenersolicitudescognos125: {} ", retorno);

		}catch (Exception ex){
			log.error("Error de datos obtenersolicitudescognos125: {} ", ex);
		}

		return retorno;
	}
	private String reemplazoCaracteresHTML(String s) {
		s = s.replace("&", "&amp;");
		s = s.replace("ñ", "&ntilde;");
		s = s.replace("Ñ", "&Ntilde;");
		s = s.replace("á", "&aacute;");
		s = s.replace("é", "&eacute;");
		s = s.replace("í", "&iacute;");
		s = s.replace("ó", "&oacute;");
		s = s.replace("ú", "&uacute;");
		s = s.replace("Á", "&Aacute;");
		s = s.replace("É", "&Eacute;");
		s = s.replace("Í", "&Iacute;");
		s = s.replace("Ó", "&Oacute;");
		s = s.replace("Ú", "&Uacute;");
		s = s.replace("€", "&euro;");
		
		return s;
	}


}
