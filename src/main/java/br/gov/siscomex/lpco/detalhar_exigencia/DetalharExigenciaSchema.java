
package br.gov.siscomex.lpco.detalhar_exigencia;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DetalharExigenciaSchema {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("exigencia")
    @Expose
    private String exigencia;
    @SerializedName("dataExigencia")
    @Expose
    private String dataExigencia;
    @SerializedName("resposta")
    @Expose
    private String resposta;
    @SerializedName("dataResposta")
    @Expose
    private String dataResposta;
    @SerializedName("justificativa")
    @Expose
    private String justificativa;
    @SerializedName("situacao")
    @Expose
    @Valid
    private Situacao situacao;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DetalharExigenciaSchema withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getExigencia() {
        return exigencia;
    }

    public void setExigencia(String exigencia) {
        this.exigencia = exigencia;
    }

    public DetalharExigenciaSchema withExigencia(String exigencia) {
        this.exigencia = exigencia;
        return this;
    }

    public String getDataExigencia() {
        return dataExigencia;
    }

    public void setDataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
    }

    public DetalharExigenciaSchema withDataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
        return this;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public DetalharExigenciaSchema withResposta(String resposta) {
        this.resposta = resposta;
        return this;
    }

    public String getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
    }

    public DetalharExigenciaSchema withDataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
        return this;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public DetalharExigenciaSchema withJustificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public DetalharExigenciaSchema withSituacao(Situacao situacao) {
        this.situacao = situacao;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numero", numero).append("exigencia", exigencia).append("dataExigencia", dataExigencia).append("resposta", resposta).append("dataResposta", dataResposta).append("justificativa", justificativa).append("situacao", situacao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exigencia).append(dataExigencia).append(situacao).append(numero).append(resposta).append(justificativa).append(dataResposta).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharExigenciaSchema) == false) {
            return false;
        }
        DetalharExigenciaSchema rhs = ((DetalharExigenciaSchema) other);
        return new EqualsBuilder().append(exigencia, rhs.exigencia).append(dataExigencia, rhs.dataExigencia).append(situacao, rhs.situacao).append(numero, rhs.numero).append(resposta, rhs.resposta).append(justificativa, rhs.justificativa).append(dataResposta, rhs.dataResposta).isEquals();
    }

}
