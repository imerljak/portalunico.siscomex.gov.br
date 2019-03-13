
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DocumentosTransporte {

    @SerializedName("numeroDocumentoTransporte")
    @Expose
    private String numeroDocumentoTransporte;
    @SerializedName("tipoDocumentoTransporte")
    @Expose
    private String tipoDocumentoTransporte;
    @SerializedName("viaTransporte")
    @Expose
    private String viaTransporte;
    @SerializedName("situacaoAtual")
    @Expose
    private String situacaoAtual;
    @SerializedName("dataEmissao")
    @Expose
    private String dataEmissao;
    @SerializedName("cpfCnpjTransportador")
    @Expose
    private String cpfCnpjTransportador;
    @SerializedName("nomeTransportador")
    @Expose
    private String nomeTransportador;
    @SerializedName("tipoDAT")
    @Expose
    private String tipoDAT;
    @SerializedName("localOrigem")
    @Expose
    @Valid
    private LocalOrigem localOrigem;
    @SerializedName("localDestinoPrevisto")
    @Expose
    @Valid
    private LocalDestinoPrevisto localDestinoPrevisto;
    @SerializedName("localEstoque")
    @Expose
    @Valid
    private LocalEstoque localEstoque;
    @SerializedName("veiculoFerroviario")
    @Expose
    @Valid
    private VeiculoFerroviario veiculoFerroviario;
    @SerializedName("veiculoRodoviario")
    @Expose
    @Valid
    private VeiculoRodoviario veiculoRodoviario;
    @SerializedName("cargas")
    @Expose
    @Valid
    private List<Carga> cargas = null;
    @SerializedName("conteineres")
    @Expose
    @Valid
    private List<Conteinere> conteineres = null;

    public String getNumeroDocumentoTransporte() {
        return numeroDocumentoTransporte;
    }

    public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    }

    public String getTipoDocumentoTransporte() {
        return tipoDocumentoTransporte;
    }

    public void setTipoDocumentoTransporte(String tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    }

    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCpfCnpjTransportador() {
        return cpfCnpjTransportador;
    }

    public void setCpfCnpjTransportador(String cpfCnpjTransportador) {
        this.cpfCnpjTransportador = cpfCnpjTransportador;
    }

    public String getNomeTransportador() {
        return nomeTransportador;
    }

    public void setNomeTransportador(String nomeTransportador) {
        this.nomeTransportador = nomeTransportador;
    }

    public String getTipoDAT() {
        return tipoDAT;
    }

    public void setTipoDAT(String tipoDAT) {
        this.tipoDAT = tipoDAT;
    }

    public LocalOrigem getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(LocalOrigem localOrigem) {
        this.localOrigem = localOrigem;
    }

    public LocalDestinoPrevisto getLocalDestinoPrevisto() {
        return localDestinoPrevisto;
    }

    public void setLocalDestinoPrevisto(LocalDestinoPrevisto localDestinoPrevisto) {
        this.localDestinoPrevisto = localDestinoPrevisto;
    }

    public LocalEstoque getLocalEstoque() {
        return localEstoque;
    }

    public void setLocalEstoque(LocalEstoque localEstoque) {
        this.localEstoque = localEstoque;
    }

    public VeiculoFerroviario getVeiculoFerroviario() {
        return veiculoFerroviario;
    }

    public void setVeiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
        this.veiculoFerroviario = veiculoFerroviario;
    }

    public VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public List<Conteinere> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<Conteinere> conteineres) {
        this.conteineres = conteineres;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDocumentoTransporte", numeroDocumentoTransporte).append("tipoDocumentoTransporte", tipoDocumentoTransporte).append("viaTransporte", viaTransporte).append("situacaoAtual", situacaoAtual).append("dataEmissao", dataEmissao).append("cpfCnpjTransportador", cpfCnpjTransportador).append("nomeTransportador", nomeTransportador).append("tipoDAT", tipoDAT).append("localOrigem", localOrigem).append("localDestinoPrevisto", localDestinoPrevisto).append("localEstoque", localEstoque).append("veiculoFerroviario", veiculoFerroviario).append("veiculoRodoviario", veiculoRodoviario).append("cargas", cargas).append("conteineres", conteineres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(localOrigem).append(localDestinoPrevisto).append(cpfCnpjTransportador).append(tipoDocumentoTransporte).append(nomeTransportador).append(veiculoFerroviario).append(situacaoAtual).append(localEstoque).append(numeroDocumentoTransporte).append(conteineres).append(viaTransporte).append(dataEmissao).append(tipoDAT).append(veiculoRodoviario).append(cargas).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentosTransporte) == false) {
            return false;
        }
        DocumentosTransporte rhs = ((DocumentosTransporte) other);
        return new EqualsBuilder().append(localOrigem, rhs.localOrigem).append(localDestinoPrevisto, rhs.localDestinoPrevisto).append(cpfCnpjTransportador, rhs.cpfCnpjTransportador).append(tipoDocumentoTransporte, rhs.tipoDocumentoTransporte).append(nomeTransportador, rhs.nomeTransportador).append(veiculoFerroviario, rhs.veiculoFerroviario).append(situacaoAtual, rhs.situacaoAtual).append(localEstoque, rhs.localEstoque).append(numeroDocumentoTransporte, rhs.numeroDocumentoTransporte).append(conteineres, rhs.conteineres).append(viaTransporte, rhs.viaTransporte).append(dataEmissao, rhs.dataEmissao).append(tipoDAT, rhs.tipoDAT).append(veiculoRodoviario, rhs.veiculoRodoviario).append(cargas, rhs.cargas).isEquals();
    }

}
