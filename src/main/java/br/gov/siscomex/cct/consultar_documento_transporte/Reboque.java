
package br.gov.siscomex.cct.consultar_documento_transporte;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Reboque {

    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    @Valid
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Reboque withPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Reboque withTara(Double tara) {
        this.tara = tara;
        return this;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {
        this.lacres = lacres;
    }

    public Reboque withLacres(Set<String> lacres) {
        this.lacres = lacres;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("placa", placa).append("tara", tara).append("lacres", lacres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tara).append(lacres).append(placa).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reboque) == false) {
            return false;
        }
        Reboque rhs = ((Reboque) other);
        return new EqualsBuilder().append(tara, rhs.tara).append(lacres, rhs.lacres).append(placa, rhs.placa).isEquals();
    }

}
