
package br.gov.siscomex.cct.consultar_conteiner;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaRetorno {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("pesoBruto")
    @Expose
    private Double pesoBruto;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    @Valid
    private Set<String> lacres = new LinkedHashSet<String>();
    @SerializedName("documentosCarga")
    @Expose
    @Valid
    private Set<DocumentosCarga> documentosCarga = new LinkedHashSet<DocumentosCarga>();
    @SerializedName("permiteMovimentacao")
    @Expose
    private Boolean permiteMovimentacao;

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public ListaRetorno withNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public ListaRetorno withPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
        return this;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public ListaRetorno withTara(Double tara) {
        this.tara = tara;
        return this;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    public ListaRetorno withLacres(Set<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    public Set<DocumentosCarga> getDocumentosCarga() {
        return documentosCarga;
    }

    public void setDocumentosCarga(Set<DocumentosCarga> documentosCarga) {
        this.documentosCarga = documentosCarga;
    }

    public ListaRetorno withDocumentosCarga(Set<DocumentosCarga> documentosCarga) {
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
        return new ToStringBuilder(this).append("numeroConteiner", numeroConteiner).append("pesoBruto", pesoBruto).append("tara", tara).append("lacres", lacres).append("documentosCarga", documentosCarga).append("permiteMovimentacao", permiteMovimentacao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lacres).append(numeroConteiner).append(pesoBruto).append(tara).append(permiteMovimentacao).append(documentosCarga).toHashCode();
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
        return new EqualsBuilder().append(lacres, rhs.lacres).append(numeroConteiner, rhs.numeroConteiner).append(pesoBruto, rhs.pesoBruto).append(tara, rhs.tara).append(permiteMovimentacao, rhs.permiteMovimentacao).append(documentosCarga, rhs.documentosCarga).isEquals();
    }

}
