
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import br.gov.siscomex.portalunico.cct.consultardocumentotransporte.Mensagem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultaDocumentoTransporteEspecifico {

    @SerializedName("documentosTransporte")
    @Expose
    private Set<DocumentosTransporte> documentosTransporte = null;

    @SerializedName("mensagens")
    @Expose
    private List<Mensagem> mensagens;

    public Set<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(Set<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaDocumentoTransporteEspecifico that = (ConsultaDocumentoTransporteEspecifico) o;
        return Objects.equals(documentosTransporte, that.documentosTransporte) &&
                Objects.equals(mensagens, that.mensagens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentosTransporte, mensagens);
    }

    @Override
    public String toString() {
        return "ConsultaDocumentoTransporteEspecifico{" +
                "documentosTransporte=" + documentosTransporte +
                ", mensagens=" + mensagens +
                '}';
    }
}
