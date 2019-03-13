
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultaDocumentoTransporteEspecifico {

    @SerializedName("documentosTransporte")
    @Expose
    @Valid
    private Set<DocumentosTransporte> documentosTransporte = null;

    public Set<DocumentosTransporte> getDocumentosTransporte() {
        return documentosTransporte;
    }

    public void setDocumentosTransporte(Set<DocumentosTransporte> documentosTransporte) {
        this.documentosTransporte = documentosTransporte;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("documentosTransporte", documentosTransporte).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(documentosTransporte).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultaDocumentoTransporteEspecifico) == false) {
            return false;
        }
        ConsultaDocumentoTransporteEspecifico rhs = ((ConsultaDocumentoTransporteEspecifico) other);
        return new EqualsBuilder().append(documentosTransporte, rhs.documentosTransporte).isEquals();
    }

}
