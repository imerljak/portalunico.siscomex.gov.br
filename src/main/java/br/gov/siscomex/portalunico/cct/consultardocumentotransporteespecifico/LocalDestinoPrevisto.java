
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LocalDestinoPrevisto {

    @SerializedName("urf")
    @Expose
    private Urf urf;
    @SerializedName("ra")
    @Expose
    private Ra ra;
    @SerializedName("responsavel")
    @Expose
    private Responsavel responsavel;
    @SerializedName("coordenadas")
    @Expose
    private Coordenadas coordenadas;

    public Urf getUrf() {
        return urf;
    }

    public void setUrf(Urf urf) {
        this.urf = urf;
    }

    public Ra getRa() {
        return ra;
    }

    public void setRa(Ra ra) {
        this.ra = ra;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalDestinoPrevisto that = (LocalDestinoPrevisto) o;
        return Objects.equals(urf, that.urf) &&
                Objects.equals(ra, that.ra) &&
                Objects.equals(responsavel, that.responsavel) &&
                Objects.equals(coordenadas, that.coordenadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urf, ra, responsavel, coordenadas);
    }
}
