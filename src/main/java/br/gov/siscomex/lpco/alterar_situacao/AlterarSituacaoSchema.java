
package br.gov.siscomex.lpco.alterar_situacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AlterarSituacaoSchema {

    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("justificativa")
    @Expose
    private String justificativa;
    @SerializedName("dataInicioVigencia")
    @Expose
    private String dataInicioVigencia;
    @SerializedName("dataFinalVigencia")
    @Expose
    private String dataFinalVigencia;
    @SerializedName("numeroOrgaoOrigem")
    @Expose
    private String numeroOrgaoOrigem;
    @SerializedName("requerInspecao")
    @Expose
    private Boolean requerInspecao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public AlterarSituacaoSchema withSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public AlterarSituacaoSchema withJustificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    public String getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public AlterarSituacaoSchema withDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
        return this;
    }

    public String getDataFinalVigencia() {
        return dataFinalVigencia;
    }

    public void setDataFinalVigencia(String dataFinalVigencia) {
        this.dataFinalVigencia = dataFinalVigencia;
    }

    public AlterarSituacaoSchema withDataFinalVigencia(String dataFinalVigencia) {
        this.dataFinalVigencia = dataFinalVigencia;
        return this;
    }

    public String getNumeroOrgaoOrigem() {
        return numeroOrgaoOrigem;
    }

    public void setNumeroOrgaoOrigem(String numeroOrgaoOrigem) {
        this.numeroOrgaoOrigem = numeroOrgaoOrigem;
    }

    public AlterarSituacaoSchema withNumeroOrgaoOrigem(String numeroOrgaoOrigem) {
        this.numeroOrgaoOrigem = numeroOrgaoOrigem;
        return this;
    }

    public Boolean getRequerInspecao() {
        return requerInspecao;
    }

    public void setRequerInspecao(Boolean requerInspecao) {
        this.requerInspecao = requerInspecao;
    }

    public AlterarSituacaoSchema withRequerInspecao(Boolean requerInspecao) {
        this.requerInspecao = requerInspecao;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("situacao", situacao).append("justificativa", justificativa).append("dataInicioVigencia", dataInicioVigencia).append("dataFinalVigencia", dataFinalVigencia).append("numeroOrgaoOrigem", numeroOrgaoOrigem).append("requerInspecao", requerInspecao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requerInspecao).append(situacao).append(justificativa).append(dataFinalVigencia).append(dataInicioVigencia).append(numeroOrgaoOrigem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlterarSituacaoSchema) == false) {
            return false;
        }
        AlterarSituacaoSchema rhs = ((AlterarSituacaoSchema) other);
        return new EqualsBuilder().append(requerInspecao, rhs.requerInspecao).append(situacao, rhs.situacao).append(justificativa, rhs.justificativa).append(dataFinalVigencia, rhs.dataFinalVigencia).append(dataInicioVigencia, rhs.dataInicioVigencia).append(numeroOrgaoOrigem, rhs.numeroOrgaoOrigem).isEquals();
    }

}
