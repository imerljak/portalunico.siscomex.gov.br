
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carga {

    @SerializedName("numeroDue")
    @Expose
    private String numeroDue;
    @SerializedName("numeroRuc")
    @Expose
    private String numeroRuc;
    @SerializedName("tipoCarga")
    @Expose
    private Object tipoCarga;
    @SerializedName("siglaUnidadeMedida")
    @Expose
    private String siglaUnidadeMedida;
    @SerializedName("quantidadeManifestada")
    @Expose
    private Double quantidadeManifestada;

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

    public Object getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(Object tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getSiglaUnidadeMedida() {
        return siglaUnidadeMedida;
    }

    public void setSiglaUnidadeMedida(String siglaUnidadeMedida) {
        this.siglaUnidadeMedida = siglaUnidadeMedida;
    }

    public Double getQuantidadeManifestada() {
        return quantidadeManifestada;
    }

    public void setQuantidadeManifestada(Double quantidadeManifestada) {
        this.quantidadeManifestada = quantidadeManifestada;
    }

}
