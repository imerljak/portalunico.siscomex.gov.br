
package br.gov.siscomex.cct.consultar_mruc;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaRetorno {

    @SerializedName("numeroMRUC")
    @Expose
    private String numeroMRUC;
    @SerializedName("documentosCarga")
    @Expose
    @Valid
    private List<DocumentosCarga> documentosCarga = new ArrayList<DocumentosCarga>();
    @SerializedName("permiteMovimentacao")
    @Expose
    private Boolean permiteMovimentacao;

    public String getNumeroMRUC() {
        return numeroMRUC;
    }

    public void setNumeroMRUC(String numeroMRUC) {
        this.numeroMRUC = numeroMRUC;
    }

    public ListaRetorno withNumeroMRUC(String numeroMRUC) {
        this.numeroMRUC = numeroMRUC;
        return this;
    }

    public List<DocumentosCarga> getDocumentosCarga() {
        return documentosCarga;
    }

    public void setDocumentosCarga(List<DocumentosCarga> documentosCarga) {
        this.documentosCarga = documentosCarga;
    }

    public ListaRetorno withDocumentosCarga(List<DocumentosCarga> documentosCarga) {
        this.documentosCarga = documentosCarga;
        return this;
    }

    public Boolean getPermiteMovimentacao() {
        return permiteMovimentacao;
    }

    public void setPermiteMovimentacao(Boolean permiteMovimentacao) {
        this.permiteMovimentacao = permiteMovimentacao;
    }

    public ListaRetorno withPermiteMovimentacao(Boolean permiteMovimentacao) {
        this.permiteMovimentacao = permiteMovimentacao;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroMRUC", numeroMRUC).append("documentosCarga", documentosCarga).append("permiteMovimentacao", permiteMovimentacao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(permiteMovimentacao).append(documentosCarga).append(numeroMRUC).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaRetorno) == false) {
            return false;
        }
        ListaRetorno rhs = ((ListaRetorno) other);
        return new EqualsBuilder().append(permiteMovimentacao, rhs.permiteMovimentacao).append(documentosCarga, rhs.documentosCarga).append(numeroMRUC, rhs.numeroMRUC).isEquals();
    }

}
