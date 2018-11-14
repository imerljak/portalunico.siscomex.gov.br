//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TradeTermsConditionCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTermsConditionCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="C+F"/&gt;
 *     &lt;enumeration value="C+I"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="OCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeTermsConditionCodeType")
@XmlEnum
public enum TradeTermsConditionCodeType {

    @XmlEnumValue("C+F")
    C_F("C+F"),
    @XmlEnumValue("C+I")
    C_I("C+I"),
    CFR("CFR"),
    CIF("CIF"),
    CIP("CIP"),
    CPT("CPT"),
    DAP("DAP"),
    DAT("DAT"),
    DDP("DDP"),
    EXW("EXW"),
    FAS("FAS"),
    FCA("FCA"),
    FOB("FOB"),
    OCV("OCV");
    private final String value;

    TradeTermsConditionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradeTermsConditionCodeType fromValue(String v) {
        for (TradeTermsConditionCodeType c: TradeTermsConditionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
