
package br.gov.siscomex.cct.consultar_mruc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaMensagem {

    @SerializedName("mensagem")
    @Expose
    private String mensagem;
    @SerializedName("codigoErro")
    @Expose
    private String codigoErro;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public ListaMensagem withMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public String getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

    public ListaMensagem withCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mensagem", mensagem).append("codigoErro", codigoErro).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigoErro).append(mensagem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaMensagem) == false) {
            return false;
        }
        ListaMensagem rhs = ((ListaMensagem) other);
        return new EqualsBuilder().append(codigoErro, rhs.codigoErro).append(mensagem, rhs.mensagem).isEquals();
    }

}
