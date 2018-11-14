
package br.gov.siscomex.lpco.detalhar_modelo_ncm;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DetalharModeloNcmSchema {

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
    @SerializedName("unidadeMedidaEstatistica")
    @Expose
    private String unidadeMedidaEstatistica;

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public DetalharModeloNcmSchema withNcm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    public List<ListaCamposNcm> getListaCamposNcm() {
        return listaCamposNcm;
    }

    public void setListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
    }

    public DetalharModeloNcmSchema withListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
        return this;
    }

    public List<ListaAtributosNcm> getListaAtributosNcm() {
        return listaAtributosNcm;
    }

    public void setListaAtributosNcm(List<ListaAtributosNcm> listaAtributosNcm) {
        this.listaAtributosNcm = listaAtributosNcm;
    }

    public DetalharModeloNcmSchema withListaAtributosNcm(List<ListaAtributosNcm> listaAtributosNcm) {
        this.listaAtributosNcm = listaAtributosNcm;
        return this;
    }

    public String getUnidadeMedidaEstatistica() {
        return unidadeMedidaEstatistica;
    }

    public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    }

    public DetalharModeloNcmSchema withUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ncm", ncm).append("listaCamposNcm", listaCamposNcm).append("listaAtributosNcm", listaAtributosNcm).append("unidadeMedidaEstatistica", unidadeMedidaEstatistica).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unidadeMedidaEstatistica).append(ncm).append(listaCamposNcm).append(listaAtributosNcm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharModeloNcmSchema) == false) {
            return false;
        }
        DetalharModeloNcmSchema rhs = ((DetalharModeloNcmSchema) other);
        return new EqualsBuilder().append(unidadeMedidaEstatistica, rhs.unidadeMedidaEstatistica).append(ncm, rhs.ncm).append(listaCamposNcm, rhs.listaCamposNcm).append(listaAtributosNcm, rhs.listaAtributosNcm).isEquals();
    }

}
