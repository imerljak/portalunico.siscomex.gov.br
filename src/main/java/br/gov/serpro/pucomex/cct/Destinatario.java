//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de Destinatario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Destinatario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="cpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/&gt;
 *         &lt;element name="identificacaoEstrangeiro"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/&gt;
 *                   &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destinatario", propOrder = {
    "cnpj",
    "cpf",
    "identificacaoEstrangeiro"
})
@Builder(builderMethodName = "destinatarioBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Destinatario {

    protected String cnpj;
    protected String cpf;
    protected Destinatario.IdentificacaoEstrangeiro identificacaoEstrangeiro;


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
     *         &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/&gt;
     *         &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/&gt;
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
        "pais",
        "nome"
    })
    @Builder(builderMethodName = "identificacaoEstrangeiroBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class IdentificacaoEstrangeiro {

        @XmlElement(required = true)
        protected String pais;
        @XmlElement(required = true)
        protected String nome;

    }

}
