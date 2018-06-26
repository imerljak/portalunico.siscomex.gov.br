
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsultarDocumentoTransporte {

    @SerializedName("documentosTransporte")
    @Expose
    private List<DocumentosTransporte> documentosTransporte = new ArrayList<DocumentosTransporte>();
    @SerializedName("mensagens")
    @Expose
    private List<Mensagem> mensagens = new ArrayList<Mensagem>();

    public List<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(List<DocumentosTransporte> documentosTransporte) {
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

        ConsultarDocumentoTransporte that = (ConsultarDocumentoTransporte) o;

        if (documentosTransporte != null ? !documentosTransporte.equals(that.documentosTransporte) : that.documentosTransporte != null)
            return false;
        return mensagens != null ? mensagens.equals(that.mensagens) : that.mensagens == null;
    }

    @Override
    public int hashCode() {
        int result = documentosTransporte != null ? documentosTransporte.hashCode() : 0;
        result = 31 * result + (mensagens != null ? mensagens.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ConsultarDocumentoTransporte{" +
                "documentosTransporte=" + documentosTransporte +
                ", mensagens=" + mensagens +
                '}';
    }
}
