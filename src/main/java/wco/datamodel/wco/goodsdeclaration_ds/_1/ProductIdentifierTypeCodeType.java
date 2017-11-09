
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProductIdentifierTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductIdentifierTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="VN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductIdentifierTypeCodeType")
@XmlEnum
public enum ProductIdentifierTypeCodeType {


    /**
     * Vendor Number --> C�digo do Produto
     * 
     */
    VN;

    public String value() {
        return name();
    }

    public static ProductIdentifierTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
