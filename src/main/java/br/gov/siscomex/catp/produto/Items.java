
package br.gov.siscomex.catp.produto;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Items {

    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("descricao")
    @Expose
    private String descricao;
    @SerializedName("cnpjRaiz")
    @Expose
    private String cnpjRaiz;
    @SerializedName("situacao")
    @Expose
    private String situacao;
    @SerializedName("modalidade")
    @Expose
    private String modalidade;
    @SerializedName("ncm")
    @Expose
    private String ncm;
    @SerializedName("codigoNaladi")
    @Expose
    private Integer codigoNaladi;
    @SerializedName("codigoGPC")
    @Expose
    private Integer codigoGPC;
    @SerializedName("codigoGPCBrick")
    @Expose
    private Integer codigoGPCBrick;
    @SerializedName("codigoUNSPSC")
    @Expose
    private Integer codigoUNSPSC;
    @SerializedName("paisOrigem")
    @Expose
    private String paisOrigem;
    @SerializedName("cpfCnpjFabricante")
    @Expose
    private String cpfCnpjFabricante;
    @SerializedName("fabricanteConhecido")
    @Expose
    private Boolean fabricanteConhecido;
    @SerializedName("codigoOperadorEstrangeiro")
    @Expose
    private Integer codigoOperadorEstrangeiro;
    @SerializedName("atributos")
    @Expose
    private List<Atributo> atributos = new ArrayList<Atributo>();
    @SerializedName("codigosInterno")
    @Expose
    private List<String> codigosInterno = new ArrayList<String>();

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Items withSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Items withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Items withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getCnpjRaiz() {
        return cnpjRaiz;
    }

    public void setCnpjRaiz(String cnpjRaiz) {
        this.cnpjRaiz = cnpjRaiz;
    }

    public Items withCnpjRaiz(String cnpjRaiz) {
        this.cnpjRaiz = cnpjRaiz;
        return this;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Items withSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Items withModalidade(String modalidade) {
        this.modalidade = modalidade;
        return this;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Items withNcm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    public Integer getCodigoNaladi() {
        return codigoNaladi;
    }

    public void setCodigoNaladi(Integer codigoNaladi) {
        this.codigoNaladi = codigoNaladi;
    }

    public Items withCodigoNaladi(Integer codigoNaladi) {
        this.codigoNaladi = codigoNaladi;
        return this;
    }

    public Integer getCodigoGPC() {
        return codigoGPC;
    }

    public void setCodigoGPC(Integer codigoGPC) {
        this.codigoGPC = codigoGPC;
    }

    public Items withCodigoGPC(Integer codigoGPC) {
        this.codigoGPC = codigoGPC;
        return this;
    }

    public Integer getCodigoGPCBrick() {
        return codigoGPCBrick;
    }

    public void setCodigoGPCBrick(Integer codigoGPCBrick) {
        this.codigoGPCBrick = codigoGPCBrick;
    }

    public Items withCodigoGPCBrick(Integer codigoGPCBrick) {
        this.codigoGPCBrick = codigoGPCBrick;
        return this;
    }

    public Integer getCodigoUNSPSC() {
        return codigoUNSPSC;
    }

    public void setCodigoUNSPSC(Integer codigoUNSPSC) {
        this.codigoUNSPSC = codigoUNSPSC;
    }

    public Items withCodigoUNSPSC(Integer codigoUNSPSC) {
        this.codigoUNSPSC = codigoUNSPSC;
        return this;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public Items withPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
        return this;
    }

    public String getCpfCnpjFabricante() {
        return cpfCnpjFabricante;
    }

    public void setCpfCnpjFabricante(String cpfCnpjFabricante) {
        this.cpfCnpjFabricante = cpfCnpjFabricante;
    }

    public Items withCpfCnpjFabricante(String cpfCnpjFabricante) {
        this.cpfCnpjFabricante = cpfCnpjFabricante;
        return this;
    }

    public Boolean getFabricanteConhecido() {
        return fabricanteConhecido;
    }

    public void setFabricanteConhecido(Boolean fabricanteConhecido) {
        this.fabricanteConhecido = fabricanteConhecido;
    }

    public Items withFabricanteConhecido(Boolean fabricanteConhecido) {
        this.fabricanteConhecido = fabricanteConhecido;
        return this;
    }

    public Integer getCodigoOperadorEstrangeiro() {
        return codigoOperadorEstrangeiro;
    }

    public void setCodigoOperadorEstrangeiro(Integer codigoOperadorEstrangeiro) {
        this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
    }

    public Items withCodigoOperadorEstrangeiro(Integer codigoOperadorEstrangeiro) {
        this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
        return this;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }

    public Items withAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
        return this;
    }

    public List<String> getCodigosInterno() {
        return codigosInterno;
    }

    public void setCodigosInterno(List<String> codigosInterno) {
        this.codigosInterno = codigosInterno;
    }

    public Items withCodigosInterno(List<String> codigosInterno) {
        this.codigosInterno = codigosInterno;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seq", seq).append("codigo", codigo).append("descricao", descricao).append("cnpjRaiz", cnpjRaiz).append("situacao", situacao).append("modalidade", modalidade).append("ncm", ncm).append("codigoNaladi", codigoNaladi).append("codigoGPC", codigoGPC).append("codigoGPCBrick", codigoGPCBrick).append("codigoUNSPSC", codigoUNSPSC).append("paisOrigem", paisOrigem).append("cpfCnpjFabricante", cpfCnpjFabricante).append("fabricanteConhecido", fabricanteConhecido).append("codigoOperadorEstrangeiro", codigoOperadorEstrangeiro).append("atributos", atributos).append("codigosInterno", codigosInterno).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fabricanteConhecido).append(codigo).append(situacao).append(codigoNaladi).append(descricao).append(codigoGPCBrick).append(codigoOperadorEstrangeiro).append(codigoGPC).append(codigoUNSPSC).append(codigosInterno).append(cnpjRaiz).append(ncm).append(paisOrigem).append(cpfCnpjFabricante).append(seq).append(atributos).append(modalidade).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Items) == false) {
            return false;
        }
        Items rhs = ((Items) other);
        return new EqualsBuilder().append(fabricanteConhecido, rhs.fabricanteConhecido).append(codigo, rhs.codigo).append(situacao, rhs.situacao).append(codigoNaladi, rhs.codigoNaladi).append(descricao, rhs.descricao).append(codigoGPCBrick, rhs.codigoGPCBrick).append(codigoOperadorEstrangeiro, rhs.codigoOperadorEstrangeiro).append(codigoGPC, rhs.codigoGPC).append(codigoUNSPSC, rhs.codigoUNSPSC).append(codigosInterno, rhs.codigosInterno).append(cnpjRaiz, rhs.cnpjRaiz).append(ncm, rhs.ncm).append(paisOrigem, rhs.paisOrigem).append(cpfCnpjFabricante, rhs.cpfCnpjFabricante).append(seq, rhs.seq).append(atributos, rhs.atributos).append(modalidade, rhs.modalidade).isEquals();
    }

}
