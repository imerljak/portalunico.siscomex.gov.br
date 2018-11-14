
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NotaFiscal
 * <p>
 * 
 * 
 */
public class NotaFiscal {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("chaveDeAcesso")
    @Expose
    @NotNull
    private String chaveDeAcesso;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("modelo")
    @Expose
    @NotNull
    private String modelo;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("serie")
    @Expose
    @NotNull
    private Integer serie;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("numeroDoDocumento")
    @Expose
    @NotNull
    private Integer numeroDoDocumento;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("ufDoEmissor")
    @Expose
    @NotNull
    private String ufDoEmissor;
    /**
     * IdentificacaoDoEmitente
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("identificacaoDoEmitente")
    @Expose
    @Valid
    @NotNull
    private IdentificacaoDoEmitente identificacaoDoEmitente;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("finalidade")
    @Expose
    @NotNull
    private String finalidade;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("quantidadeDeItens")
    @Expose
    @NotNull
    private Integer quantidadeDeItens;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("notaFicalEletronica")
    @Expose
    @NotNull
    private Boolean notaFicalEletronica;

    /**
     * 
     * (Required)
     * 
     */
    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public NotaFiscal withChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public NotaFiscal withModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getSerie() {
        return serie;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public NotaFiscal withSerie(Integer serie) {
        this.serie = serie;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNumeroDoDocumento(Integer numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public NotaFiscal withNumeroDoDocumento(Integer numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getUfDoEmissor() {
        return ufDoEmissor;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setUfDoEmissor(String ufDoEmissor) {
        this.ufDoEmissor = ufDoEmissor;
    }

    public NotaFiscal withUfDoEmissor(String ufDoEmissor) {
        this.ufDoEmissor = ufDoEmissor;
        return this;
    }

    /**
     * IdentificacaoDoEmitente
     * <p>
     * 
     * (Required)
     * 
     */
    public IdentificacaoDoEmitente getIdentificacaoDoEmitente() {
        return identificacaoDoEmitente;
    }

    /**
     * IdentificacaoDoEmitente
     * <p>
     * 
     * (Required)
     * 
     */
    public void setIdentificacaoDoEmitente(IdentificacaoDoEmitente identificacaoDoEmitente) {
        this.identificacaoDoEmitente = identificacaoDoEmitente;
    }

    public NotaFiscal withIdentificacaoDoEmitente(IdentificacaoDoEmitente identificacaoDoEmitente) {
        this.identificacaoDoEmitente = identificacaoDoEmitente;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getFinalidade() {
        return finalidade;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public NotaFiscal withFinalidade(String finalidade) {
        this.finalidade = finalidade;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public NotaFiscal withQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getNotaFicalEletronica() {
        return notaFicalEletronica;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNotaFicalEletronica(Boolean notaFicalEletronica) {
        this.notaFicalEletronica = notaFicalEletronica;
    }

    public NotaFiscal withNotaFicalEletronica(Boolean notaFicalEletronica) {
        this.notaFicalEletronica = notaFicalEletronica;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("chaveDeAcesso", chaveDeAcesso).append("modelo", modelo).append("serie", serie).append("numeroDoDocumento", numeroDoDocumento).append("ufDoEmissor", ufDoEmissor).append("identificacaoDoEmitente", identificacaoDoEmitente).append("finalidade", finalidade).append("quantidadeDeItens", quantidadeDeItens).append("notaFicalEletronica", notaFicalEletronica).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(quantidadeDeItens).append(chaveDeAcesso).append(finalidade).append(numeroDoDocumento).append(notaFicalEletronica).append(serie).append(ufDoEmissor).append(modelo).append(identificacaoDoEmitente).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotaFiscal) == false) {
            return false;
        }
        NotaFiscal rhs = ((NotaFiscal) other);
        return new EqualsBuilder().append(quantidadeDeItens, rhs.quantidadeDeItens).append(chaveDeAcesso, rhs.chaveDeAcesso).append(finalidade, rhs.finalidade).append(numeroDoDocumento, rhs.numeroDoDocumento).append(notaFicalEletronica, rhs.notaFicalEletronica).append(serie, rhs.serie).append(ufDoEmissor, rhs.ufDoEmissor).append(modelo, rhs.modelo).append(identificacaoDoEmitente, rhs.identificacaoDoEmitente).isEquals();
    }

}
