
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EntregaDocumentoCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntregaDocumentoCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoEntrega" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="identificacaoPessoaJuridica" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}recebedor"/>
 *         &lt;choice>
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/>
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
@XmlType(name = "EntregaDocumentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoEntrega",
    "identificacaoPessoaJuridica",
    "local",
    "documentos",
    "recebedor",
    "pesoAferido",
    "motivoNaoPesagem"
})
public class EntregaDocumentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoEntrega;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoPessoaJuridica;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Local local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Documentos documentos;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Recebedor recebedor;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigDecimal pesoAferido;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String motivoNaoPesagem;

    /**
     * Obt�m o valor da propriedade identificacaoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoEntrega() {
        return identificacaoEntrega;
    }

    /**
     * Define o valor da propriedade identificacaoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoEntrega(String value) {
        this.identificacaoEntrega = value;
    }

    /**
     * Obt�m o valor da propriedade identificacaoPessoaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoPessoaJuridica() {
        return identificacaoPessoaJuridica;
    }

    /**
     * Define o valor da propriedade identificacaoPessoaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoPessoaJuridica(String value) {
        this.identificacaoPessoaJuridica = value;
    }

    /**
     * Obt�m o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link Local }
     *     
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link Local }
     *     
     */
    public void setLocal(Local value) {
        this.local = value;
    }

    /**
     * Obt�m o valor da propriedade documentos.
     * 
     * @return
     *     possible object is
     *     {@link Documentos }
     *     
     */
    public Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Define o valor da propriedade documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
    }

    /**
     * Obt�m o valor da propriedade recebedor.
     * 
     * @return
     *     possible object is
     *     {@link Recebedor }
     *     
     */
    public Recebedor getRecebedor() {
        return recebedor;
    }

    /**
     * Define o valor da propriedade recebedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Recebedor }
     *     
     */
    public void setRecebedor(Recebedor value) {
        this.recebedor = value;
    }

    /**
     * Obt�m o valor da propriedade pesoAferido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    /**
     * Define o valor da propriedade pesoAferido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoAferido(BigDecimal value) {
        this.pesoAferido = value;
    }

    /**
     * Obt�m o valor da propriedade motivoNaoPesagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    /**
     * Define o valor da propriedade motivoNaoPesagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNaoPesagem(String value) {
        this.motivoNaoPesagem = value;
    }

}
