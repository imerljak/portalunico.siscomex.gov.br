
package br.gov.siscomex.lpco.detalhar_pedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaVinculo {

    @SerializedName("dataVinculo")
    @Expose
    private String dataVinculo;
    @SerializedName("numeroDocumento")
    @Expose
    private String numeroDocumento;
    @SerializedName("numeroDocumentoItem")
    @Expose
    private Integer numeroDocumentoItem;
    @SerializedName("dataACD")
    @Expose
    private String dataACD;
    @SerializedName("dataDesembaraco")
    @Expose
    private String dataDesembaraco;
    @SerializedName("dataCCE")
    @Expose
    private String dataCCE;
    @SerializedName("dataAverbacao")
    @Expose
    private String dataAverbacao;
    @SerializedName("dataDesvinculacao")
    @Expose
    private String dataDesvinculacao;
    @SerializedName("quantidadeComercial")
    @Expose
    private String quantidadeComercial;
    @SerializedName("quantidadeUnidadeEstatistica")
    @Expose
    private String quantidadeUnidadeEstatistica;
    @SerializedName("vmle")
    @Expose
    private String vmle;

    public String getDataVinculo() {
        return dataVinculo;
    }

    public void setDataVinculo(String dataVinculo) {
        this.dataVinculo = dataVinculo;
    }

    public ListaVinculo withDataVinculo(String dataVinculo) {
        this.dataVinculo = dataVinculo;
        return this;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public ListaVinculo withNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public Integer getNumeroDocumentoItem() {
        return numeroDocumentoItem;
    }

    public void setNumeroDocumentoItem(Integer numeroDocumentoItem) {
        this.numeroDocumentoItem = numeroDocumentoItem;
    }

    public ListaVinculo withNumeroDocumentoItem(Integer numeroDocumentoItem) {
        this.numeroDocumentoItem = numeroDocumentoItem;
        return this;
    }

    public String getDataACD() {
        return dataACD;
    }

    public void setDataACD(String dataACD) {
        this.dataACD = dataACD;
    }

    public ListaVinculo withDataACD(String dataACD) {
        this.dataACD = dataACD;
        return this;
    }

    public String getDataDesembaraco() {
        return dataDesembaraco;
    }

    public void setDataDesembaraco(String dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public ListaVinculo withDataDesembaraco(String dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
        return this;
    }

    public String getDataCCE() {
        return dataCCE;
    }

    public void setDataCCE(String dataCCE) {
        this.dataCCE = dataCCE;
    }

    public ListaVinculo withDataCCE(String dataCCE) {
        this.dataCCE = dataCCE;
        return this;
    }

    public String getDataAverbacao() {
        return dataAverbacao;
    }

    public void setDataAverbacao(String dataAverbacao) {
        this.dataAverbacao = dataAverbacao;
    }

    public ListaVinculo withDataAverbacao(String dataAverbacao) {
        this.dataAverbacao = dataAverbacao;
        return this;
    }

    public String getDataDesvinculacao() {
        return dataDesvinculacao;
    }

    public void setDataDesvinculacao(String dataDesvinculacao) {
        this.dataDesvinculacao = dataDesvinculacao;
    }

    public ListaVinculo withDataDesvinculacao(String dataDesvinculacao) {
        this.dataDesvinculacao = dataDesvinculacao;
        return this;
    }

    public String getQuantidadeComercial() {
        return quantidadeComercial;
    }

    public void setQuantidadeComercial(String quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    public ListaVinculo withQuantidadeComercial(String quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
        return this;
    }

    public String getQuantidadeUnidadeEstatistica() {
        return quantidadeUnidadeEstatistica;
    }

    public void setQuantidadeUnidadeEstatistica(String quantidadeUnidadeEstatistica) {
        this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
    }

    public ListaVinculo withQuantidadeUnidadeEstatistica(String quantidadeUnidadeEstatistica) {
        this.quantidadeUnidadeEstatistica = quantidadeUnidadeEstatistica;
        return this;
    }

    public String getVmle() {
        return vmle;
    }

    public void setVmle(String vmle) {
        this.vmle = vmle;
    }

    public ListaVinculo withVmle(String vmle) {
        this.vmle = vmle;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataVinculo", dataVinculo).append("numeroDocumento", numeroDocumento).append("numeroDocumentoItem", numeroDocumentoItem).append("dataACD", dataACD).append("dataDesembaraco", dataDesembaraco).append("dataCCE", dataCCE).append("dataAverbacao", dataAverbacao).append("dataDesvinculacao", dataDesvinculacao).append("quantidadeComercial", quantidadeComercial).append("quantidadeUnidadeEstatistica", quantidadeUnidadeEstatistica).append("vmle", vmle).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataDesembaraco).append(quantidadeUnidadeEstatistica).append(quantidadeComercial).append(dataDesvinculacao).append(vmle).append(dataAverbacao).append(dataVinculo).append(numeroDocumentoItem).append(numeroDocumento).append(dataACD).append(dataCCE).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaVinculo) == false) {
            return false;
        }
        ListaVinculo rhs = ((ListaVinculo) other);
        return new EqualsBuilder().append(dataDesembaraco, rhs.dataDesembaraco).append(quantidadeUnidadeEstatistica, rhs.quantidadeUnidadeEstatistica).append(quantidadeComercial, rhs.quantidadeComercial).append(dataDesvinculacao, rhs.dataDesvinculacao).append(vmle, rhs.vmle).append(dataAverbacao, rhs.dataAverbacao).append(dataVinculo, rhs.dataVinculo).append(numeroDocumentoItem, rhs.numeroDocumentoItem).append(numeroDocumento, rhs.numeroDocumento).append(dataACD, rhs.dataACD).append(dataCCE, rhs.dataCCE).isEquals();
    }

}
