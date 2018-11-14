
package br.gov.siscomex.due.consultar_dados_completos;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Iten
 * <p>
 * 
 * 
 */
public class Iten {

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
    @SerializedName("quantidadeNaUnidadeEstatistica")
    @Expose
    @NotNull
    private Integer quantidadeNaUnidadeEstatistica;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("numero")
    @Expose
    @NotNull
    private Integer numero;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("pesoLiquidoTotal")
    @Expose
    @NotNull
    private Integer pesoLiquidoTotal;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("valorDaMercadoriaNaCondicaoDeVenda")
    @Expose
    @NotNull
    private Double valorDaMercadoriaNaCondicaoDeVenda;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("valorDaMercadoriaNoLocalDeEmbarque")
    @Expose
    @NotNull
    private Integer valorDaMercadoriaNoLocalDeEmbarque;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("valorDaMercadoriaNoLocalDeEmbarqueEmReais")
    @Expose
    @NotNull
    private Double valorDaMercadoriaNoLocalDeEmbarqueEmReais;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("dataDeConversao")
    @Expose
    @NotNull
    private String dataDeConversao;
    /**
     * ItemDaNotaFiscalDeExportacao
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("itemDaNotaFiscalDeExportacao")
    @Expose
    @Valid
    @NotNull
    private ItemDaNotaFiscalDeExportacao itemDaNotaFiscalDeExportacao;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("motivoDoTratamentoPrioritario")
    @Expose
    @NotNull
    private String motivoDoTratamentoPrioritario;
    /**
     * Exportador
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("exportador")
    @Expose
    @Valid
    @NotNull
    private Exportador exportador;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("unidadeComercializada")
    @Expose
    @NotNull
    private String unidadeComercializada;
    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("codigoCondicaoVenda")
    @Expose
    @Valid
    @NotNull
    private CodigoCondicaoVenda codigoCondicaoVenda;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("nomeImportador")
    @Expose
    @NotNull
    private String nomeImportador;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("enderecoImportador")
    @Expose
    @NotNull
    private String enderecoImportador;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("listaPaisDestino")
    @Expose
    @Valid
    @NotNull
    private List<ListaPaisDestino> listaPaisDestino = new ArrayList<ListaPaisDestino>();

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

    public Iten withNcm(Ncm ncm) {
        this.ncm = ncm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getQuantidadeNaUnidadeEstatistica() {
        return quantidadeNaUnidadeEstatistica;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setQuantidadeNaUnidadeEstatistica(Integer quantidadeNaUnidadeEstatistica) {
        this.quantidadeNaUnidadeEstatistica = quantidadeNaUnidadeEstatistica;
    }

    public Iten withQuantidadeNaUnidadeEstatistica(Integer quantidadeNaUnidadeEstatistica) {
        this.quantidadeNaUnidadeEstatistica = quantidadeNaUnidadeEstatistica;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Iten withNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getPesoLiquidoTotal() {
        return pesoLiquidoTotal;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setPesoLiquidoTotal(Integer pesoLiquidoTotal) {
        this.pesoLiquidoTotal = pesoLiquidoTotal;
    }

    public Iten withPesoLiquidoTotal(Integer pesoLiquidoTotal) {
        this.pesoLiquidoTotal = pesoLiquidoTotal;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Double getValorDaMercadoriaNaCondicaoDeVenda() {
        return valorDaMercadoriaNaCondicaoDeVenda;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setValorDaMercadoriaNaCondicaoDeVenda(Double valorDaMercadoriaNaCondicaoDeVenda) {
        this.valorDaMercadoriaNaCondicaoDeVenda = valorDaMercadoriaNaCondicaoDeVenda;
    }

    public Iten withValorDaMercadoriaNaCondicaoDeVenda(Double valorDaMercadoriaNaCondicaoDeVenda) {
        this.valorDaMercadoriaNaCondicaoDeVenda = valorDaMercadoriaNaCondicaoDeVenda;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getValorDaMercadoriaNoLocalDeEmbarque() {
        return valorDaMercadoriaNoLocalDeEmbarque;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setValorDaMercadoriaNoLocalDeEmbarque(Integer valorDaMercadoriaNoLocalDeEmbarque) {
        this.valorDaMercadoriaNoLocalDeEmbarque = valorDaMercadoriaNoLocalDeEmbarque;
    }

    public Iten withValorDaMercadoriaNoLocalDeEmbarque(Integer valorDaMercadoriaNoLocalDeEmbarque) {
        this.valorDaMercadoriaNoLocalDeEmbarque = valorDaMercadoriaNoLocalDeEmbarque;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Double getValorDaMercadoriaNoLocalDeEmbarqueEmReais() {
        return valorDaMercadoriaNoLocalDeEmbarqueEmReais;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setValorDaMercadoriaNoLocalDeEmbarqueEmReais(Double valorDaMercadoriaNoLocalDeEmbarqueEmReais) {
        this.valorDaMercadoriaNoLocalDeEmbarqueEmReais = valorDaMercadoriaNoLocalDeEmbarqueEmReais;
    }

    public Iten withValorDaMercadoriaNoLocalDeEmbarqueEmReais(Double valorDaMercadoriaNoLocalDeEmbarqueEmReais) {
        this.valorDaMercadoriaNoLocalDeEmbarqueEmReais = valorDaMercadoriaNoLocalDeEmbarqueEmReais;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getDataDeConversao() {
        return dataDeConversao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataDeConversao(String dataDeConversao) {
        this.dataDeConversao = dataDeConversao;
    }

    public Iten withDataDeConversao(String dataDeConversao) {
        this.dataDeConversao = dataDeConversao;
        return this;
    }

    /**
     * ItemDaNotaFiscalDeExportacao
     * <p>
     * 
     * (Required)
     * 
     */
    public ItemDaNotaFiscalDeExportacao getItemDaNotaFiscalDeExportacao() {
        return itemDaNotaFiscalDeExportacao;
    }

