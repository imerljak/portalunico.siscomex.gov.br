
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDue", numeroDue).append("numeroRuc", numeroRuc).append("tipoCarga", tipoCarga).append("siglaUnidadeMedida", siglaUnidadeMedida).append("quantidadeManifestada", quantidadeManifestada).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tipoCarga).append(siglaUnidadeMedida).append(quantidadeManifestada).append(numeroDue).append(numeroRuc).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Carga) == false) {
            return false;
        }
        Carga rhs = ((Carga) other);
        return new EqualsBuilder().append(tipoCarga, rhs.tipoCarga).append(siglaUnidadeMedida, rhs.siglaUnidadeMedida).append(quantidadeManifestada, rhs.quantidadeManifestada).append(numeroDue, rhs.numeroDue).append(numeroRuc, rhs.numeroRuc).isEquals();
    }

}
