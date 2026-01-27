package mx.com.profuturo.md.services.entity.afognp;

import mx.com.profuturo.md.services.dto.TtaFmdFolioUnicoSolicitudesId;

//import javax.persistence.*;
import java.io.Serializable;

//@Entity
//@Table(name = "TTAFMD_FOLIO_UNICO_SOLICITUDES", schema = "AFOGNP")
///@IdClass(TtaFmdFolioUnicoSolicitudesId.class)
public class TtaFmdFolioUnicoSolicitudes implements Serializable {

    //@Id
    //@Column(name = "ID_FOLIO_UNICO", nullable = false)
    private Long idFolioUnico;

    //@Id
    //@Column(name = "ID_SOLICITUD_MD", nullable = false)
    private Long idSolicitudMd;

    public TtaFmdFolioUnicoSolicitudes() {
    }

    public Long getIdFolioUnico() {
        return idFolioUnico;
    }

    public void setIdFolioUnico(Long idFolioUnico) {
        this.idFolioUnico = idFolioUnico;
    }

    public Long getIdSolicitudMd() {
        return idSolicitudMd;
    }

    public void setIdSolicitudMd(Long idSolicitudMd) {
        this.idSolicitudMd = idSolicitudMd;
    }
}