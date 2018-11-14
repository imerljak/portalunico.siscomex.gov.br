//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
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
 * <p>Classe Java de TransitoSimplificadoEntrega complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransitoSimplificadoEntrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="codigoURFDestino" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/&gt;
 *             &lt;element name="cnpjRespDestino" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="codigoRADestino" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="veiculoFerroviario"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="prefixoTrem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/&gt;
 *                     &lt;element name="quantidadeVagoes" type="{http://www.pucomex.serpro.gov.br/cct}QuantidadeVagoes"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="veiculoRodoviario"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;choice&gt;
 *                       &lt;element name="cpfCondutor" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/&gt;
 *                       &lt;sequence&gt;
 *                         &lt;element name="documentoCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/&gt;
 *                         &lt;element name="nomeCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/choice&gt;
 *                     &lt;element name="veiculos"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}TVeiculoTransitoSimplificado" maxOccurs="4"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitoSimplificadoEntrega", propOrder = {
    "codigoURFDestino",
    "cnpjRespDestino",
    "codigoRADestino",
    "veiculoFerroviario",
    "veiculoRodoviario"
})
@Builder(builderMethodName = "transitoSimplificadoEntregaBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransitoSimplificadoEntrega {

    protected String codigoURFDestino;
    protected String cnpjRespDestino;
    protected String codigoRADestino;
    protected TransitoSimplificadoEntrega.VeiculoFerroviario veiculoFerroviario;
    protected TransitoSimplificadoEntrega.VeiculoRodoviario veiculoRodoviario;


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
     *         &lt;element name="prefixoTrem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/&gt;
     *         &lt;element name="quantidadeVagoes" type="{http://www.pucomex.serpro.gov.br/cct}QuantidadeVagoes"/&gt;
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
        "prefixoTrem",
        "quantidadeVagoes"
    })
    @Builder(builderMethodName = "veiculoFerroviarioBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class VeiculoFerroviario {

        @XmlElement(required = true)
        protected String prefixoTrem;
        @XmlElement(required = true)
        protected BigInteger quantidadeVagoes;

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
     *         &lt;choice&gt;
     *           &lt;element name="cpfCondutor" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/&gt;
     *           &lt;sequence&gt;
     *             &lt;element name="documentoCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/&gt;
     *             &lt;element name="nomeCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/&gt;
     *           &lt;/sequence&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="veiculos"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}TVeiculoTransitoSimplificado" maxOccurs="4"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "cpfCondutor",
        "documentoCondutorEstrangeiro",
        "nomeCondutorEstrangeiro",
        "veiculos"
    })
    @Builder(builderMethodName = "veiculoRodoviarioBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class VeiculoRodoviario {

        protected String cpfCondutor;
        protected String documentoCondutorEstrangeiro;
        protected String nomeCondutorEstrangeiro;
        @XmlElement(required = true)
        protected TransitoSimplificadoEntrega.VeiculoRodoviario.Veiculos veiculos;


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
         *         &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}TVeiculoTransitoSimplificado" maxOccurs="4"/&gt;
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
            "veiculo"
        })
        @Builder(builderMethodName = "veiculosBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Veiculos {

            @XmlElement(required = true)
            protected List<TVeiculoTransitoSimplificado> veiculo;

        }

    }

}
