
package br.gov.siscomex.lpco.solicitar_retificacao;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SolicitarRetificacaoSchema {

    @SerializedName("justificativa")
    @Expose
    private String justificativa;
    @SerializedName("informacaoAdicional")
    @Expose
    private String informacaoAdicional;
    @SerializedName("listaNcm")
    @Expose
    @Valid
    private List<ListaNcm> listaNcm = new ArrayList<ListaNcm>();
    @SerializedName("listaCamposFormulario")
    @Expose
    @Valid
    private List<ListaCamposFormulario> listaCamposFormulario = new ArrayList<ListaCamposFormulario>();
    @SerializedName("unidadeMedidaComercializada")
    @Expose
    private String unidadeMedidaComercializada;

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public SolicitarRetificacaoSchema withJustificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public SolicitarRetificacaoSchema withInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
        return this;
    }

    public List<ListaNcm> getListaNcm() {
        return listaNcm;
    }

    public void setListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
    }

    public SolicitarRetificacaoSchema withListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
        return this;
    }

    public List<ListaCamposFormulario> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
    }

    public SolicitarRetificacaoSchema withListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
        return this;
    }

    public String getUnidadeMedidaComercializada() {
        return unidadeMedidaComercializada;
    }

    public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    }

    public SolicitarRetificacaoSchema withUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("justificativa", justificativa).append("informacaoAdicional", informacaoAdicional).append("listaNcm", listaNcm).append("listaCamposFormulario", listaCamposFormulario).append("unidadeMedidaComercializada", unidadeMedidaComercializada).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unidadeMedidaComercializada).append(listaCamposFormulario).append(justificativa).append(informacaoAdicional).append(listaNcm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SolicitarRetificacaoSchema) == false) {
            return false;
        }
        SolicitarRetificacaoSchema rhs = ((SolicitarRetificacaoSchema) other);
        return new EqualsBuilder().append(unidadeMedidaComercializada, rhs.unidadeMedidaComercializada).append(listaCamposFormulario, rhs.listaCamposFormulario).append(justificativa, rhs.justificativa).append(informacaoAdicional, rhs.informacaoAdicional).append(listaNcm, rhs.listaNcm).isEquals();
    }

}
