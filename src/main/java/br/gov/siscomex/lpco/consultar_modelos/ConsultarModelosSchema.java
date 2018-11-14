
package br.gov.siscomex.lpco.consultar_modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarModelosSchema {

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

    public ConsultarModelosSchema withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ConsultarModelosSchema withNome(String nome) {
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
        if ((other instanceof ConsultarModelosSchema) == false) {
            return false;
        }
        ConsultarModelosSchema rhs = ((ConsultarModelosSchema) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(nome, rhs.nome).isEquals();
    }

}
