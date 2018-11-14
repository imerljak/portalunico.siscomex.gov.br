
package br.gov.siscomex.catp.operador_estrangeiro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Items {

    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("cnpjRaiz")
    @Expose
    private String cnpjRaiz;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("logradouro")
    @Expose
    private String logradouro;
    @SerializedName("nomeCidade")
    @Expose
    private String nomeCidade;
    @SerializedName("codigoSubdivisaoPais")
    @Expose
    private String codigoSubdivisaoPais;
    @SerializedName("codigoPais")
    @Expose
    private String codigoPais;
    @SerializedName("cep")
    @Expose
    private String cep;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Items withSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    public String getCnpjRaiz() {
        return cnpjRaiz;
    }

    public void setCnpjRaiz(String cnpjRaiz) {
        this.cnpjRaiz = cnpjRaiz;
    }

    public Items withCnpjRaiz(String cnpjRaiz) {
        this.cnpjRaiz = cnpjRaiz;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Items withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Items withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Items withLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Items withNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
        return this;
    }

    public String getCodigoSubdivisaoPais() {
        return codigoSubdivisaoPais;
    }

    public void setCodigoSubdivisaoPais(String codigoSubdivisaoPais) {
        this.codigoSubdivisaoPais = codigoSubdivisaoPais;
    }

    public Items withCodigoSubdivisaoPais(String codigoSubdivisaoPais) {
        this.codigoSubdivisaoPais = codigoSubdivisaoPais;
        return this;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Items withCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Items withCep(String cep) {
        this.cep = cep;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seq", seq).append("cnpjRaiz", cnpjRaiz).append("codigo", codigo).append("nome", nome).append("logradouro", logradouro).append("nomeCidade", nomeCidade).append("codigoSubdivisaoPais", codigoSubdivisaoPais).append("codigoPais", codigoPais).append("cep", cep).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(codigoSubdivisaoPais).append(logradouro).append(nomeCidade).append(cnpjRaiz).append(nome).append(seq).append(codigoPais).append(cep).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Items) == false) {
            return false;
        }
        Items rhs = ((Items) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(codigoSubdivisaoPais, rhs.codigoSubdivisaoPais).append(logradouro, rhs.logradouro).append(nomeCidade, rhs.nomeCidade).append(cnpjRaiz, rhs.cnpjRaiz).append(nome, rhs.nome).append(seq, rhs.seq).append(codigoPais, rhs.codigoPais).append(cep, rhs.cep).isEquals();
    }

}
