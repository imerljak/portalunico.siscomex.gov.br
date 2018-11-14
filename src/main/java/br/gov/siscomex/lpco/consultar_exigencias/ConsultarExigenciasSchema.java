
package br.gov.siscomex.lpco.consultar_exigencias;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarExigenciasSchema {

    @SerializedName("id")
    @Expose
    private String id;
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
    @SerializedName("situacao")
    @Expose
    @Valid
    private Situacao situacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConsultarExigenciasSchema withId(String id) {
        this.id = id;
        return this;
    }

    public String getExigencia() {
        return exigencia;
    }

    public void setExigencia(String exigencia) {
        this.exigencia = exigencia;
    }

    public ConsultarExigenciasSchema withExigencia(String exigencia) {
        this.exigencia = exigencia;
        return this;
    }

    public String getDataExigencia() {
        return dataExigencia;
    }

    public void setDataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
    }

    public ConsultarExigenciasSchema withDataExigencia(String dataExigencia) {
        this.dataExigencia = dataExigencia;
        return this;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public ConsultarExigenciasSchema withResposta(String resposta) {
        this.resposta = resposta;
        return this;
    }

    public String getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
    }

    public ConsultarExigenciasSchema withDataResposta(String dataResposta) {
        this.dataResposta = dataResposta;
        return this;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public ConsultarExigenciasSchema withSituacao(Situacao situacao) {
        this.situacao = situacao;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("exigencia", exigencia).append("dataExigencia", dataExigencia).append("resposta", resposta).append("dataResposta", dataResposta).append("situacao", situacao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exigencia).append(dataExigencia).append(situacao).append(resposta).append(dataResposta).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarExigenciasSchema) == false) {
            return false;
        }
        ConsultarExigenciasSchema rhs = ((ConsultarExigenciasSchema) other);
        return new EqualsBuilder().append(exigencia, rhs.exigencia).append(dataExigencia, rhs.dataExigencia).append(situacao, rhs.situacao).append(resposta, rhs.resposta).append(dataResposta, rhs.dataResposta).append(id, rhs.id).isEquals();
    }

}
