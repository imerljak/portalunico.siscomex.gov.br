
package br.gov.siscomex.cct.consultar_documento_transporte;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarDocumentoTransporteSchema {

    @SerializedName("documentosTransporte")
    @Expose
    @Valid
    private List<DocumentosTransporte> documentosTransporte = new ArrayList<DocumentosTransporte>();
    @SerializedName("mensagens")
    @Expose
    @Valid
    private List<Mensagen> mensagens = new ArrayList<Mensagen>();

    public List<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(List<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
    }

    public ConsultarDocumentoTransporteSchema withDocumentosTransporte(List<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
        return this;
    }

    public List<Mensagen> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagen> mensagens) {
        this.mensagens = mensagens;
    }

    public ConsultarDocumentoTransporteSchema withMensagens(List<Mensagen> mensagens) {
        this.mensagens = mensagens;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("documentosTransporte", documentosTransporte).append("mensagens", mensagens).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mensagens).append(documentosTransporte).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDocumentoTransporteSchema) == false) {
            return false;
        }
        ConsultarDocumentoTransporteSchema rhs = ((ConsultarDocumentoTransporteSchema) other);
        return new EqualsBuilder().append(mensagens, rhs.mensagens).append(documentosTransporte, rhs.documentosTransporte).isEquals();
    }

}
