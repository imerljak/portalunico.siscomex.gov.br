
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentosTransporte {

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
    private List<Carga> cargas = new ArrayList<Carga>();
    @SerializedName("veiculoRodoviario")
    @Expose
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

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(String viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public String getSituacaoDocumento() {
        return situacaoDocumento;
    }

    public void setSituacaoDocumento(String situacaoDocumento) {
        this.situacaoDocumento = situacaoDocumento;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public void setPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
    }

    public Integer getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    public void setIdentificacaoVeiculo(String identificacaoVeiculo) {
        this.identificacaoVeiculo = identificacaoVeiculo;
    }

    public String getDataEmissaoDocumentoTransporte() {
        return dataEmissaoDocumentoTransporte;
    }

    public void setDataEmissaoDocumentoTransporte(String dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
    }

    @Override
    public String toString() {
        return "DocumentosTransporte{" +
                "numeroDocumento='" + numeroDocumento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", viaTransporte='" + viaTransporte + '\'' +
                ", situacaoDocumento='" + situacaoDocumento + '\'' +
                ", cargas=" + cargas +
                ", veiculoRodoviario=" + veiculoRodoviario +
                ", prefixoTrem='" + prefixoTrem + '\'' +
                ", quantidadeVagoes=" + quantidadeVagoes +
                ", identificacaoVeiculo='" + identificacaoVeiculo + '\'' +
                ", dataEmissaoDocumentoTransporte=" + dataEmissaoDocumentoTransporte +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentosTransporte that = (DocumentosTransporte) o;

        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (tipoDocumento != null ? !tipoDocumento.equals(that.tipoDocumento) : that.tipoDocumento != null)
            return false;
        if (viaTransporte != null ? !viaTransporte.equals(that.viaTransporte) : that.viaTransporte != null)
            return false;
        if (situacaoDocumento != null ? !situacaoDocumento.equals(that.situacaoDocumento) : that.situacaoDocumento != null)
            return false;
        if (cargas != null ? !cargas.equals(that.cargas) : that.cargas != null) return false;
        if (veiculoRodoviario != null ? !veiculoRodoviario.equals(that.veiculoRodoviario) : that.veiculoRodoviario != null)
            return false;
        if (prefixoTrem != null ? !prefixoTrem.equals(that.prefixoTrem) : that.prefixoTrem != null) return false;
        if (quantidadeVagoes != null ? !quantidadeVagoes.equals(that.quantidadeVagoes) : that.quantidadeVagoes != null)
            return false;
        if (identificacaoVeiculo != null ? !identificacaoVeiculo.equals(that.identificacaoVeiculo) : that.identificacaoVeiculo != null)
            return false;
        return dataEmissaoDocumentoTransporte != null ? dataEmissaoDocumentoTransporte.equals(that.dataEmissaoDocumentoTransporte) : that.dataEmissaoDocumentoTransporte == null;
    }

    @Override
    public int hashCode() {
        int result = numeroDocumento != null ? numeroDocumento.hashCode() : 0;
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        result = 31 * result + (viaTransporte != null ? viaTransporte.hashCode() : 0);
        result = 31 * result + (situacaoDocumento != null ? situacaoDocumento.hashCode() : 0);
        result = 31 * result + (cargas != null ? cargas.hashCode() : 0);
        result = 31 * result + (veiculoRodoviario != null ? veiculoRodoviario.hashCode() : 0);
        result = 31 * result + (prefixoTrem != null ? prefixoTrem.hashCode() : 0);
        result = 31 * result + (quantidadeVagoes != null ? quantidadeVagoes.hashCode() : 0);
        result = 31 * result + (identificacaoVeiculo != null ? identificacaoVeiculo.hashCode() : 0);
        result = 31 * result + (dataEmissaoDocumentoTransporte != null ? dataEmissaoDocumentoTransporte.hashCode() : 0);
        return result;
    }
}
