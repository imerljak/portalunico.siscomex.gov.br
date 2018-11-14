//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de TDocumentoCargaUnitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaUnitizacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/&gt;
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}cargaSoltaVeiculo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}granel" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentoCargaUnitizacao", propOrder = {
    "numeroDUE",
    "numeroRUC",
    "cargaSoltaVeiculo",
    "granel"
})
@Builder(builderMethodName = "tDocumentoCargaUnitizacaoBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TDocumentoCargaUnitizacao {

    protected String numeroDUE;
    protected String numeroRUC;
    protected CargaSoltaVeiculo cargaSoltaVeiculo;
    protected Granel granel;

}
