
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Responsavel {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("descricao")
    @Expose
    private String descricao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("descricao", descricao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(descricao).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responsavel) == false) {
            return false;
        }
        Responsavel rhs = ((Responsavel) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(descricao, rhs.descricao).isEquals();
    }

}
