
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ClassificationIdentificationTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassificationIdentificationTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassificationIdentificationTypeCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum ClassificationIdentificationTypeCodeType {

    HS;

    public String value() {
        return name();
    }

    public static ClassificationIdentificationTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
