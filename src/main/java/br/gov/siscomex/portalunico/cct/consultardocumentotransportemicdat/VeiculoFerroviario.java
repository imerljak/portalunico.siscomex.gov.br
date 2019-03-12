
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

}
