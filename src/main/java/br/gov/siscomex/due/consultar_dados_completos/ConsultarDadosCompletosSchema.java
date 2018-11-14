
package br.gov.siscomex.due.consultar_dados_completos;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Welcome
 * <p>
 * 
 * 
 */
public class ConsultarDadosCompletosSchema {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("bloqueio")
    @Expose
    @NotNull
    private Boolean bloqueio;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("chaveDeAcesso")
    @Expose
    @NotNull
    private String chaveDeAcesso;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("dataDeRegistro")
    @Expose
    @NotNull
    private String dataDeRegistro;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("embarqueEmRecintoAlfandegado")
    @Expose
    @NotNull
    private Boolean embarqueEmRecintoAlfandegado;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("despachoEmRecintoAlfandegado")
    @Expose
    @NotNull
    private Boolean despachoEmRecintoAlfandegado;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("eventosDoHistorico")
    @Expose
    @Valid
    @NotNull
    private List<EventosDoHistorico> eventosDoHistorico = new ArrayList<EventosDoHistorico>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("impedidoDeEmbarque")
    @Expose
    @NotNull
    private Boolean impedidoDeEmbarque;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("itens")
    @Expose
    @Valid
    @NotNull
    private List<Iten> itens = new ArrayList<Iten>();
    /**
     * Moeda
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("moeda")
    @Expose
    @Valid
    @NotNull
    private ListaPaisDestino moeda;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("numero")
    @Expose
    @NotNull
    private String numero;
    /**
     * Moeda
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("paisImportador")
    @Expose
    @Valid
    @NotNull
    private ListaPaisDestino paisImportador;
    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("recintoAduaneiroDeDespacho")
    @Expose
    @Valid
    @NotNull
    private CodigoCondicaoVenda recintoAduaneiroDeDespacho;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("ruc")
    @Expose
    @NotNull
    private String ruc;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("situacao")
    @Expose
    @NotNull
    private String situacao;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("situacoesDaCarga")
    @Expose
    @Valid
    @NotNull
    private List<Object> situacoesDaCarga = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("tratamentoPrioritario")
    @Expose
    @NotNull
    private Boolean tratamentoPrioritario;
    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("unidadeLocalDeDespacho")
    @Expose
    @Valid
    @NotNull
    private CodigoCondicaoVenda unidadeLocalDeDespacho;
    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("unidadeLocalDeEmbarque")
    @Expose
    @Valid
    @NotNull
    private CodigoCondicaoVenda unidadeLocalDeEmbarque;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("despachoEmRecintoDomiciliar")
    @Expose
    @NotNull
    private Boolean despachoEmRecintoDomiciliar;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("dataDeCriacao")
    @Expose
    @NotNull
    private String dataDeCriacao;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("dat")
    @Expose
    @NotNull
    private Boolean dat;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("oea")
    @Expose
    @NotNull
    private Boolean oea;

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getBloqueio() {
        return bloqueio;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setBloqueio(Boolean bloqueio) {
        this.bloqueio = bloqueio;
    }

    public ConsultarDadosCompletosSchema withBloqueio(Boolean bloqueio) {
        this.bloqueio = bloqueio;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public ConsultarDadosCompletosSchema withChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    public ConsultarDadosCompletosSchema withDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getEmbarqueEmRecintoAlfandegado() {
        return embarqueEmRecintoAlfandegado;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEmbarqueEmRecintoAlfandegado(Boolean embarqueEmRecintoAlfandegado) {
        this.embarqueEmRecintoAlfandegado = embarqueEmRecintoAlfandegado;
    }

    public ConsultarDadosCompletosSchema withEmbarqueEmRecintoAlfandegado(Boolean embarqueEmRecintoAlfandegado) {
        this.embarqueEmRecintoAlfandegado = embarqueEmRecintoAlfandegado;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getDespachoEmRecintoAlfandegado() {
        return despachoEmRecintoAlfandegado;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDespachoEmRecintoAlfandegado(Boolean despachoEmRecintoAlfandegado) {
        this.despachoEmRecintoAlfandegado = despachoEmRecintoAlfandegado;
    }

    public ConsultarDadosCompletosSchema withDespachoEmRecintoAlfandegado(Boolean despachoEmRecintoAlfandegado) {
        this.despachoEmRecintoAlfandegado = despachoEmRecintoAlfandegado;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<EventosDoHistorico> getEventosDoHistorico() {
        return eventosDoHistorico;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEventosDoHistorico(List<EventosDoHistorico> eventosDoHistorico) {
        this.eventosDoHistorico = eventosDoHistorico;
    }

    public ConsultarDadosCompletosSchema withEventosDoHistorico(List<EventosDoHistorico> eventosDoHistorico) {
        this.eventosDoHistorico = eventosDoHistorico;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getImpedidoDeEmbarque() {
        return impedidoDeEmbarque;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setImpedidoDeEmbarque(Boolean impedidoDeEmbarque) {
        this.impedidoDeEmbarque = impedidoDeEmbarque;
    }

    public ConsultarDadosCompletosSchema withImpedidoDeEmbarque(Boolean impedidoDeEmbarque) {
        this.impedidoDeEmbarque = impedidoDeEmbarque;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Iten> getItens() {
        return itens;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setItens(List<Iten> itens) {
        this.itens = itens;
    }

    public ConsultarDadosCompletosSchema withItens(List<Iten> itens) {
        this.itens = itens;
        return this;
    }

    /**
     * Moeda
     * <p>
     * 
     * (Required)
     * 
     */
    public ListaPaisDestino getMoeda() {
        return moeda;
    }

