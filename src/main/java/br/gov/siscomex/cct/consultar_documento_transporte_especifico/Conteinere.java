
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Conteinere {

    @SerializedName("identificacao")
    @Expose
    private String identificacao;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    @Valid
    private List<String> lacres = null;

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
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
        return new ToStringBuilder(this).append("identificacao", identificacao).append("tara", tara).append("lacres", lacres).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lacres).append(tara).append(identificacao).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conteinere) == false) {
            return false;
        }
        Conteinere rhs = ((Conteinere) other);
        return new EqualsBuilder().append(lacres, rhs.lacres).append(tara, rhs.tara).append(identificacao, rhs.identificacao).isEquals();
    }

}
