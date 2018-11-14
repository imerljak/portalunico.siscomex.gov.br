
package br.gov.siscomex.lpco.detalhar_pedido;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DetalharPedidoSchema {

    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("chaveAcesso")
    @Expose
    private String chaveAcesso;
    @SerializedName("codigoModelo")
    @Expose
    private String codigoModelo;
    @SerializedName("orgao")
    @Expose
    private String orgao;
    @SerializedName("situacao")
    @Expose
    @Valid
    private Situacao situacao;
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
    @SerializedName("listaVinculos")
    @Expose
    @Valid
    private List<ListaVinculo> listaVinculos = new ArrayList<ListaVinculo>();
    @SerializedName("saldo")
    @Expose
    @Valid
    private Saldo saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DetalharPedidoSchema withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public DetalharPedidoSchema withChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
        return this;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public DetalharPedidoSchema withCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
        return this;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public DetalharPedidoSchema withOrgao(String orgao) {
        this.orgao = orgao;
        return this;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public DetalharPedidoSchema withSituacao(Situacao situacao) {
        this.situacao = situacao;
        return this;
    }

    public String getImportadorExportador() {
        return importadorExportador;
    }

    public void setImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
    }

    public DetalharPedidoSchema withImportadorExportador(String importadorExportador) {
        this.importadorExportador = importadorExportador;
        return this;
    }

    public String getDeclarante() {
        return declarante;
    }

    public void setDeclarante(String declarante) {
        this.declarante = declarante;
    }

    public DetalharPedidoSchema withDeclarante(String declarante) {
        this.declarante = declarante;
        return this;
    }

    public String getUnidadeMedidaEstatistica() {
        return unidadeMedidaEstatistica;
    }

    public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    }

    public DetalharPedidoSchema withUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
        return this;
    }

    public String getUnidadeMedidaComercializada() {
        return unidadeMedidaComercializada;
    }

    public void setUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
    }

    public DetalharPedidoSchema withUnidadeMedidaComercializada(String unidadeMedidaComercializada) {
        this.unidadeMedidaComercializada = unidadeMedidaComercializada;
        return this;
    }

    public String getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    public DetalharPedidoSchema withInformacaoAdicional(String informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
        return this;
    }

    public List<ListaNcm> getListaNcm() {
        return listaNcm;
    }

    public void setListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
    }

    public DetalharPedidoSchema withListaNcm(List<ListaNcm> listaNcm) {
        this.listaNcm = listaNcm;
        return this;
    }

    public List<ListaCamposFormulario> getListaCamposFormulario() {
        return listaCamposFormulario;
    }

    public void setListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
    }

    public DetalharPedidoSchema withListaCamposFormulario(List<ListaCamposFormulario> listaCamposFormulario) {
        this.listaCamposFormulario = listaCamposFormulario;
        return this;
    }

    public List<ListaVinculo> getListaVinculos() {
        return listaVinculos;
    }

    public void setListaVinculos(List<ListaVinculo> listaVinculos) {
        this.listaVinculos = listaVinculos;
    }

    public DetalharPedidoSchema withListaVinculos(List<ListaVinculo> listaVinculos) {
        this.listaVinculos = listaVinculos;
        return this;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public DetalharPedidoSchema withSaldo(Saldo saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numero", numero).append("chaveAcesso", chaveAcesso).append("codigoModelo", codigoModelo).append("orgao", orgao).append("situacao", situacao).append("importadorExportador", importadorExportador).append("declarante", declarante).append("unidadeMedidaEstatistica", unidadeMedidaEstatistica).append("unidadeMedidaComercializada", unidadeMedidaComercializada).append("informacaoAdicional", informacaoAdicional).append("listaNcm", listaNcm).append("listaCamposFormulario", listaCamposFormulario).append("listaVinculos", listaVinculos).append("saldo", saldo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listaVinculos).append(situacao).append(orgao).append(numero).append(codigoModelo).append(declarante).append(importadorExportador).append(saldo).append(listaCamposFormulario).append(listaNcm).append(unidadeMedidaEstatistica).append(chaveAcesso).append(informacaoAdicional).append(unidadeMedidaComercializada).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalharPedidoSchema) == false) {
            return false;
        }
        DetalharPedidoSchema rhs = ((DetalharPedidoSchema) other);
        return new EqualsBuilder().append(listaVinculos, rhs.listaVinculos).append(situacao, rhs.situacao).append(orgao, rhs.orgao).append(numero, rhs.numero).append(codigoModelo, rhs.codigoModelo).append(declarante, rhs.declarante).append(importadorExportador, rhs.importadorExportador).append(saldo, rhs.saldo).append(listaCamposFormulario, rhs.listaCamposFormulario).append(listaNcm, rhs.listaNcm).append(unidadeMedidaEstatistica, rhs.unidadeMedidaEstatistica).append(chaveAcesso, rhs.chaveAcesso).append(informacaoAdicional, rhs.informacaoAdicional).append(unidadeMedidaComercializada, rhs.unidadeMedidaComercializada).isEquals();
    }

}