    /**
     * Moeda
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMoeda(ListaPaisDestino moeda) {
        this.moeda = moeda;
    }

    public ConsultarDadosCompletosSchema withMoeda(ListaPaisDestino moeda) {
        this.moeda = moeda;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getNumero() {
        return numero;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ConsultarDadosCompletosSchema withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Moeda
     * <p>
     * 
     * (Required)
     * 
     */
    public ListaPaisDestino getPaisImportador() {
        return paisImportador;
    }

    /**
     * Moeda
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPaisImportador(ListaPaisDestino paisImportador) {
        this.paisImportador = paisImportador;
    }

    public ConsultarDadosCompletosSchema withPaisImportador(ListaPaisDestino paisImportador) {
        this.paisImportador = paisImportador;
        return this;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public CodigoCondicaoVenda getRecintoAduaneiroDeDespacho() {
        return recintoAduaneiroDeDespacho;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRecintoAduaneiroDeDespacho(CodigoCondicaoVenda recintoAduaneiroDeDespacho) {
        this.recintoAduaneiroDeDespacho = recintoAduaneiroDeDespacho;
    }

    public ConsultarDadosCompletosSchema withRecintoAduaneiroDeDespacho(CodigoCondicaoVenda recintoAduaneiroDeDespacho) {
        this.recintoAduaneiroDeDespacho = recintoAduaneiroDeDespacho;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public ConsultarDadosCompletosSchema withRuc(String ruc) {
        this.ruc = ruc;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ConsultarDadosCompletosSchema withSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Object> getSituacoesDaCarga() {
        return situacoesDaCarga;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSituacoesDaCarga(List<Object> situacoesDaCarga) {
        this.situacoesDaCarga = situacoesDaCarga;
    }

    public ConsultarDadosCompletosSchema withSituacoesDaCarga(List<Object> situacoesDaCarga) {
        this.situacoesDaCarga = situacoesDaCarga;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getTratamentoPrioritario() {
        return tratamentoPrioritario;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTratamentoPrioritario(Boolean tratamentoPrioritario) {
        this.tratamentoPrioritario = tratamentoPrioritario;
    }

    public ConsultarDadosCompletosSchema withTratamentoPrioritario(Boolean tratamentoPrioritario) {
        this.tratamentoPrioritario = tratamentoPrioritario;
        return this;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public CodigoCondicaoVenda getUnidadeLocalDeDespacho() {
        return unidadeLocalDeDespacho;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUnidadeLocalDeDespacho(CodigoCondicaoVenda unidadeLocalDeDespacho) {
        this.unidadeLocalDeDespacho = unidadeLocalDeDespacho;
    }

    public ConsultarDadosCompletosSchema withUnidadeLocalDeDespacho(CodigoCondicaoVenda unidadeLocalDeDespacho) {
        this.unidadeLocalDeDespacho = unidadeLocalDeDespacho;
        return this;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public CodigoCondicaoVenda getUnidadeLocalDeEmbarque() {
        return unidadeLocalDeEmbarque;
    }

    /**
     * RecintoAduaneiroDeDespacho
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUnidadeLocalDeEmbarque(CodigoCondicaoVenda unidadeLocalDeEmbarque) {
        this.unidadeLocalDeEmbarque = unidadeLocalDeEmbarque;
    }

    public ConsultarDadosCompletosSchema withUnidadeLocalDeEmbarque(CodigoCondicaoVenda unidadeLocalDeEmbarque) {
        this.unidadeLocalDeEmbarque = unidadeLocalDeEmbarque;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getDespachoEmRecintoDomiciliar() {
        return despachoEmRecintoDomiciliar;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDespachoEmRecintoDomiciliar(Boolean despachoEmRecintoDomiciliar) {
        this.despachoEmRecintoDomiciliar = despachoEmRecintoDomiciliar;
    }

    public ConsultarDadosCompletosSchema withDespachoEmRecintoDomiciliar(Boolean despachoEmRecintoDomiciliar) {
        this.despachoEmRecintoDomiciliar = despachoEmRecintoDomiciliar;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public ConsultarDadosCompletosSchema withDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getDat() {
        return dat;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDat(Boolean dat) {
        this.dat = dat;
    }

    public ConsultarDadosCompletosSchema withDat(Boolean dat) {
        this.dat = dat;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getOea() {
        return oea;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setOea(Boolean oea) {
        this.oea = oea;
    }

    public ConsultarDadosCompletosSchema withOea(Boolean oea) {
        this.oea = oea;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bloqueio", bloqueio).append("chaveDeAcesso", chaveDeAcesso).append("dataDeRegistro", dataDeRegistro).append("embarqueEmRecintoAlfandegado", embarqueEmRecintoAlfandegado).append("despachoEmRecintoAlfandegado", despachoEmRecintoAlfandegado).append("eventosDoHistorico", eventosDoHistorico).append("impedidoDeEmbarque", impedidoDeEmbarque).append("itens", itens).append("moeda", moeda).append("numero", numero).append("paisImportador", paisImportador).append("recintoAduaneiroDeDespacho", recintoAduaneiroDeDespacho).append("ruc", ruc).append("situacao", situacao).append("situacoesDaCarga", situacoesDaCarga).append("tratamentoPrioritario", tratamentoPrioritario).append("unidadeLocalDeDespacho", unidadeLocalDeDespacho).append("unidadeLocalDeEmbarque", unidadeLocalDeEmbarque).append("despachoEmRecintoDomiciliar", despachoEmRecintoDomiciliar).append("dataDeCriacao", dataDeCriacao).append("dat", dat).append("oea", oea).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ruc).append(itens).append(situacao).append(tratamentoPrioritario).append(numero).append(despachoEmRecintoAlfandegado).append(dataDeCriacao).append(eventosDoHistorico).append(oea).append(paisImportador).append(unidadeLocalDeEmbarque).append(bloqueio).append(unidadeLocalDeDespacho).append(chaveDeAcesso).append(moeda).append(despachoEmRecintoDomiciliar).append(dat).append(dataDeRegistro).append(impedidoDeEmbarque).append(embarqueEmRecintoAlfandegado).append(recintoAduaneiroDeDespacho).append(situacoesDaCarga).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDadosCompletosSchema) == false) {
            return false;
        }
        ConsultarDadosCompletosSchema rhs = ((ConsultarDadosCompletosSchema) other);
        return new EqualsBuilder().append(ruc, rhs.ruc).append(itens, rhs.itens).append(situacao, rhs.situacao).append(tratamentoPrioritario, rhs.tratamentoPrioritario).append(numero, rhs.numero).append(despachoEmRecintoAlfandegado, rhs.despachoEmRecintoAlfandegado).append(dataDeCriacao, rhs.dataDeCriacao).append(eventosDoHistorico, rhs.eventosDoHistorico).append(oea, rhs.oea).append(paisImportador, rhs.paisImportador).append(unidadeLocalDeEmbarque, rhs.unidadeLocalDeEmbarque).append(bloqueio, rhs.bloqueio).append(unidadeLocalDeDespacho, rhs.unidadeLocalDeDespacho).append(chaveDeAcesso, rhs.chaveDeAcesso).append(moeda, rhs.moeda).append(despachoEmRecintoDomiciliar, rhs.despachoEmRecintoDomiciliar).append(dat, rhs.dat).append(dataDeRegistro, rhs.dataDeRegistro).append(impedidoDeEmbarque, rhs.impedidoDeEmbarque).append(embarqueEmRecintoAlfandegado, rhs.embarqueEmRecintoAlfandegado).append(recintoAduaneiroDeDespacho, rhs.recintoAduaneiroDeDespacho).append(situacoesDaCarga, rhs.situacoesDaCarga).isEquals();
    }

}
