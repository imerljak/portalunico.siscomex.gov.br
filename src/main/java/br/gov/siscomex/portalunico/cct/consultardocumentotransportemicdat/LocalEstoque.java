
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalEstoque {

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

}
