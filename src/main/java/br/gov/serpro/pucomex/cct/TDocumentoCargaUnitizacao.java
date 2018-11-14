
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDocumentoCargaUnitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaUnitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/>
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/>
 *         &lt;/choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}cargaSoltaVeiculo" minOccurs="0"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}granel" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentoCargaUnitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroDUE",
    "numeroRUC",
    "cargaSoltaVeiculo",
    "granel"
})
public class TDocumentoCargaUnitizacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroDUE;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroRUC;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected CargaSoltaVeiculo cargaSoltaVeiculo;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Granel granel;

    /**
     * Obt�m o valor da propriedade numeroDUE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDUE() {
        return numeroDUE;
    }

    /**
     * Define o valor da propriedade numeroDUE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDUE(String value) {
        this.numeroDUE = value;
    }

    /**
     * Obt�m o valor da propriedade numeroRUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRUC() {
        return numeroRUC;
    }

    /**
     * Define o valor da propriedade numeroRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRUC(String value) {
        this.numeroRUC = value;
    }

    /**
     * Obt�m o valor da propriedade cargaSoltaVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link CargaSoltaVeiculo }
     *     
     */
    public CargaSoltaVeiculo getCargaSoltaVeiculo() {
        return cargaSoltaVeiculo;
    }

    /**
     * Define o valor da propriedade cargaSoltaVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link CargaSoltaVeiculo }
     *     
     */
    public void setCargaSoltaVeiculo(CargaSoltaVeiculo value) {
        this.cargaSoltaVeiculo = value;
    }

    /**
     * Obt�m o valor da propriedade granel.
     * 
     * @return
     *     possible object is
     *     {@link Granel }
     *     
     */
    public Granel getGranel() {
        return granel;
    }

    /**
     * Define o valor da propriedade granel.
     * 
     * @param value
     *     allowed object is
     *     {@link Granel }
     *     
     */
    public void setGranel(Granel value) {
        this.granel = value;
    }

}
