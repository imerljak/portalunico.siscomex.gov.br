
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
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
    private Set<String> lacres = new LinkedHashSet<String>();

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

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    @Override
    public String toString() {
        return "Reboque{" +
                "placa='" + placa + '\'' +
                ", tara=" + tara +
                ", lacres=" + lacres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reboque reboque = (Reboque) o;

        if (placa != null ? !placa.equals(reboque.placa) : reboque.placa != null) return false;
        if (tara != null ? !tara.equals(reboque.tara) : reboque.tara != null) return false;
        return lacres != null ? lacres.equals(reboque.lacres) : reboque.lacres == null;
    }

    @Override
    public int hashCode() {
        int result = placa != null ? placa.hashCode() : 0;
        result = 31 * result + (tara != null ? tara.hashCode() : 0);
        result = 31 * result + (lacres != null ? lacres.hashCode() : 0);
        return result;
    }
}
