//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de TGranel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TGranel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoGranel" type="{http://www.pucomex.serpro.gov.br/cct}TipoGranel"/&gt;
 *         &lt;element name="unidademedida" type="{http://www.pucomex.serpro.gov.br/cct}UnidadeMedida"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="total" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/&gt;
 *             &lt;element name="quantidade" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="quantidade" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGranel", propOrder = {
    "content"
})
@XmlSeeAlso({
    TGranelPesoBrutoExtend.class
})
@Builder(builderMethodName = "tGranelBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TGranel {

    @XmlElementRefs({
        @XmlElementRef(name = "tipoGranel", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unidademedida", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "total", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quantidade", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

}
