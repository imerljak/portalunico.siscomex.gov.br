
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carga {

    @SerializedName("numeroDue")
    @Expose
    private String numeroDue;
    @SerializedName("numeroRuc")
    @Expose
    private String numeroRuc;
    @SerializedName("conteiner")
    @Expose
    private Conteiner conteiner;

    public String getNumeroDue() {
        return numeroDue;
    }

    public void setNumeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
    }

    public String getNumeroRuc() {
        return numeroRuc;
    }

    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }

    public Conteiner getConteiner() {
        return conteiner;
    }

    public void setConteiner(Conteiner conteiner) {
        this.conteiner = conteiner;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "numeroDue='" + numeroDue + '\'' +
                ", numeroRuc='" + numeroRuc + '\'' +
                ", conteiner=" + conteiner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carga carga = (Carga) o;

        if (numeroDue != null ? !numeroDue.equals(carga.numeroDue) : carga.numeroDue != null) return false;
        if (numeroRuc != null ? !numeroRuc.equals(carga.numeroRuc) : carga.numeroRuc != null) return false;
        return conteiner != null ? conteiner.equals(carga.conteiner) : carga.conteiner == null;
    }

    @Override
    public int hashCode() {
        int result = numeroDue != null ? numeroDue.hashCode() : 0;
        result = 31 * result + (numeroRuc != null ? numeroRuc.hashCode() : 0);
        result = 31 * result + (conteiner != null ? conteiner.hashCode() : 0);
        return result;
    }
}
