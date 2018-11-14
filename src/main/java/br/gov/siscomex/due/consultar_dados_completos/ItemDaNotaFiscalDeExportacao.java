
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ItemDaNotaFiscalDeExportacao
 * <p>
 * 
 * 
 */
public class ItemDaNotaFiscalDeExportacao {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("numeroDoItem")
    @Expose
    @NotNull
    private Integer numeroDoItem;
    /**
     * NotaFiscal
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("notaFiscal")
    @Expose
    @Valid
    @NotNull
    private NotaFiscal notaFiscal;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("cfop")
    @Expose
    @NotNull
    private Integer cfop;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("codigoDoProduto")
    @Expose
    @NotNull
    private String codigoDoProduto;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("descricao")
    @Expose
    @NotNull
    private String descricao;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("quantidadeEstatistica")
    @Expose
    @NotNull
    private Integer quantidadeEstatistica;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("unidadeComercial")
    @Expose
    @NotNull
    private String unidadeComercial;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("valorTotalCalculado")
    @Expose
    @NotNull
    private Integer valorTotalCalculado;
    /**
     * Ncm
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("ncm")
    @Expose
    @Valid
    @NotNull
    private Ncm ncm;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("apresentadaParaDespacho")
    @Expose
    @NotNull
    private Boolean apresentadaParaDespacho;

    /**
     * 
     * (Required)
     * 
     */
    public Integer getNumeroDoItem() {
        return numeroDoItem;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNumeroDoItem(Integer numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }

    public ItemDaNotaFiscalDeExportacao withNumeroDoItem(Integer numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
        return this;
    }

    /**
     * NotaFiscal
     * <p>
     * 
     * (Required)
     * 
     */
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    /**
     * NotaFiscal
     * <p>
     * 
     * (Required)
     * 
     */
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public ItemDaNotaFiscalDeExportacao withNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getCfop() {
        return cfop;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public ItemDaNotaFiscalDeExportacao withCfop(Integer cfop) {
        this.cfop = cfop;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public ItemDaNotaFiscalDeExportacao withCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ItemDaNotaFiscalDeExportacao withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getQuantidadeEstatistica() {
        return quantidadeEstatistica;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setQuantidadeEstatistica(Integer quantidadeEstatistica) {
        this.quantidadeEstatistica = quantidadeEstatistica;
    }

    public ItemDaNotaFiscalDeExportacao withQuantidadeEstatistica(Integer quantidadeEstatistica) {
        this.quantidadeEstatistica = quantidadeEstatistica;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getUnidadeComercial() {
        return unidadeComercial;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setUnidadeComercial(String unidadeComercial) {
        this.unidadeComercial = unidadeComercial;
    }

    public ItemDaNotaFiscalDeExportacao withUnidadeComercial(String unidadeComercial) {
        this.unidadeComercial = unidadeComercial;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setValorTotalCalculado(Integer valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }

    public ItemDaNotaFiscalDeExportacao withValorTotalCalculado(Integer valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
        return this;
    }

    /**
     * Ncm
     * <p>
     * 
     * (Required)
     * 
     */
    public Ncm getNcm() {
        return ncm;
    }

    /**
     * Ncm
     * <p>
     * 
     * (Required)
     * 
     */
    public void setNcm(Ncm ncm) {
        this.ncm = ncm;
    }

    public ItemDaNotaFiscalDeExportacao withNcm(Ncm ncm) {
        this.ncm = ncm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getApresentadaParaDespacho() {
        return apresentadaParaDespacho;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setApresentadaParaDespacho(Boolean apresentadaParaDespacho) {
        this.apresentadaParaDespacho = apresentadaParaDespacho;
    }

    public ItemDaNotaFiscalDeExportacao withApresentadaParaDespacho(Boolean apresentadaParaDespacho) {
        this.apresentadaParaDespacho = apresentadaParaDespacho;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDoItem", numeroDoItem).append("notaFiscal", notaFiscal).append("cfop", cfop).append("codigoDoProduto", codigoDoProduto).append("descricao", descricao).append("quantidadeEstatistica", quantidadeEstatistica).append("unidadeComercial", unidadeComercial).append("valorTotalCalculado", valorTotalCalculado).append("ncm", ncm).append("apresentadaParaDespacho", apresentadaParaDespacho).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(valorTotalCalculado).append(codigoDoProduto).append(numeroDoItem).append(quantidadeEstatistica).append(unidadeComercial).append(ncm).append(cfop).append(notaFiscal).append(apresentadaParaDespacho).append(descricao).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemDaNotaFiscalDeExportacao) == false) {
            return false;
        }
        ItemDaNotaFiscalDeExportacao rhs = ((ItemDaNotaFiscalDeExportacao) other);
        return new EqualsBuilder().append(valorTotalCalculado, rhs.valorTotalCalculado).append(codigoDoProduto, rhs.codigoDoProduto).append(numeroDoItem, rhs.numeroDoItem).append(quantidadeEstatistica, rhs.quantidadeEstatistica).append(unidadeComercial, rhs.unidadeComercial).append(ncm, rhs.ncm).append(cfop, rhs.cfop).append(notaFiscal, rhs.notaFiscal).append(apresentadaParaDespacho, rhs.apresentadaParaDespacho).append(descricao, rhs.descricao).isEquals();
    }

}
