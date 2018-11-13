
package br.gov.serpro.pucomex.cct;

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
 *         &lt;element name="entregaDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}EntregaDocumentoTransporte"/>
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
    "entregaDocumentoTransporte"
})
@XmlRootElement(name = "entregasDocumentoTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class EntregasDocumentoTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaDocumentoTransporte entregaDocumentoTransporte;

    /**
     * Obt�m o valor da propriedade entregaDocumentoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link EntregaDocumentoTransporte }
     *     
     */
    public EntregaDocumentoTransporte getEntregaDocumentoTransporte() {
        return entregaDocumentoTransporte;
    }

    /**
     * Define o valor da propriedade entregaDocumentoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaDocumentoTransporte }
     *     
     */
    public void setEntregaDocumentoTransporte(EntregaDocumentoTransporte value) {
        this.entregaDocumentoTransporte = value;
    }

}
