
package br.gov.siscomex.cct.consultar_due_ruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DocumentosDeTransporte {

    @SerializedName("numeroDocumento")
    @Expose
    private String numeroDocumento;
    @SerializedName("tipoDocumento")
    @Expose
    private String tipoDocumento;
    @SerializedName("identificacaoVeiculo")
    @Expose
    private String identificacaoVeiculo;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public DocumentosDeTransporte withNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public DocumentosDeTransporte withTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

    public DocumentosDeTransporte withIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDocumento", numeroDocumento).append("tipoDocumento", tipoDocumento).append("identificacaoVeiculo", identificacaoVeiculo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tipoDocumento).append(numeroDocumento).append(identificacaoVeiculo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentosDeTransporte) == false) {
            return false;
        }
        DocumentosDeTransporte rhs = ((DocumentosDeTransporte) other);
        return new EqualsBuilder().append(tipoDocumento, rhs.tipoDocumento).append(numeroDocumento, rhs.numeroDocumento).append(identificacaoVeiculo, rhs.identificacaoVeiculo).isEquals();
    }

}
