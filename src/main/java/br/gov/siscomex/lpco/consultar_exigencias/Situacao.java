
package br.gov.siscomex.lpco.consultar_exigencias;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Situacao {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("descricao")
    @Expose
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Situacao withId(String id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Situacao withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("descricao", descricao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(descricao).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Situacao) == false) {
            return false;
        }
        Situacao rhs = ((Situacao) other);
        return new EqualsBuilder().append(id, rhs.id).append(descricao, rhs.descricao).isEquals();
    }

}
