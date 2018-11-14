
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TConhecimentoCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConhecimentoCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConhecimento"/>
 *         &lt;element name="dataEmissaoConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *         &lt;element name="codigoMoedaSwift" type="{http://www.pucomex.serpro.gov.br/cct}MoedaSwift" minOccurs="0"/>
 *         &lt;element name="formaPagamentoFrete" type="{http://www.pucomex.serpro.gov.br/cct}TipoFrete" minOccurs="0"/>
 *         &lt;element name="valorFrete" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/>
 *         &lt;element name="paisDestino" type="{http://www.pucomex.serpro.gov.br/cct}Pais" minOccurs="0"/>
 *         &lt;element name="consignadoAOrdem" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="nomeConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60" minOccurs="0"/>
 *         &lt;element name="enderecoConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConhecimentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroConhecimento",
    "dataEmissaoConhecimento",
    "codigoMoedaSwift",
    "formaPagamentoFrete",
    "valorFrete",
    "paisDestino",
    "consignadoAOrdem",
    "nomeConsignatario",
    "enderecoConsignatario"
})
public class TConhecimentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroConhecimento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dataEmissaoConhecimento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoMoedaSwift;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String formaPagamentoFrete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal valorFrete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String paisDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String consignadoAOrdem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nomeConsignatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String enderecoConsignatario;

    /**
     * Obt�m o valor da propriedade numeroConhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    /**
     * Define o valor da propriedade numeroConhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConhecimento(String value) {
        this.numeroConhecimento = value;
    }

    /**
     * Obt�m o valor da propriedade dataEmissaoConhecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoConhecimento() {
        return dataEmissaoConhecimento;
    }

    /**
     * Define o valor da propriedade dataEmissaoConhecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoConhecimento(String value) {
        this.dataEmissaoConhecimento = value;
    }

    /**
     * Obt�m o valor da propriedade codigoMoedaSwift.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoedaSwift() {
        return codigoMoedaSwift;
    }

    /**
     * Define o valor da propriedade codigoMoedaSwift.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoedaSwift(String value) {
        this.codigoMoedaSwift = value;
    }

    /**
     * Obt�m o valor da propriedade formaPagamentoFrete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagamentoFrete() {
        return formaPagamentoFrete;
    }

    /**
     * Define o valor da propriedade formaPagamentoFrete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagamentoFrete(String value) {
        this.formaPagamentoFrete = value;
    }

    /**
     * Obt�m o valor da propriedade valorFrete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    /**
     * Define o valor da propriedade valorFrete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFrete(BigDecimal value) {
        this.valorFrete = value;
    }

    /**
     * Obt�m o valor da propriedade paisDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Define o valor da propriedade paisDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

    /**
     * Obt�m o valor da propriedade consignadoAOrdem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignadoAOrdem() {
        return consignadoAOrdem;
    }

    /**
     * Define o valor da propriedade consignadoAOrdem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignadoAOrdem(String value) {
        this.consignadoAOrdem = value;
    }

    /**
     * Obt�m o valor da propriedade nomeConsignatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    /**
     * Define o valor da propriedade nomeConsignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsignatario(String value) {
        this.nomeConsignatario = value;
    }

    /**
     * Obt�m o valor da propriedade enderecoConsignatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoConsignatario() {
        return enderecoConsignatario;
    }

    /**
     * Define o valor da propriedade enderecoConsignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoConsignatario(String value) {
        this.enderecoConsignatario = value;
    }

}
