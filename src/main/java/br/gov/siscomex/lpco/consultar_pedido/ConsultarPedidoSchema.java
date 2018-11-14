
package br.gov.siscomex.lpco.consultar_pedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarPedidoSchema {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("dataRegistro")
    @Expose
    private String dataRegistro;
    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("importadorExportador")
    @Expose
    private String importadorExportador;
    @SerializedName("dataFimVigencia")
    @Expose
    private String dataFimVigencia;
    @SerializedName("dueEmDespacho")
    @Expose
    private String dueEmDespacho;
    @SerializedName("dueVinculada")
    @Expose
    private String dueVinculada;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ConsultarPedidoSchema withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public ConsultarPedidoSchema withDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ConsultarPedidoSchema withSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ConsultarPedidoSchema withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public ConsultarPedidoSchema withNcm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    public String getImportadorExportador() {
        return importadorExportador;
    }

    public void setImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
    }

    public ConsultarPedidoSchema withImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
        return this;
    }

    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public ConsultarPedidoSchema withDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
        return this;
    }

    public String getDueEmDespacho() {
        return dueEmDespacho;
    }

    public void setDueEmDespacho(String dueEmDespacho) {
        this.dueEmDespacho = dueEmDespacho;
    }

    public ConsultarPedidoSchema withDueEmDespacho(String dueEmDespacho) {
        this.dueEmDespacho = dueEmDespacho;
        return this;
    }

    public String getDueVinculada() {
        return dueVinculada;
    }

    public void setDueVinculada(String dueVinculada) {
        this.dueVinculada = dueVinculada;
    }

    public ConsultarPedidoSchema withDueVinculada(String dueVinculada) {
        this.dueVinculada = dueVinculada;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numero", numero).append("dataRegistro", dataRegistro).append("situacao", situacao).append("nome", nome).append("ncm", ncm).append("importadorExportador", importadorExportador).append("dataFimVigencia", dataFimVigencia).append("dueEmDespacho", dueEmDespacho).append("dueVinculada", dueVinculada).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dueEmDespacho).append(situacao).append(numero).append(dataRegistro).append(dueVinculada).append(importadorExportador).append(ncm).append(nome).append(dataFimVigencia).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarPedidoSchema) == false) {
            return false;
        }
        ConsultarPedidoSchema rhs = ((ConsultarPedidoSchema) other);
        return new EqualsBuilder().append(dueEmDespacho, rhs.dueEmDespacho).append(situacao, rhs.situacao).append(numero, rhs.numero).append(dataRegistro, rhs.dataRegistro).append(dueVinculada, rhs.dueVinculada).append(importadorExportador, rhs.importadorExportador).append(ncm, rhs.ncm).append(nome, rhs.nome).append(dataFimVigencia, rhs.dataFimVigencia).isEquals();
    }

}
