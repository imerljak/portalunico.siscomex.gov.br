
package br.gov.siscomex.cct.consultar_due_ruc;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarDueRucSchema {

    @SerializedName("listaRetorno")
    @Expose
    @Valid
    private List<ListaRetorno> listaRetorno = new ArrayList<ListaRetorno>();
    @SerializedName("listaMensagem")
    @Expose
    @Valid
    private List<ListaMensagem> listaMensagem = new ArrayList<ListaMensagem>();

    public List<ListaRetorno> getListaRetorno() {
        return listaRetorno;
    }

    public void setListaRetorno(List<ListaRetorno> listaRetorno) {
        this.listaRetorno = listaRetorno;
    }

    public ConsultarDueRucSchema withListaRetorno(List<ListaRetorno> listaRetorno) {
        this.listaRetorno = listaRetorno;
        return this;
    }

    public List<ListaMensagem> getListaMensagem() {
        return listaMensagem;
    }

    public void setListaMensagem(List<ListaMensagem> listaMensagem) {
        this.listaMensagem = listaMensagem;
    }

    public ConsultarDueRucSchema withListaMensagem(List<ListaMensagem> listaMensagem) {
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
        if ((other instanceof ConsultarDueRucSchema) == false) {
            return false;
        }
        ConsultarDueRucSchema rhs = ((ConsultarDueRucSchema) other);
        return new EqualsBuilder().append(listaRetorno, rhs.listaRetorno).append(listaMensagem, rhs.listaMensagem).isEquals();
    }

}
