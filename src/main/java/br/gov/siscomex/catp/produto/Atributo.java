
package br.gov.siscomex.catp.produto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Atributo {

    @SerializedName("atributo")
    @Expose
    private String atributo;
    @SerializedName("valor")
    @Expose
    private String valor;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public Atributo withAtributo(String atributo) {
        this.atributo = atributo;
        return this;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Atributo withValor(String valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("atributo", atributo).append("valor", valor).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(valor).append(atributo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Atributo) == false) {
            return false;
        }
        Atributo rhs = ((Atributo) other);
        return new EqualsBuilder().append(valor, rhs.valor).append(atributo, rhs.atributo).isEquals();
    }

}
