
package br.gov.siscomex.cct.consultar_due_ruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaCargasSoltasVeiculo {

    @SerializedName("tipoEmbalagem")
    @Expose
    private Integer tipoEmbalagem;
    @SerializedName("quantidade")
    @Expose
    private Integer quantidade;

    public Integer getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(Integer tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public ListaCargasSoltasVeiculo withTipoEmbalagem(Integer tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
        return this;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ListaCargasSoltasVeiculo withQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tipoEmbalagem", tipoEmbalagem).append("quantidade", quantidade).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(quantidade).append(tipoEmbalagem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaCargasSoltasVeiculo) == false) {
            return false;
        }
        ListaCargasSoltasVeiculo rhs = ((ListaCargasSoltasVeiculo) other);
        return new EqualsBuilder().append(quantidade, rhs.quantidade).append(tipoEmbalagem, rhs.tipoEmbalagem).isEquals();
    }

}
