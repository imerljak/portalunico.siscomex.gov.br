
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import java.util.Objects;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaDocumentoTransporteEspecifico {

    @SerializedName("documentosTransporte")
    @Expose
    private Set<DocumentosTransporte> documentosTransporte = null;

    public Set<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(Set<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaDocumentoTransporteEspecifico that = (ConsultaDocumentoTransporteEspecifico) o;
        return Objects.equals(documentosTransporte, that.documentosTransporte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentosTransporte);
    }

    @Override
    public String toString() {
        return "ConsultaDocumentoTransporteEspecifico{" +
                "documentosTransporte=" + documentosTransporte +
                '}';
    }
}
