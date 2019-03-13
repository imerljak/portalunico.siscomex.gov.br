
package br.gov.siscomex.cct.consultar_mruc;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DocumentosCarga {

    @SerializedName("nivel")
    @Expose
    private String nivel;
    @SerializedName("documentos")
    @Expose
    @Valid
    private List<Documento> documentos = new ArrayList<Documento>();

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public DocumentosCarga withNivel(String nivel) {
        this.nivel = nivel;
        return this;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public DocumentosCarga withDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nivel", nivel).append("documentos", documentos).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nivel).append(documentos).toHashCode();
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
        return new EqualsBuilder().append(nivel, rhs.nivel).append(documentos, rhs.documentos).isEquals();
    }

}
