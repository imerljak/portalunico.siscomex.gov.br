
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDocumentoCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/>
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}cargaSoltaVeiculo"/>
 *             &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}granel" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}granel"/>
 *           &lt;/sequence>
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
@XmlType(name = "TDocumentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "content"
})
public class TDocumentoCarga {

    @XmlElementRefs({
        @XmlElementRef(name = "cargaSoltaVeiculo", namespace = "http://www.pucomex.serpro.gov.br/cct", type = CargaSoltaVeiculo.class, required = false),
        @XmlElementRef(name = "numeroDUE", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numeroRUC", namespace = "http://www.pucomex.serpro.gov.br/cct", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "granel", namespace = "http://www.pucomex.serpro.gov.br/cct", type = Granel.class, required = false)
    })
    protected List<Object> content;

    /**
     * Obt�m o restante do modelo do conte�do. 
     * 
     * <p>
     * Voc� est� obtendo esta propriedade "catch-all" pelo seguinte motivo: 
     * O nome do campo "Granel" � usado por duas partes diferentes de um esquema. Consulte: 
     * linha 37 de file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd/reuso/DocumentoCarga.xsd
     * linha 34 de file:/D:/pontocob/workspace/java/portalunico.siscomex.gov.br/schemas/xsd/xsd/reuso/DocumentoCarga.xsd
     * <p>
     * Para eliminar esta propriedade, aplique uma personaliza��o de propriedade a uma 
     * das seguintes declara��es, a fim de alterar seus nomes: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargaSoltaVeiculo }
     * {@link Granel }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
