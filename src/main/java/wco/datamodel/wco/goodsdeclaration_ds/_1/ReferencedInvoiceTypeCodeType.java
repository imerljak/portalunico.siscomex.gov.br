//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReferencedInvoiceTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferencedInvoiceTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="REM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReferencedInvoiceTypeCodeType")
@XmlEnum
public enum ReferencedInvoiceTypeCodeType {


    /**
     * Nota Fiscal Complementar
     * 
     */
    COM,

    /**
     * Nota Fiscal de Remessa
     * 
     */
    REM;

    public String value() {
        return name();
    }

    public static ReferencedInvoiceTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
