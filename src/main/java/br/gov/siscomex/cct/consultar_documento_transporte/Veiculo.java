
package br.gov.siscomex.cct.consultar_documento_transporte;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Veiculo {

    @SerializedName("nomeCondutor")
    @Expose
    private String nomeCondutor;
    @SerializedName("cpfCondutor")
    @Expose
    private String cpfCondutor;
    @SerializedName("documentoCondutor")
    @Expose
    private String documentoCondutor;
    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    @Valid
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public Veiculo withNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
        return this;
    }

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

    public Veiculo withCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
        return this;
    }

    public String getDocumentoCondutor() {
        return documentoCondutor;
    }

    public void setDocumentoCondutor(String documentoCondutor) {
        this.documentoCondutor = documentoCondutor;
    }

    public Veiculo withDocumentoCondutor(String documentoCondutor) {
        this.documentoCondutor = documentoCondutor;
        return this;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo withPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Veiculo withTara(Double tara) {
        this.tara = tara;
        return this;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    public Veiculo withLacres(Set<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nomeCondutor", nomeCondutor).append("cpfCondutor", cpfCondutor).append("documentoCondutor", documentoCondutor).append("placa", placa).append("tara", tara).append("lacres", lacres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(documentoCondutor).append(lacres).append(tara).append(cpfCondutor).append(nomeCondutor).append(placa).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Veiculo) == false) {
            return false;
        }
        Veiculo rhs = ((Veiculo) other);
        return new EqualsBuilder().append(documentoCondutor, rhs.documentoCondutor).append(lacres, rhs.lacres).append(tara, rhs.tara).append(cpfCondutor, rhs.cpfCondutor).append(nomeCondutor, rhs.nomeCondutor).append(placa, rhs.placa).isEquals();
    }

}
