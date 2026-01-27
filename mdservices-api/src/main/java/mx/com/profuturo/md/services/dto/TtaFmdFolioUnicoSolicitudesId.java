package mx.com.profuturo.md.services.dto;

import java.io.Serializable;
import java.util.Objects;

public class TtaFmdFolioUnicoSolicitudesId implements Serializable {

    private Long idFolioUnico;
    private Long idSolicitudMd;

    public TtaFmdFolioUnicoSolicitudesId() {
    }

    public TtaFmdFolioUnicoSolicitudesId(Long idFolioUnico, Long idSolicitudMd) {
        this.idFolioUnico = idFolioUnico;
        this.idSolicitudMd = idSolicitudMd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TtaFmdFolioUnicoSolicitudesId)) return false;
        TtaFmdFolioUnicoSolicitudesId that = (TtaFmdFolioUnicoSolicitudesId) o;
        return Objects.equals(idFolioUnico, that.idFolioUnico) &&
                Objects.equals(idSolicitudMd, that.idSolicitudMd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFolioUnico, idSolicitudMd);
    }
}