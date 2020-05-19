package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transportador de nacionalidade brasileira e tipo de transporte ocasional
 *
 * <p>Classe Java de TransportadorMicBrasileiroOcasionalDTO complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TransportadorMicBrasileiroOcasionalDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacaoOcasional" type="{http://www.pucomex.serpro.gov.br/cct}AutorizacaoOcasional"/>
 *         &lt;element name="dataVencimentoAutorizacao" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="numeroCpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF" minOccurs="0"/>
 *           &lt;element name="numeroCnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorMicBrasileiroOcasionalDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
        "autorizacaoOcasional",
        "dataVencimentoAutorizacao",
        "numeroCpf",
        "numeroCnpj"
})
public class TransportadorMicBrasileiroOcasionalDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String autorizacaoOcasional;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String dataVencimentoAutorizacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroCpf;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroCnpj;

    /**
     * Obtém o valor da propriedade autorizacaoOcasional.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAutorizacaoOcasional() {
        return autorizacaoOcasional;
    }

    /**
     * Define o valor da propriedade autorizacaoOcasional.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAutorizacaoOcasional(String value) {
        this.autorizacaoOcasional = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimentoAutorizacao.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataVencimentoAutorizacao() {
        return dataVencimentoAutorizacao;
    }

    /**
     * Define o valor da propriedade dataVencimentoAutorizacao.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataVencimentoAutorizacao(String value) {
        this.dataVencimentoAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroCpf.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCpf() {
        return numeroCpf;
    }

    /**
     * Define o valor da propriedade numeroCpf.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCpf(String value) {
        this.numeroCpf = value;
    }

    /**
     * Obtém o valor da propriedade numeroCnpj.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCnpj() {
        return numeroCnpj;
    }

    /**
     * Define o valor da propriedade numeroCnpj.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCnpj(String value) {
        this.numeroCnpj = value;
    }

}