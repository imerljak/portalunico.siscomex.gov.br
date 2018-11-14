
package br.gov.siscomex.lpco.incluir_pedido;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class IncluirPedidoSchema {

    @SerializedName("codigoModelo")
    @Expose
    private String codigoModelo;
    @SerializedName("importadorExportador")
    @Expose
    private String importadorExportador;
    @SerializedName("declarante")
    @Expose
    private String declarante;
    @SerializedName("unidadeMedidaEstatistica")
    @Expose
    private String unidadeMedidaEstatistica;
    @SerializedName("unidadeMedidaComercializada")
    @Expose
    private String unidadeMedidaComercializada;
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

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public IncluirPedidoSchema withCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
        return this;
    }

    public String getImportadorExportador() {
        return importadorExportador;
    }

    public void setImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
    }

    public IncluirPedidoSchema withImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
        return this;
    }

    public String getDeclarante() {
        return declarante;
    }

    public void setDeclarante(String declarante) {
        this.declarante = declarante;
    }

    public IncluirPedidoSchema withDeclarante(String declarante) {
        this.declarante = declarante;
        return this;
    }

    public String getUnidadeMedidaEstatistica() {
        return unidadeMedidaEstatistica;
    }

    public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    }

    public IncluirPedidoSchema withUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
        return this;
    }

    public String getUnidadeMedidaComercializada() {
        return unidadeMedidaComercializada;
    }

    public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    }

    public IncluirPedidoSchema withUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
        return this;
    }

    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public IncluirPedidoSchema withInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
        return this;
    }

    public List<ListaNcm> getListaNcm() {
        return listaNcm;
    }

    public void setListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
    }

    public IncluirPedidoSchema withListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
        return this;
    }

    public List<ListaCamposFormulario> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
    }

    public IncluirPedidoSchema withListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigoModelo", codigoModelo).append("importadorExportador", importadorExportador).append("declarante", declarante).append("unidadeMedidaEstatistica", unidadeMedidaEstatistica).append("unidadeMedidaComercializada", unidadeMedidaComercializada).append("informacaoAdicional", informacaoAdicional).append("listaNcm", listaNcm).append("listaCamposFormulario", listaCamposFormulario).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unidadeMedidaEstatistica).append(codigoModelo).append(declarante).append(informacaoAdicional).append(importadorExportador).append(unidadeMedidaComercializada).append(listaCamposFormulario).append(listaNcm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncluirPedidoSchema) == false) {
            return false;
        }
        IncluirPedidoSchema rhs = ((IncluirPedidoSchema) other);
        return new EqualsBuilder().append(unidadeMedidaEstatistica, rhs.unidadeMedidaEstatistica).append(codigoModelo, rhs.codigoModelo).append(declarante, rhs.declarante).append(informacaoAdicional, rhs.informacaoAdicional).append(importadorExportador, rhs.importadorExportador).append(unidadeMedidaComercializada, rhs.unidadeMedidaComercializada).append(listaCamposFormulario, rhs.listaCamposFormulario).append(listaNcm, rhs.listaNcm).isEquals();
    }

}
