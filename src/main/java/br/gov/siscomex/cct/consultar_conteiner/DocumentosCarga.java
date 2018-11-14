
package br.gov.siscomex.cct.consultar_conteiner;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DocumentosCarga {

    @SerializedName("documentos")
    @Expose
    @Valid
    private Set<Documento> documentos = new LinkedHashSet<Documento>();

    public Set<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }

    public DocumentosCarga withDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("documentos", documentos).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(documentos).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentosCarga) == false) {
            return false;
        }
        DocumentosCarga rhs = ((DocumentosCarga) other);
        return new EqualsBuilder().append(documentos, rhs.documentos).isEquals();
    }

}
