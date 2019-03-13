
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import java.util.List;
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
    private List<String> lacres = null;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
        this.lacres = lacres;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("placa", placa).append("tara", tara).append("lacres", lacres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lacres).append(tara).append(placa).toHashCode();
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
        return new EqualsBuilder().append(lacres, rhs.lacres).append(tara, rhs.tara).append(placa, rhs.placa).isEquals();
    }

}
