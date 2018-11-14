//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package br.gov.serpro.pucomex.cct;

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
 * <p>Classe Java de NotaFiscalFormulario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotaFiscalFormulario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroNF" type="{http://www.pucomex.serpro.gov.br/cct}NumeroNF"/&gt;
 *         &lt;element name="serieNF" type="{http://www.pucomex.serpro.gov.br/cct}SerieNF"/&gt;
 *         &lt;element name="modeloNF"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="01|04"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AAMM"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;whiteSpace value="preserve"/&gt;
 *               &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ufEmissor" type="{http://www.pucomex.serpro.gov.br/cct}UF"/&gt;
 *         &lt;element name="dataEmissao" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
 *         &lt;element name="identificacaoEmissor" type="{http://www.pucomex.serpro.gov.br/cct}IdentificacaoEmissor"/&gt;
 *         &lt;element name="destinatario" type="{http://www.pucomex.serpro.gov.br/cct}Destinatario"/&gt;
 *         &lt;element name="conteineres" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}TConteiner" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="itensNFF"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itemNFF" type="{http://www.pucomex.serpro.gov.br/cct}ItemNFF" maxOccurs="999"/&gt;
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
@XmlType(name = "NotaFiscalFormulario", propOrder = {
    "numeroNF",
    "serieNF",
    "modeloNF",
    "aamm",
    "ufEmissor",
    "dataEmissao",
    "identificacaoEmissor",
    "destinatario",
    "conteineres",
    "itensNFF"
})
@Builder(builderMethodName = "notaFiscalFormularioBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotaFiscalFormulario {

    @XmlElement(required = true)
    protected String numeroNF;
    @XmlElement(required = true)
    protected String serieNF;
    @XmlElement(required = true)
    protected String modeloNF;
    @XmlElement(name = "AAMM", required = true)
    protected String aamm;
    @XmlElement(required = true)
    protected String ufEmissor;
    @XmlElement(required = true)
    protected String dataEmissao;
    @XmlElement(required = true)
    protected IdentificacaoEmissor identificacaoEmissor;
    @XmlElement(required = true)
    protected Destinatario destinatario;
    protected NotaFiscalFormulario.Conteineres conteineres;
    @XmlElement(required = true)
    protected NotaFiscalFormulario.ItensNFF itensNFF;


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
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}TConteiner" maxOccurs="unbounded"/&gt;
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
        "conteiner"
    })
    @Builder(builderMethodName = "conteineresBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Conteineres {

        @XmlElement(required = true)
        protected List<TConteiner> conteiner;

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
     *         &lt;element name="itemNFF" type="{http://www.pucomex.serpro.gov.br/cct}ItemNFF" maxOccurs="999"/&gt;
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
        "itemNFF"
    })
    @Builder(builderMethodName = "itensNFFBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class ItensNFF {

        @XmlElement(required = true)
        protected List<ItemNFF> itemNFF;

    }

}
