
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteinere that = (Conteinere) o;
        return Objects.equals(identificacao, that.identificacao) &&
                Objects.equals(tara, that.tara) &&
                Objects.equals(lacres, that.lacres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacao, tara, lacres);
    }

    @Override
    public String toString() {
        return "Conteinere{" +
                "identificacao='" + identificacao + '\'' +
                ", tara=" + tara +
                ", lacres=" + lacres +
                '}';
    }
}
