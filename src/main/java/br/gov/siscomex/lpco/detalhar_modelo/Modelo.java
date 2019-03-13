
package br.gov.siscomex.lpco.detalhar_modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Modelo {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nome")
    @Expose
    private String nome;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Modelo withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modelo withNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("nome", nome).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(nome).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Modelo) == false) {
            return false;
        }
        Modelo rhs = ((Modelo) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(nome, rhs.nome).isEquals();
    }

}
