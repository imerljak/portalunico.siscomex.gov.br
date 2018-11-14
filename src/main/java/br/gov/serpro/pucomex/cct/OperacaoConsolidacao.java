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
 * <p>Classe Java de OperacaoConsolidacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperacaoConsolidacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoConsolidacao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/&gt;
 *         &lt;element name="numeroMRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroMRUC" minOccurs="0"/&gt;
 *         &lt;element name="tipoDeCarga" type="{http://www.pucomex.serpro.gov.br/cct}TipoCargaConsolidar"/&gt;
 *         &lt;element name="cnpjConsolidador" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="acondicionamento" type="{http://www.pucomex.serpro.gov.br/cct}Acondicionamento"/&gt;
 *         &lt;element name="documentosConsolidacao"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="documento" type="{http://www.pucomex.serpro.gov.br/cct}TDocumentoCargaConsolidacao" maxOccurs="unbounded" minOccurs="2"/&gt;
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
@XmlType(name = "OperacaoConsolidacao", propOrder = {
    "identificacaoConsolidacao",
    "numeroMRUC",
    "tipoDeCarga",
    "cnpjConsolidador",
    "acondicionamento",
    "documentosConsolidacao"
})
@Builder(builderMethodName = "operacaoConsolidacaoBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperacaoConsolidacao {

    @XmlElement(required = true)
    protected String identificacaoConsolidacao;
    protected String numeroMRUC;
    @XmlElement(required = true)
    protected BigInteger tipoDeCarga;
    @XmlElement(required = true)
    protected String cnpjConsolidador;
    @XmlElement(required = true)
    protected Acondicionamento acondicionamento;
    @XmlElement(required = true)
    protected OperacaoConsolidacao.DocumentosConsolidacao documentosConsolidacao;


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
     *         &lt;element name="documento" type="{http://www.pucomex.serpro.gov.br/cct}TDocumentoCargaConsolidacao" maxOccurs="unbounded" minOccurs="2"/&gt;
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
        "documento"
    })
    @Builder(builderMethodName = "documentosConsolidacaoBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DocumentosConsolidacao {

        @XmlElement(required = true)
        protected List<TDocumentoCargaConsolidacao> documento;

    }

}
