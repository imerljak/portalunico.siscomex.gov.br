
package br.gov.siscomex.cct.consultar_documento_transporte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Mensagen {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("mensagem")
    @Expose
    private String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Mensagen withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Mensagen withMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("mensagem", mensagem).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(mensagem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mensagen) == false) {
            return false;
        }
        Mensagen rhs = ((Mensagen) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(mensagem, rhs.mensagem).isEquals();
    }

}
