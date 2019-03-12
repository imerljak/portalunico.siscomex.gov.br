
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaDocumentoTransporteMIC {

    @SerializedName("documentosTransporte")
    @Expose
    private Set<DocumentosTransporte> documentosTransporte = null;

    public Set<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(Set<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
    }

}
