
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conteiner {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
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
        return "Conteiner{" +
                "numeroConteiner='" + numeroConteiner + '\'' +
                ", tara=" + tara +
                ", lacres=" + lacres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conteiner conteiner = (Conteiner) o;

        if (numeroConteiner != null ? !numeroConteiner.equals(conteiner.numeroConteiner) : conteiner.numeroConteiner != null)
            return false;
        if (tara != null ? !tara.equals(conteiner.tara) : conteiner.tara != null) return false;
        return lacres != null ? lacres.equals(conteiner.lacres) : conteiner.lacres == null;
    }

    @Override
    public int hashCode() {
        int result = numeroConteiner != null ? numeroConteiner.hashCode() : 0;
        result = 31 * result + (tara != null ? tara.hashCode() : 0);
        result = 31 * result + (lacres != null ? lacres.hashCode() : 0);
        return result;
    }
}
