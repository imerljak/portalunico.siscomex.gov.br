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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de TDocumentoCargaManifestacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaManifestacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/&gt;
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="cargaSoltaVeiculo"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}TCargaSoltaVeiculoPesoBrutoExtend" maxOccurs="unbounded"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="granel" type="{http://www.pucomex.serpro.gov.br/cct}TGranelManifestacao" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="granel" type="{http://www.pucomex.serpro.gov.br/cct}TGranelManifestacao"/&gt;
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
@XmlType(name = "TDocumentoCargaManifestacao", propOrder = {
    "content"
})
@Builder(builderMethodName = "tDocumentoCargaManifestacaoBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TDocumentoCargaManifestacao {

    @XmlElementRefs({
        @XmlElementRef(name = "numeroDUE", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numeroRUC", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cargaSoltaVeiculo", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "granel", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;


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
     *         &lt;element name="carga" type="{http://www.pucomex.serpro.gov.br/cct}TCargaSoltaVeiculoPesoBrutoExtend" maxOccurs="unbounded"/&gt;
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
        "carga"
    })
    @Builder(builderMethodName = "cargaSoltaVeiculoBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class CargaSoltaVeiculo {

        @XmlElement(required = true)
        protected List<TCargaSoltaVeiculoPesoBrutoExtend> carga;

    }

}
