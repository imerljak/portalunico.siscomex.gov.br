
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RecepcaoConteiner complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecepcaoConteiner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="cnpjResp" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocal"/>
 *         &lt;element name="referenciaLocalRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}entregador"/>
 *         &lt;element name="conteineres">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localArmazenamento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element name="codigoIdentCarga" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="transitoSimplificado" type="{http://www.pucomex.serpro.gov.br/cct}TransitoSimplificadoRecepcao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoConteiner", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoRecepcao",
    "cnpjResp",
    "local",
    "referenciaLocalRecepcao",
    "entregador",
    "conteineres",
    "localArmazenamento",
    "codigoIdentCarga",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais",
    "transitoSimplificado"
})
public class RecepcaoConteiner {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoRecepcao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String cnpjResp;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TLocal local;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String referenciaLocalRecepcao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Entregador entregador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoConteiner.Conteineres conteineres;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String localArmazenamento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoIdentCarga;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String avariasIdentificadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String divergenciasIdentificadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String observacoesGerais;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransitoSimplificadoRecepcao transitoSimplificado;

    /**
     * Obt�m o valor da propriedade identificacaoRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoRecepcao() {
        return identificacaoRecepcao;
    }

    /**
     * Define o valor da propriedade identificacaoRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoRecepcao(String value) {
        this.identificacaoRecepcao = value;
    }

    /**
     * Obt�m o valor da propriedade cnpjResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjResp() {
        return cnpjResp;
    }

    /**
     * Define o valor da propriedade cnpjResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjResp(String value) {
        this.cnpjResp = value;
    }

    /**
     * Obt�m o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link TLocal }
     *     
     */
    public TLocal getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link TLocal }
     *     
     */
    public void setLocal(TLocal value) {
        this.local = value;
    }

    /**
     * Obt�m o valor da propriedade referenciaLocalRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaLocalRecepcao() {
        return referenciaLocalRecepcao;
    }

    /**
     * Define o valor da propriedade referenciaLocalRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaLocalRecepcao(String value) {
        this.referenciaLocalRecepcao = value;
    }

    /**
     * Obt�m o valor da propriedade entregador.
     * 
     * @return
     *     possible object is
     *     {@link Entregador }
     *     
     */
    public Entregador getEntregador() {
        return entregador;
    }

    /**
     * Define o valor da propriedade entregador.
     * 
     * @param value
     *     allowed object is
     *     {@link Entregador }
     *     
     */
    public void setEntregador(Entregador value) {
        this.entregador = value;
    }

    /**
     * Obt�m o valor da propriedade conteineres.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoConteiner.Conteineres }
     *     
     */
    public RecepcaoConteiner.Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Define o valor da propriedade conteineres.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoConteiner.Conteineres }
     *     
     */
    public void setConteineres(RecepcaoConteiner.Conteineres value) {
        this.conteineres = value;
    }

    /**
     * Obt�m o valor da propriedade localArmazenamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    /**
     * Define o valor da propriedade localArmazenamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalArmazenamento(String value) {
        this.localArmazenamento = value;
    }

    /**
     * Obt�m o valor da propriedade codigoIdentCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdentCarga() {
        return codigoIdentCarga;
    }

    /**
     * Define o valor da propriedade codigoIdentCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdentCarga(String value) {
        this.codigoIdentCarga = value;
    }

    /**
     * Obt�m o valor da propriedade avariasIdentificadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvariasIdentificadas() {
        return avariasIdentificadas;
    }

    /**
     * Define o valor da propriedade avariasIdentificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvariasIdentificadas(String value) {
        this.avariasIdentificadas = value;
    }

    /**
     * Obt�m o valor da propriedade divergenciasIdentificadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivergenciasIdentificadas() {
        return divergenciasIdentificadas;
    }

    /**
     * Define o valor da propriedade divergenciasIdentificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivergenciasIdentificadas(String value) {
        this.divergenciasIdentificadas = value;
    }

    /**
     * Obt�m o valor da propriedade observacoesGerais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Define o valor da propriedade observacoesGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
    }

    /**
     * Obt�m o valor da propriedade transitoSimplificado.
     * 
     * @return
     *     possible object is
     *     {@link TransitoSimplificadoRecepcao }
     *     
     */
    public TransitoSimplificadoRecepcao getTransitoSimplificado() {
        return transitoSimplificado;
    }

    /**
     * Define o valor da propriedade transitoSimplificado.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitoSimplificadoRecepcao }
     *     
     */
    public void setTransitoSimplificado(TransitoSimplificadoRecepcao value) {
        this.transitoSimplificado = value;
    }


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
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/>
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
        "conteiner"
    })
    public static class Conteineres {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<ConteinerExtend> conteiner;

        /**
         * Gets the value of the conteiner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conteiner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConteiner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConteinerExtend }
         * 
         * 
         */
        public List<ConteinerExtend> getConteiner() {
            if (conteiner == null) {
                conteiner = new ArrayList<ConteinerExtend>();
            }
            return this.conteiner;
        }

    }

}
