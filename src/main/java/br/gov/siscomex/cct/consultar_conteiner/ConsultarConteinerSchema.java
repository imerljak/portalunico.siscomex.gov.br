
package br.gov.siscomex.cct.consultar_conteiner;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarConteinerSchema {

    @SerializedName("listaRetorno")
    @Expose
    @Valid
    private Set<ListaRetorno> listaRetorno = new LinkedHashSet<ListaRetorno>();
    @SerializedName("listaMensagem")
    @Expose
    @Valid
    private List<ListaMensagem> listaMensagem = new ArrayList<ListaMensagem>();

    public Set<ListaRetorno> getListaRetorno() {
        return listaRetorno;
    }

    public void setListaRetorno(Set<ListaRetorno> listaRetorno) {
        this.listaRetorno = listaRetorno;
    }

    public ConsultarConteinerSchema withListaRetorno(Set<ListaRetorno> listaRetorno) {
        this.listaRetorno = listaRetorno;
        return this;
    }

    public List<ListaMensagem> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

    public ConsultarConteinerSchema withListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("listaRetorno", listaRetorno).append("listaMensagem", listaMensagem).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listaRetorno).append(listaMensagem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarConteinerSchema) == false) {
            return false;
        }
        ConsultarConteinerSchema rhs = ((ConsultarConteinerSchema) other);
        return new EqualsBuilder().append(listaRetorno, rhs.listaRetorno).append(listaMensagem, rhs.listaMensagem).isEquals();
    }

}
