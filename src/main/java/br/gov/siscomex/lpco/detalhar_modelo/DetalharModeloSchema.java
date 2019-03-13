
package br.gov.siscomex.lpco.detalhar_modelo;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DetalharModeloSchema {

    @SerializedName("modelo")
    @Expose
    @Valid
    private Modelo modelo;
    @SerializedName("listaCamposFormulario")
    @Expose
    @Valid
    private List<ListaCamposFormulario> listaCamposFormulario = new ArrayList<ListaCamposFormulario>();
    @SerializedName("listaCamposNcm")
    @Expose
    @Valid
    private List<ListaCamposNcm> listaCamposNcm = new ArrayList<ListaCamposNcm>();
    @SerializedName("permiteMultiplosCpfCnpjExportador")
    @Expose
    private Boolean permiteMultiplosCpfCnpjExportador;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public DetalharModeloSchema withModelo(Modelo modelo) {
        this.modelo = modelo;
        return this;
    }

    public List<ListaCamposFormulario> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
    }

    public DetalharModeloSchema withListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
        return this;
    }

    public List<ListaCamposNcm> getListaCamposNcm() {
        return listaCamposNcm;
    }

    public void setListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
    }

    public DetalharModeloSchema withListaCamposNcm(List<ListaCamposNcm> listaCamposNcm) {
        this.listaCamposNcm = listaCamposNcm;
        return this;
    }

    public Boolean getPermiteMultiplosCpfCnpjExportador() {
        return permiteMultiplosCpfCnpjExportador;
    }

    public void setPermiteMultiplosCpfCnpjExportador(Boolean permiteMultiplosCpfCnpjExportador) {
        this.permiteMultiplosCpfCnpjExportador = permiteMultiplosCpfCnpjExportador;
    }

    public DetalharModeloSchema withPermiteMultiplosCpfCnpjExportador(Boolean permiteMultiplosCpfCnpjExportador) {
        this.permiteMultiplosCpfCnpjExportador = permiteMultiplosCpfCnpjExportador;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("modelo", modelo).append("listaCamposFormulario", listaCamposFormulario).append("listaCamposNcm", listaCamposNcm).append("permiteMultiplosCpfCnpjExportador", permiteMultiplosCpfCnpjExportador).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listaCamposNcm).append(permiteMultiplosCpfCnpjExportador).append(modelo).append(listaCamposFormulario).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharModeloSchema) == false) {
            return false;
        }
        DetalharModeloSchema rhs = ((DetalharModeloSchema) other);
        return new EqualsBuilder().append(listaCamposNcm, rhs.listaCamposNcm).append(permiteMultiplosCpfCnpjExportador, rhs.permiteMultiplosCpfCnpjExportador).append(modelo, rhs.modelo).append(listaCamposFormulario, rhs.listaCamposFormulario).isEquals();
    }

}
