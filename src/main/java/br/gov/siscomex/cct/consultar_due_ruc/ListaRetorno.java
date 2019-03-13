
package br.gov.siscomex.cct.consultar_due_ruc;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaRetorno {

    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado")
    @Expose
    private Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    @SerializedName("existeImpedimentoEmbarque")
    @Expose
    private Boolean existeImpedimentoEmbarque;
    @SerializedName("indicadorSeCargaRUCMaster")
    @Expose
    private Boolean indicadorSeCargaRUCMaster;
    @SerializedName("numeroRUCMasterDaCarga")
    @Expose
    private String numeroRUCMasterDaCarga;
    @SerializedName("conteineres")
    @Expose
    @Valid
    private List<String> conteineres = new ArrayList<String>();
    @SerializedName("documentosDeTransporte")
    @Expose
    @Valid
    private List<DocumentosDeTransporte> documentosDeTransporte = new ArrayList<DocumentosDeTransporte>();
    @SerializedName("listaCargasSoltasVeiculos")
    @Expose
    @Valid
    private List<ListaCargasSoltasVeiculo> listaCargasSoltasVeiculos = new ArrayList<ListaCargasSoltasVeiculo>();
    @SerializedName("listaGraneis")
    @Expose
    @Valid
    private List<ListaGranei> listaGraneis = new ArrayList<ListaGranei>();

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public ListaRetorno withNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public ListaRetorno withNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
        return this;
    }

    public Boolean getOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado() {
        return ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    }

    public void setOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado(Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado) {
        this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado = ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
    }

    public ListaRetorno withOcorreuDesembaracoOuAutorizacaoEmbarqueAntecipado(Boolean ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado) {
        this.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado = ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado;
        return this;
    }

    public Boolean getExisteImpedimentoEmbarque() {
        return existeImpedimentoEmbarque;
    }

    public void setExisteImpedimentoEmbarque(Boolean existeImpedimentoEmbarque) {
        this.existeImpedimentoEmbarque = existeImpedimentoEmbarque;
    }

    public ListaRetorno withExisteImpedimentoEmbarque(Boolean existeImpedimentoEmbarque) {
        this.existeImpedimentoEmbarque = existeImpedimentoEmbarque;
        return this;
    }

    public Boolean getIndicadorSeCargaRUCMaster() {
        return indicadorSeCargaRUCMaster;
    }

    public void setIndicadorSeCargaRUCMaster(Boolean indicadorSeCargaRUCMaster) {
        this.indicadorSeCargaRUCMaster = indicadorSeCargaRUCMaster;
    }

    public ListaRetorno withIndicadorSeCargaRUCMaster(Boolean indicadorSeCargaRUCMaster) {
        this.indicadorSeCargaRUCMaster = indicadorSeCargaRUCMaster;
        return this;
    }

    public String getNumeroRUCMasterDaCarga() {
        return numeroRUCMasterDaCarga;
    }

    public void setNumeroRUCMasterDaCarga(String numeroRUCMasterDaCarga) {
        this.numeroRUCMasterDaCarga = numeroRUCMasterDaCarga;
    }

    public ListaRetorno withNumeroRUCMasterDaCarga(String numeroRUCMasterDaCarga) {
        this.numeroRUCMasterDaCarga = numeroRUCMasterDaCarga;
        return this;
    }

    public List<String> getConteineres() {
        return conteineres;
    }

    public void setConteineres(List<String> conteineres) {
        this.conteineres = conteineres;
    }

    public ListaRetorno withConteineres(List<String> conteineres) {
        this.conteineres = conteineres;
        return this;
    }

    public List<DocumentosDeTransporte> getDocumentosDeTransporte() {
        return documentosDeTransporte;
    }

    public void setDocumentosDeTransporte(List<DocumentosDeTransporte> documentosDeTransporte) {
        this.documentosDeTransporte = documentosDeTransporte;
    }

    public ListaRetorno withDocumentosDeTransporte(List<DocumentosDeTransporte> documentosDeTransporte) {
        this.documentosDeTransporte = documentosDeTransporte;
        return this;
    }

    public List<ListaCargasSoltasVeiculo> getListaCargasSoltasVeiculos() {
        return listaCargasSoltasVeiculos;
    }

    public void setListaCargasSoltasVeiculos(List<ListaCargasSoltasVeiculo> listaCargasSoltasVeiculos) {
        this.listaCargasSoltasVeiculos = listaCargasSoltasVeiculos;
    }

    public ListaRetorno withListaCargasSoltasVeiculos(List<ListaCargasSoltasVeiculo> listaCargasSoltasVeiculos) {
        this.listaCargasSoltasVeiculos = listaCargasSoltasVeiculos;
        return this;
    }

    public List<ListaGranei> getListaGraneis() {
        return listaGraneis;
    }

    public void setListaGraneis(List<ListaGranei> listaGraneis) {
        this.listaGraneis = listaGraneis;
    }

    public ListaRetorno withListaGraneis(List<ListaGranei> listaGraneis) {
        this.listaGraneis = listaGraneis;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroRUC", numeroRUC).append("numeroDUE", numeroDUE).append("ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado", ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado).append("existeImpedimentoEmbarque", existeImpedimentoEmbarque).append("indicadorSeCargaRUCMaster", indicadorSeCargaRUCMaster).append("numeroRUCMasterDaCarga", numeroRUCMasterDaCarga).append("conteineres", conteineres).append("documentosDeTransporte", documentosDeTransporte).append("listaCargasSoltasVeiculos", listaCargasSoltasVeiculos).append("listaGraneis", listaGraneis).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(indicadorSeCargaRUCMaster).append(numeroRUCMasterDaCarga).append(documentosDeTransporte).append(numeroDUE).append(ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado).append(listaCargasSoltasVeiculos).append(numeroRUC).append(existeImpedimentoEmbarque).append(conteineres).append(listaGraneis).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaRetorno) == false) {
            return false;
        }
        ListaRetorno rhs = ((ListaRetorno) other);
        return new EqualsBuilder().append(indicadorSeCargaRUCMaster, rhs.indicadorSeCargaRUCMaster).append(numeroRUCMasterDaCarga, rhs.numeroRUCMasterDaCarga).append(documentosDeTransporte, rhs.documentosDeTransporte).append(numeroDUE, rhs.numeroDUE).append(ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado, rhs.ocorreuDesembaracoOuAutorizacaoEmbarqueAntecipado).append(listaCargasSoltasVeiculos, rhs.listaCargasSoltasVeiculos).append(numeroRUC, rhs.numeroRUC).append(existeImpedimentoEmbarque, rhs.existeImpedimentoEmbarque).append(conteineres, rhs.conteineres).append(listaGraneis, rhs.listaGraneis).isEquals();
    }

}
