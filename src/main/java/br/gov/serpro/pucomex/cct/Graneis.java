
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="granel" type="{http://www.pucomex.serpro.gov.br/cct}TGranel" maxOccurs="unbounded"/>
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
    "granel"
})
@XmlRootElement(name = "graneis", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class Graneis {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected List<TGranel> granel;

    /**
     * Gets the value of the granel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the granel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGranel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGranel }
     * 
     * 
     */
    public List<TGranel> getGranel() {
        if (granel == null) {
            granel = new ArrayList<TGranel>();
        }
        return this.granel;
    }

}
