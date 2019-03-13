
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class VeiculoFerroviario {

    @SerializedName("prefixoTrem")
    @Expose
    private String prefixoTrem;
    @SerializedName("quantidadeVagoes")
    @Expose
    private Integer quantidadeVagoes;

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

    @Override
    public String toString() {
        return "VeiculoFerroviario{" +
                "prefixoTrem='" + prefixoTrem + '\'' +
                ", quantidadeVagoes=" + quantidadeVagoes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeiculoFerroviario that = (VeiculoFerroviario) o;
        return Objects.equals(prefixoTrem, that.prefixoTrem) &&
                Objects.equals(quantidadeVagoes, that.quantidadeVagoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefixoTrem, quantidadeVagoes);
    }
}
