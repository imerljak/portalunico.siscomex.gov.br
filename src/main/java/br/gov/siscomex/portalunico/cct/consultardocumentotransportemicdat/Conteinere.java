
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conteinere {

    @SerializedName("identificacao")
    @Expose
    private String identificacao;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private List<String> lacres = null;

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

}
