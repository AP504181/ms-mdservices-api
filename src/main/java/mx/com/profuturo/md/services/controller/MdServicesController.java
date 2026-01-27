package mx.com.profuturo.md.services.controller;

import lombok.extern.slf4j.Slf4j;
import mx.com.profuturo.md.services.commons.Utils;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto;
import mx.com.profuturo.md.services.dto.ReporteSolicitudesDto125;
import mx.com.profuturo.md.services.dto.entrada.SolicitudesMdFecha;
import mx.com.profuturo.md.services.service.MdSolicitudesService;
import mx.com.profuturo.md.services.service.MdSolicitudesServiceMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/md/services")
@Tag(name = Utils.NAME, description = Utils.DESCRIPTION)
@Slf4j
public class MdServicesController {

	@Autowired
	private MdSolicitudesService mdsolicitudesservice;

	@Autowired
	private MdSolicitudesServiceMock mdsolicitudesservicemock;

	@CrossOrigin(origins = "*")
	@PostMapping("/consultarMdCognos024")
	public List<ReporteSolicitudesDto> consultarmdcognos024(@RequestBody SolicitudesMdFecha fechasmd) throws Exception {
		log.info("consultarmdcognos Controller");
		List<ReporteSolicitudesDto> retorno=mdsolicitudesservicemock.obtenersolicitudescognos24(fechasmd);

		return  retorno;
	}
	@CrossOrigin(origins = "*")
	@PostMapping("/consultarMdCognos125")
	public List<ReporteSolicitudesDto125> consultarmdcognos125(@RequestBody SolicitudesMdFecha fechasmd) throws Exception {
		log.info("consultarmdcognos Controller");
		List<ReporteSolicitudesDto125> retorno=mdsolicitudesservicemock.obtenersolicitudescognos125(fechasmd);

		return  retorno;
	}
}
