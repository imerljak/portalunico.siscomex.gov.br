
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import java.util.List;
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
    private List<String> lacres = null;

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

    public String getDocumentoCondutor() {
        return documentoCondutor;
    }

    public void setDocumentoCondutor(String documentoCondutor) {
        this.documentoCondutor = documentoCondutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nomeCondutor", nomeCondutor).append("cpfCondutor", cpfCondutor).append("documentoCondutor", documentoCondutor).append("placa", placa).append("tara", tara).append("lacres", lacres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lacres).append(tara).append(documentoCondutor).append(cpfCondutor).append(nomeCondutor).append(placa).toHashCode();
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
        return new EqualsBuilder().append(lacres, rhs.lacres).append(tara, rhs.tara).append(documentoCondutor, rhs.documentoCondutor).append(cpfCondutor, rhs.cpfCondutor).append(nomeCondutor, rhs.nomeCondutor).append(placa, rhs.placa).isEquals();
    }

}
