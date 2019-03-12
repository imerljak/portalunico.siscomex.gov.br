
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private LocalOrigem localOrigem;
    @SerializedName("localDestinoPrevisto")
    @Expose
    private LocalDestinoPrevisto localDestinoPrevisto;
    @SerializedName("localEstoque")
    @Expose
    private LocalEstoque localEstoque;
    @SerializedName("veiculoFerroviario")
    @Expose
    private VeiculoFerroviario veiculoFerroviario;
    @SerializedName("veiculoRodoviario")
    @Expose
    private VeiculoRodoviario veiculoRodoviario;
    @SerializedName("cargas")
    @Expose
    private List<Carga> cargas = null;
    @SerializedName("conteineres")
    @Expose
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

}
