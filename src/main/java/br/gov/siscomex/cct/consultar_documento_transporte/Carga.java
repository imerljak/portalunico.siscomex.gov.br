
package br.gov.siscomex.cct.consultar_documento_transporte;

import javax.validation.Valid;
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
    @SerializedName("conteiner")
    @Expose
    @Valid
    private Conteiner conteiner;

    public String getNumeroDue() {
        return numeroDue;
    }

    public void setNumeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
    }

    public Carga withNumeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
        return this;
    }

    public String getNumeroRuc() {
        return numeroRuc;
    }

    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }

    public Carga withNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
        return this;
    }

    public Conteiner getConteiner() {
        return conteiner;
    }

    public void setConteiner(Conteiner conteiner) {
        this.conteiner = conteiner;
    }

    public Carga withConteiner(Conteiner conteiner) {
        this.conteiner = conteiner;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDue", numeroDue).append("numeroRuc", numeroRuc).append("conteiner", conteiner).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numeroRuc).append(numeroDue).append(conteiner).toHashCode();
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
        return new EqualsBuilder().append(numeroRuc, rhs.numeroRuc).append(numeroDue, rhs.numeroDue).append(conteiner, rhs.conteiner).isEquals();
    }

}
