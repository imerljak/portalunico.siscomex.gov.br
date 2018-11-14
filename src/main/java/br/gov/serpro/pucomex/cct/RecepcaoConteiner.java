//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
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
 * <p>Classe Java de RecepcaoConteiner complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecepcaoConteiner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/&gt;
 *         &lt;element name="cnpjResp" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocal"/&gt;
 *         &lt;element name="referenciaLocalRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}entregador"/&gt;
 *         &lt;element name="conteineres"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localArmazenamento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element name="codigoIdentCarga" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="transitoSimplificado" type="{http://www.pucomex.serpro.gov.br/cct}TransitoSimplificadoRecepcao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoConteiner", propOrder = {
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
@Builder(builderMethodName = "recepcaoConteinerBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecepcaoConteiner {

    @XmlElement(required = true)
    protected String identificacaoRecepcao;
    @XmlElement(required = true)
    protected String cnpjResp;
    @XmlElement(required = true)
    protected TLocal local;
    protected String referenciaLocalRecepcao;
    @XmlElement(required = true)
    protected Entregador entregador;
    @XmlElement(required = true)
    protected RecepcaoConteiner.Conteineres conteineres;
    protected String localArmazenamento;
    protected String codigoIdentCarga;
    protected String avariasIdentificadas;
    protected String divergenciasIdentificadas;
    protected String observacoesGerais;
    protected TransitoSimplificadoRecepcao transitoSimplificado;


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
     *         &lt;element name="conteiner" type="{http://www.pucomex.serpro.gov.br/cct}ConteinerExtend" maxOccurs="50"/&gt;
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
        protected List<ConteinerExtend> conteiner;

    }

}
