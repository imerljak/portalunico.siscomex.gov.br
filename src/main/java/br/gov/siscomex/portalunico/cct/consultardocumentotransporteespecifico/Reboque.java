
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reboque {

    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private List<String> lacres = null;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
        Reboque reboque = (Reboque) o;
        return Objects.equals(placa, reboque.placa) &&
                Objects.equals(tara, reboque.tara) &&
                Objects.equals(lacres, reboque.lacres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, tara, lacres);
    }

    @Override
    public String toString() {
        return "Reboque{" +
                "placa='" + placa + '\'' +
                ", tara=" + tara +
                ", lacres=" + lacres +
                '}';
    }
}
