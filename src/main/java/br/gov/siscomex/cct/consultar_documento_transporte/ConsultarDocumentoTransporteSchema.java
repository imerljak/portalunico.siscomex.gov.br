
package br.gov.siscomex.cct.consultar_documento_transporte;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarDocumentoTransporteSchema {

    @SerializedName("numeroDocumento")
    @Expose
    private String numeroDocumento;
    @SerializedName("tipoDocumento")
    @Expose
    private String tipoDocumento;
    @SerializedName("viaTransporte")
    @Expose
    private String viaTransporte;
    @SerializedName("situacaoDocumento")
    @Expose
    private String situacaoDocumento;
    @SerializedName("cargas")
    @Expose
    @Valid
    private List<Carga> cargas = new ArrayList<Carga>();
    @SerializedName("veiculoRodoviario")
    @Expose
    @Valid
    private VeiculoRodoviario veiculoRodoviario;
    @SerializedName("prefixoTrem")
    @Expose
    private String prefixoTrem;
    @SerializedName("quantidadeVagoes")
    @Expose
    private Integer quantidadeVagoes;
    @SerializedName("identificacaoVeiculo")
    @Expose
    private String identificacaoVeiculo;
    @SerializedName("dataEmissaoDocumentoTransporte")
    @Expose
    private String dataEmissaoDocumentoTransporte;
    @SerializedName("listaMensagem")
    @Expose
    @Valid
    private List<ListaMensagem> listaMensagem = new ArrayList<ListaMensagem>();

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public ConsultarDocumentoTransporteSchema withNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public ConsultarDocumentoTransporteSchema withTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public ConsultarDocumentoTransporteSchema withViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
        return this;
    }

    public String getSituacaoDocumento() {
        return situacaoDocumento;
    }

    public void setSituacaoDocumento(String situacaoDocumento) {
        this.situacaoDocumento = situacaoDocumento;
    }

    public ConsultarDocumentoTransporteSchema withSituacaoDocumento(String situacaoDocumento) {
        this.situacaoDocumento = situacaoDocumento;
        return this;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public ConsultarDocumentoTransporteSchema withCargas(List<Carga> cargas) {
        this.cargas = cargas;
        return this;
    }

    public VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public ConsultarDocumentoTransporteSchema withVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
        return this;
    }

    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public void setPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
    }

    public ConsultarDocumentoTransporteSchema withPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
        return this;
    }

    public Integer getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    public ConsultarDocumentoTransporteSchema withQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
        return this;
    }

    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

    public ConsultarDocumentoTransporteSchema withIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
        return this;
    }

    public String getDataEmissaoDocumentoTransporte() {
        return dataEmissaoDocumentoTransporte;
    }

    public void setDataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
    }

    public ConsultarDocumentoTransporteSchema withDataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
        return this;
    }

    public List<ListaMensagem> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

    public ConsultarDocumentoTransporteSchema withListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDocumento", numeroDocumento).append("tipoDocumento", tipoDocumento).append("viaTransporte", viaTransporte).append("situacaoDocumento", situacaoDocumento).append("cargas", cargas).append("veiculoRodoviario", veiculoRodoviario).append("prefixoTrem", prefixoTrem).append("quantidadeVagoes", quantidadeVagoes).append("identificacaoVeiculo", identificacaoVeiculo).append("dataEmissaoDocumentoTransporte", dataEmissaoDocumentoTransporte).append("listaMensagem", listaMensagem).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tipoDocumento).append(prefixoTrem).append(listaMensagem).append(dataEmissaoDocumentoTransporte).append(veiculoRodoviario).append(cargas).append(numeroDocumento).append(quantidadeVagoes).append(viaTransporte).append(situacaoDocumento).append(identificacaoVeiculo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDocumentoTransporteSchema) == false) {
            return false;
        }
        ConsultarDocumentoTransporteSchema rhs = ((ConsultarDocumentoTransporteSchema) other);
        return new EqualsBuilder().append(tipoDocumento, rhs.tipoDocumento).append(prefixoTrem, rhs.prefixoTrem).append(listaMensagem, rhs.listaMensagem).append(dataEmissaoDocumentoTransporte, rhs.dataEmissaoDocumentoTransporte).append(veiculoRodoviario, rhs.veiculoRodoviario).append(cargas, rhs.cargas).append(numeroDocumento, rhs.numeroDocumento).append(quantidadeVagoes, rhs.quantidadeVagoes).append(viaTransporte, rhs.viaTransporte).append(situacaoDocumento, rhs.situacaoDocumento).append(identificacaoVeiculo, rhs.identificacaoVeiculo).isEquals();
    }

}
