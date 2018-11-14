//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de ManifestacaoExportacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ManifestacaoExportacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoManifestacao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/&gt;
 *         &lt;element name="tipoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}TipoDocumentoTransporte"/&gt;
 *         &lt;element name="indCargaEnviadaDespacho" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/&gt;
 *         &lt;element name="cargaJaEmbarcada" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="cnpjTransportador" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *           &lt;element name="cpfTransportador" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="codigoURF" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/&gt;
 *             &lt;element name="coordenadas" type="{http://www.pucomex.serpro.gov.br/cct}Coordenadas" minOccurs="0"/&gt;
 *             &lt;element name="cnpjRespEstoqueCarga" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="codigoRA" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="veiculoAereo"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAereo"/&gt;
 *                     &lt;element name="prefixoAeronave" type="{http://www.pucomex.serpro.gov.br/cct}PrefixoAeronave"/&gt;
 *                     &lt;element name="numeroVoo" type="{http://www.pucomex.serpro.gov.br/cct}NumeroVoo"/&gt;
 *                     &lt;element name="dataPartidaProcedencia" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="veiculoAquaviario"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAquaViario"/&gt;
 *                     &lt;element name="codigoIMO" type="{http://www.pucomex.serpro.gov.br/cct}CodigoIMO"/&gt;
 *                     &lt;element name="numeroEscala" type="{http://www.pucomex.serpro.gov.br/cct}NumeroEscala"/&gt;
 *                     &lt;element name="dataEncerramentoManifesto" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="outroModal"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioOutroVeiculo"/&gt;
 *                     &lt;element name="identificacaoVeiculo" type="{http://www.pucomex.serpro.gov.br/cct}IdentificacaoVeiculo"/&gt;
 *                     &lt;element name="numeroDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDocumentoTransporte"/&gt;
 *                     &lt;element name="dataEmissaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="conhecimentosCarga"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}Conhecimento" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="transporteProprio"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="observacoes" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestacaoExportacao", propOrder = {
    "identificacaoManifestacao",
    "tipoDocumentoTransporte",
    "indCargaEnviadaDespacho",
    "cargaJaEmbarcada",
    "cnpjTransportador",
    "cpfTransportador",
    "codigoURF",
    "coordenadas",
    "cnpjRespEstoqueCarga",
    "codigoRA",
    "veiculoAereo",
    "veiculoAquaviario",
    "outroModal",
    "conhecimentosCarga",
    "transporteProprio",
    "observacoes"
})
@Builder(builderMethodName = "manifestacaoExportacaoBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ManifestacaoExportacao {

    @XmlElement(required = true)
    protected String identificacaoManifestacao;
    @XmlElement(required = true)
    protected String tipoDocumentoTransporte;
    @XmlElement(required = true)
    protected String indCargaEnviadaDespacho;
    @XmlElement(required = true)
    protected String cargaJaEmbarcada;
    protected String cnpjTransportador;
    protected String cpfTransportador;
    protected String codigoURF;
    protected Coordenadas coordenadas;
    protected String cnpjRespEstoqueCarga;
    protected String codigoRA;
    protected ManifestacaoExportacao.VeiculoAereo veiculoAereo;
    protected ManifestacaoExportacao.VeiculoAquaviario veiculoAquaviario;
    protected ManifestacaoExportacao.OutroModal outroModal;
    protected ManifestacaoExportacao.ConhecimentosCarga conhecimentosCarga;
    protected ManifestacaoExportacao.TransporteProprio transporteProprio;
    protected String observacoes;


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}Conhecimento" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conhecimento"
    })
    @Builder(builderMethodName = "conhecimentosCargaBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class ConhecimentosCarga {

        @XmlElement(required = true)
        protected List<Conhecimento> conhecimento;

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioOutroVeiculo"/&gt;
     *         &lt;element name="identificacaoVeiculo" type="{http://www.pucomex.serpro.gov.br/cct}IdentificacaoVeiculo"/&gt;
     *         &lt;element name="numeroDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDocumentoTransporte"/&gt;
     *         &lt;element name="dataEmissaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoTipoModal",
        "identificacaoVeiculo",
        "numeroDocumentoTransporte",
        "dataEmissaoDocumentoTransporte"
    })
    @Builder(builderMethodName = "outroModalBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class OutroModal {

        @XmlElement(required = true)
        protected String codigoTipoModal;
        @XmlElement(required = true)
        protected String identificacaoVeiculo;
        @XmlElement(required = true)
        protected String numeroDocumentoTransporte;
        @XmlElement(required = true)
        protected String dataEmissaoDocumentoTransporte;

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dadosCarga"
    })
    @Builder(builderMethodName = "transporteProprioBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class TransporteProprio {

        @XmlElement(required = true)
        protected List<DadosCarga> dadosCarga;

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAereo"/&gt;
     *         &lt;element name="prefixoAeronave" type="{http://www.pucomex.serpro.gov.br/cct}PrefixoAeronave"/&gt;
     *         &lt;element name="numeroVoo" type="{http://www.pucomex.serpro.gov.br/cct}NumeroVoo"/&gt;
     *         &lt;element name="dataPartidaProcedencia" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoTipoModal",
        "prefixoAeronave",
        "numeroVoo",
        "dataPartidaProcedencia"
    })
    @Builder(builderMethodName = "veiculoAereoBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class VeiculoAereo {

        @XmlElement(required = true)
        protected String codigoTipoModal;
        @XmlElement(required = true)
        protected String prefixoAeronave;
        @XmlElement(required = true)
        protected BigInteger numeroVoo;
        @XmlElement(required = true)
        protected String dataPartidaProcedencia;

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAquaViario"/&gt;
     *         &lt;element name="codigoIMO" type="{http://www.pucomex.serpro.gov.br/cct}CodigoIMO"/&gt;
     *         &lt;element name="numeroEscala" type="{http://www.pucomex.serpro.gov.br/cct}NumeroEscala"/&gt;
     *         &lt;element name="dataEncerramentoManifesto" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoTipoModal",
        "codigoIMO",
        "numeroEscala",
        "dataEncerramentoManifesto"
    })
    @Builder(builderMethodName = "veiculoAquaviarioBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class VeiculoAquaviario {

        @XmlElement(required = true)
        protected String codigoTipoModal;
        @XmlElement(required = true)
        protected String codigoIMO;
        @XmlElement(required = true)
        protected String numeroEscala;
        @XmlElement(required = true)
        protected String dataEncerramentoManifesto;

    }

}
