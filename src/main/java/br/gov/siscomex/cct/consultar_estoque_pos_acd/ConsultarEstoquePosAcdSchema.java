
package br.gov.siscomex.cct.consultar_estoque_pos_acd;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarEstoquePosAcdSchema {

    @SerializedName("lista")
    @Expose
    @Valid
    private List<Listum> lista = new ArrayList<Listum>();

    public List<Listum> getLista() {
        return lista;
    }

    public void setLista(List<Listum> lista) {
        this.lista = lista;
    }

    public ConsultarEstoquePosAcdSchema withLista(List<Listum> lista) {
        this.lista = lista;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lista", lista).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lista).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarEstoquePosAcdSchema) == false) {
            return false;
        }
        ConsultarEstoquePosAcdSchema rhs = ((ConsultarEstoquePosAcdSchema) other);
        return new EqualsBuilder().append(lista, rhs.lista).isEquals();
    }

}
