//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de TConteiner complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConteiner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroConteiner" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConteiner"/&gt;
 *         &lt;element name="tara" type="{http://www.pucomex.serpro.gov.br/cct}Dec_6v3"/&gt;
 *         &lt;element name="lacres" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="lacre" type="{http://www.pucomex.serpro.gov.br/cct}Lacre" maxOccurs="4"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConteiner", propOrder = {
    "numeroConteiner",
    "tara",
    "lacres"
})
@XmlSeeAlso({
    ConteinerPesoBrutoExtend.class,
    ConteinerExtend.class
})
@Builder(builderMethodName = "tConteinerBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TConteiner {

    @XmlElement(required = true)
    protected String numeroConteiner;
    @XmlElement(required = true)
    protected BigDecimal tara;
    protected TConteiner.Lacres lacres;


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
     *         &lt;element name="lacre" type="{http://www.pucomex.serpro.gov.br/cct}Lacre" maxOccurs="4"/&gt;
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
        "lacre"
    })
    @Builder(builderMethodName = "lacresBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Lacres {

        @XmlElement(required = true)
        protected List<String> lacre;

    }

}