    /**
     * ItemDaNotaFiscalDeExportacao
     * <p>
     * 
     * (Required)
     * 
     */
    public void setItemDaNotaFiscalDeExportacao(ItemDaNotaFiscalDeExportacao itemDaNotaFiscalDeExportacao) {
        this.itemDaNotaFiscalDeExportacao = itemDaNotaFiscalDeExportacao;
    }

    public Iten withItemDaNotaFiscalDeExportacao(ItemDaNotaFiscalDeExportacao itemDaNotaFiscalDeExportacao) {
        this.itemDaNotaFiscalDeExportacao = itemDaNotaFiscalDeExportacao;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getMotivoDoTratamentoPrioritario() {
        return motivoDoTratamentoPrioritario;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setMotivoDoTratamentoPrioritario(String motivoDoTratamentoPrioritario) {
        this.motivoDoTratamentoPrioritario = motivoDoTratamentoPrioritario;
    }

    public Iten withMotivoDoTratamentoPrioritario(String motivoDoTratamentoPrioritario) {
        this.motivoDoTratamentoPrioritario = motivoDoTratamentoPrioritario;
        return this;
    }

    /**
     * Exportador
     * <p>
     * 
     * (Required)
     * 
     */
    public Exportador getExportador() {
        return exportador;
    }

    /**
     * Exportador
     * <p>
     * 
     * (Required)
     * 
     */
    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    public Iten withExportador(Exportador exportador) {
        this.exportador = exportador;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getUnidadeComercializada() {
        return unidadeComercializada;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setUnidadeComercializada(String unidadeComercializada) {
        this.unidadeComercializada = unidadeComercializada;
    }

    public Iten withUnidadeComercializada(String unidadeComercializada) {
        this.unidadeComercializada = unidadeComercializada;
        return this;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public CodigoCondicaoVenda getCodigoCondicaoVenda() {
        return codigoCondicaoVenda;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCodigoCondicaoVenda(CodigoCondicaoVenda codigoCondicaoVenda) {
        this.codigoCondicaoVenda = codigoCondicaoVenda;
    }

    public Iten withCodigoCondicaoVenda(CodigoCondicaoVenda codigoCondicaoVenda) {
        this.codigoCondicaoVenda = codigoCondicaoVenda;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getNomeImportador() {
        return nomeImportador;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNomeImportador(String nomeImportador) {
        this.nomeImportador = nomeImportador;
    }

    public Iten withNomeImportador(String nomeImportador) {
        this.nomeImportador = nomeImportador;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getEnderecoImportador() {
        return enderecoImportador;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEnderecoImportador(String enderecoImportador) {
        this.enderecoImportador = enderecoImportador;
    }

    public Iten withEnderecoImportador(String enderecoImportador) {
        this.enderecoImportador = enderecoImportador;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<ListaPaisDestino> getListaPaisDestino() {
        return listaPaisDestino;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setListaPaisDestino(List<ListaPaisDestino> listaPaisDestino) {
        this.listaPaisDestino = listaPaisDestino;
    }

    public Iten withListaPaisDestino(List<ListaPaisDestino> listaPaisDestino) {
        this.listaPaisDestino = listaPaisDestino;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ncm", ncm).append("quantidadeNaUnidadeEstatistica", quantidadeNaUnidadeEstatistica).append("numero", numero).append("pesoLiquidoTotal", pesoLiquidoTotal).append("valorDaMercadoriaNaCondicaoDeVenda", valorDaMercadoriaNaCondicaoDeVenda).append("valorDaMercadoriaNoLocalDeEmbarque", valorDaMercadoriaNoLocalDeEmbarque).append("valorDaMercadoriaNoLocalDeEmbarqueEmReais", valorDaMercadoriaNoLocalDeEmbarqueEmReais).append("dataDeConversao", dataDeConversao).append("itemDaNotaFiscalDeExportacao", itemDaNotaFiscalDeExportacao).append("motivoDoTratamentoPrioritario", motivoDoTratamentoPrioritario).append("exportador", exportador).append("unidadeComercializada", unidadeComercializada).append("codigoCondicaoVenda", codigoCondicaoVenda).append("nomeImportador", nomeImportador).append("enderecoImportador", enderecoImportador).append("listaPaisDestino", listaPaisDestino).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listaPaisDestino).append(numero).append(valorDaMercadoriaNoLocalDeEmbarqueEmReais).append(exportador).append(itemDaNotaFiscalDeExportacao).append(valorDaMercadoriaNoLocalDeEmbarque).append(quantidadeNaUnidadeEstatistica).append(pesoLiquidoTotal).append(dataDeConversao).append(valorDaMercadoriaNaCondicaoDeVenda).append(ncm).append(motivoDoTratamentoPrioritario).append(enderecoImportador).append(codigoCondicaoVenda).append(nomeImportador).append(unidadeComercializada).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Iten) == false) {
            return false;
        }
        Iten rhs = ((Iten) other);
        return new EqualsBuilder().append(listaPaisDestino, rhs.listaPaisDestino).append(numero, rhs.numero).append(valorDaMercadoriaNoLocalDeEmbarqueEmReais, rhs.valorDaMercadoriaNoLocalDeEmbarqueEmReais).append(exportador, rhs.exportador).append(itemDaNotaFiscalDeExportacao, rhs.itemDaNotaFiscalDeExportacao).append(valorDaMercadoriaNoLocalDeEmbarque, rhs.valorDaMercadoriaNoLocalDeEmbarque).append(quantidadeNaUnidadeEstatistica, rhs.quantidadeNaUnidadeEstatistica).append(pesoLiquidoTotal, rhs.pesoLiquidoTotal).append(dataDeConversao, rhs.dataDeConversao).append(valorDaMercadoriaNaCondicaoDeVenda, rhs.valorDaMercadoriaNaCondicaoDeVenda).append(ncm, rhs.ncm).append(motivoDoTratamentoPrioritario, rhs.motivoDoTratamentoPrioritario).append(enderecoImportador, rhs.enderecoImportador).append(codigoCondicaoVenda, rhs.codigoCondicaoVenda).append(nomeImportador, rhs.nomeImportador).append(unidadeComercializada, rhs.unidadeComercializada).isEquals();
    }

}
