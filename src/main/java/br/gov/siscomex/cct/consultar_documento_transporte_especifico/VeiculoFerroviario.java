
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class VeiculoFerroviario {

    @SerializedName("prefixoTrem")
    @Expose
    private String prefixoTrem;
    @SerializedName("quantidadeVagoes")
    @Expose
    private Integer quantidadeVagoes;

    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public void setPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
    }

    public Integer getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("prefixoTrem", prefixoTrem).append("quantidadeVagoes", quantidadeVagoes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(prefixoTrem).append(quantidadeVagoes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VeiculoFerroviario) == false) {
            return false;
        }
        VeiculoFerroviario rhs = ((VeiculoFerroviario) other);
        return new EqualsBuilder().append(prefixoTrem, rhs.prefixoTrem).append(quantidadeVagoes, rhs.quantidadeVagoes).isEquals();
    }

}
