//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdditionalDocumentCategoryCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDocumentCategoryCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="DSG"/&gt;
 *     &lt;enumeration value="DSI"/&gt;
 *     &lt;enumeration value="DSIG"/&gt;
 *     &lt;enumeration value="LPCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDocumentCategoryCodeType")
@XmlEnum
public enum AdditionalDocumentCategoryCodeType {


    /**
     * Drawback Suspensão Comum
     * 
     */
    AC,

    /**
     * Drawback Suspensão Genérico
     * 
     */
    DSG,

    /**
     * Drawback Suspensão Intermediário
     * 
     */
    DSI,

    /**
     * Drawback Suspensão Intermediário genérico
     * 
     */
    DSIG,

    /**
     * LPCO
     * 
     */
    LPCO;

    public String value() {
        return name();
    }

    public static AdditionalDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
