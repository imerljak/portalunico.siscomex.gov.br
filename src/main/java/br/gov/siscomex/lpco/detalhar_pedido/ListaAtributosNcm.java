
package br.gov.siscomex.lpco.detalhar_pedido;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaAtributosNcm {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("listaValor")
    @Expose
    @Valid
    private List<String> listaValor = new ArrayList<String>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ListaAtributosNcm withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public List<String> getListaValor() {
        return listaValor;
    }

    public void setListaValor(List<String> listaValor) {
        this.listaValor = listaValor;
    }

    public ListaAtributosNcm withListaValor(List<String> listaValor) {
        this.listaValor = listaValor;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("listaValor", listaValor).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(listaValor).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaAtributosNcm) == false) {
            return false;
        }
        ListaAtributosNcm rhs = ((ListaAtributosNcm) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(listaValor, rhs.listaValor).isEquals();
    }

}
