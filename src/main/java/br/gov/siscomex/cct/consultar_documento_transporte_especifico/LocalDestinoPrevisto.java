
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LocalDestinoPrevisto {

    @SerializedName("urf")
    @Expose
    @Valid
    private Urf urf;
    @SerializedName("ra")
    @Expose
    @Valid
    private Ra ra;
    @SerializedName("responsavel")
    @Expose
    @Valid
    private Responsavel responsavel;
    @SerializedName("coordenadas")
    @Expose
    @Valid
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
    public String toString() {
        return new ToStringBuilder(this).append("urf", urf).append("ra", ra).append("responsavel", responsavel).append("coordenadas", coordenadas).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ra).append(coordenadas).append(urf).append(responsavel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalDestinoPrevisto) == false) {
            return false;
        }
        LocalDestinoPrevisto rhs = ((LocalDestinoPrevisto) other);
        return new EqualsBuilder().append(ra, rhs.ra).append(coordenadas, rhs.coordenadas).append(urf, rhs.urf).append(responsavel, rhs.responsavel).isEquals();
    }

}
