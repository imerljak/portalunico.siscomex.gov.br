
package br.gov.siscomex.lpco.detalhar_pedido;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaNcm {

    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("listaCamposNcm")
    @Expose
    @Valid
    private List<ListaCamposNcm> listaCamposNcm = new ArrayList<ListaCamposNcm>();
    @SerializedName("listaAtributosNcm")
    @Expose
    @Valid
    private List<ListaAtributosNcm> listaAtributosNcm = new ArrayList<ListaAtributosNcm>();
    @SerializedName("unidadeMedidaComercializada")
    @Expose
    private String unidadeMedidaComercializada;

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public ListaNcm withNcm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    public List<ListaCamposNcm> getListaCamposNcm() {
        return listaCamposNcm;
    }

    public void setListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
    }

    public ListaNcm withListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
        return this;
    }

    public List<ListaAtributosNcm> getListaAtributosNcm() {
        return listaAtributosNcm;
    }

    public void setListaAtributosNcm(List<ListaAtributosNcm> listaAtributosNcm) {
        this.listaAtributosNcm = listaAtributosNcm;
    }

    public ListaNcm withListaAtributosNcm(List<ListaAtributosNcm> listaAtributosNcm) {
        this.listaAtributosNcm = listaAtributosNcm;
        return this;
    }

    public String getUnidadeMedidaComercializada() {
        return unidadeMedidaComercializada;
    }

    public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    }

    public ListaNcm withUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ncm", ncm).append("listaCamposNcm", listaCamposNcm).append("listaAtributosNcm", listaAtributosNcm).append("unidadeMedidaComercializada", unidadeMedidaComercializada).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ncm).append(unidadeMedidaComercializada).append(listaCamposNcm).append(listaAtributosNcm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaNcm) == false) {
            return false;
        }
        ListaNcm rhs = ((ListaNcm) other);
        return new EqualsBuilder().append(ncm, rhs.ncm).append(unidadeMedidaComercializada, rhs.unidadeMedidaComercializada).append(listaCamposNcm, rhs.listaCamposNcm).append(listaAtributosNcm, rhs.listaAtributosNcm).isEquals();
    }

}
