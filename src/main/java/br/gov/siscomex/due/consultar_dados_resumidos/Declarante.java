
package br.gov.siscomex.due.consultar_dados_resumidos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Declarante {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("tipo")
    @Expose
    private String tipo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Declarante withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Declarante withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numero", numero).append("tipo", tipo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numero).append(tipo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Declarante) == false) {
            return false;
        }
        Declarante rhs = ((Declarante) other);
        return new EqualsBuilder().append(numero, rhs.numero).append(tipo, rhs.tipo).isEquals();
    }

}
