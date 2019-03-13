
package br.gov.siscomex.cct.consultar_documento_transporte;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Conteiner {

    @SerializedName("numeroConteiner")
    @Expose
    private String numeroConteiner;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    @Valid
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public Conteiner withNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Conteiner withTara(Double tara) {
        this.tara = tara;
        return this;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    public Conteiner withLacres(Set<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroConteiner", numeroConteiner).append("tara", tara).append("lacres", lacres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numeroConteiner).append(tara).append(lacres).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conteiner) == false) {
            return false;
        }
        Conteiner rhs = ((Conteiner) other);
        return new EqualsBuilder().append(numeroConteiner, rhs.numeroConteiner).append(tara, rhs.tara).append(lacres, rhs.lacres).isEquals();
    }

}
