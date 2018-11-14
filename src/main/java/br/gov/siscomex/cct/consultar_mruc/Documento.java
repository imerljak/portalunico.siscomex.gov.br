
package br.gov.siscomex.cct.consultar_mruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Documento {

    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public Documento withNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
        return this;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public Documento withNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDUE", numeroDUE).append("numeroRUC", numeroRUC).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numeroRUC).append(numeroDUE).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Documento) == false) {
            return false;
        }
        Documento rhs = ((Documento) other);
        return new EqualsBuilder().append(numeroRUC, rhs.numeroRUC).append(numeroDUE, rhs.numeroDUE).isEquals();
    }

}
