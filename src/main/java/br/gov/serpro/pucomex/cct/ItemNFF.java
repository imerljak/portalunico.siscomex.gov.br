//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de ItemNFF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemNFF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroItem"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{1,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="codigoProduto"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ncm" type="{http://www.pucomex.serpro.gov.br/cct}NCM"/&gt;
 *         &lt;element name="descricaoProduto"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="120"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cfop" type="{http://www.pucomex.serpro.gov.br/cct}CFOP"/&gt;
 *         &lt;element name="valorTotal" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/&gt;
 *         &lt;element name="quantidadeMedidaEstatistica" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1104v"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNFF", propOrder = {
    "numeroItem",
    "codigoProduto",
    "ncm",
    "descricaoProduto",
    "cfop",
    "valorTotal",
    "quantidadeMedidaEstatistica"
})
@Builder(builderMethodName = "itemNFFBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemNFF {

    @XmlElement(required = true)
    protected String numeroItem;
    @XmlElement(required = true)
    protected String codigoProduto;
    @XmlElement(required = true)
    protected String ncm;
    @XmlElement(required = true)
    protected String descricaoProduto;
    @XmlElement(required = true)
    protected String cfop;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    @XmlElement(required = true)
    protected String quantidadeMedidaEstatistica;

}
