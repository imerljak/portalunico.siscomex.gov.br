
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operacaoConsolidacao" type="{http://www.pucomex.serpro.gov.br/cct}OperacaoConsolidacao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operacaoConsolidacao"
})
@XmlRootElement(name = "operacoesConsolidacao", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class OperacoesConsolidacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected OperacaoConsolidacao operacaoConsolidacao;

    /**
     * Obt�m o valor da propriedade operacaoConsolidacao.
     * 
     * @return
     *     possible object is
     *     {@link OperacaoConsolidacao }
     *     
     */
    public OperacaoConsolidacao getOperacaoConsolidacao() {
        return operacaoConsolidacao;
    }

    /**
     * Define o valor da propriedade operacaoConsolidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacaoConsolidacao }
     *     
     */
    public void setOperacaoConsolidacao(OperacaoConsolidacao value) {
        this.operacaoConsolidacao = value;
    }

}
