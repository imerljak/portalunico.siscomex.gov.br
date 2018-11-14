
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdditionalDocumentCategoryCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalDocumentCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DSG"/>
 *     &lt;enumeration value="DBSI"/>
 *     &lt;enumeration value="DSIG"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="DSEG"/>
 *     &lt;enumeration value="DSMC"/>
 *     &lt;enumeration value="DSMG"/>
 *     &lt;enumeration value="DBI"/>
 *     &lt;enumeration value="DBII"/>
 *     &lt;enumeration value="LPCO"/>
 *     &lt;enumeration value="DSI"/>
 *     &lt;enumeration value="DSIF"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="EDBV"/>
 *     &lt;enumeration value="DDE"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DSE"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="DUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalDocumentCategoryCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum AdditionalDocumentCategoryCodeType {


    /**
     * Drawback Suspens�o Comum
     * 
     */
    AC,

    /**
     * Drawback Suspens�o Gen�rico
     * 
     */
    DSG,

    /**
     * Drawback Suspens�o Intermedi�rio
     * 
     */
    DBSI,

    /**
     * Drawback Suspens�o Intermedi�rio gen�rico
     * 
     */
    DSIG,

    /**
     * Drawback Suspens�o Embarca��o Comum
     * 
     */
    DSEC,

    /**
     * Drawback Suspens�o Embarca��o Gen�rico
     * 
     */
    DSEG,

    /**
     * Drawback Suspens�o Fornecimento no Mercado Interno Comum
     * 
     */
    DSMC,

    /**
     * Drawback Suspens�o Fornecimento no Mercado Interno Gen�rico
     * 
     */
    DSMG,

    /**
     * Drawback Isen��o
     * 
     */
    DBI,

    /**
     * Drawback Isen��o Intermedi�rio
     * 
     */
    DBII,

    /**
     * LPCO
     * 
     */
    LPCO,

    /**
     * Declara��o Simplificada de Importa��o
     * 
     */
    DSI,

    /**
     * Declara��o Simplificada de Importa��o - Formul�rio
     * 
     */
    DSIF,

    /**
     * Declara��o de Importa��o
     * 
     */
    DI,

    /**
     * e-DBV
     * 
     */
    EDBV,

    /**
     * DDE
     * 
     */
    DDE,

    /**
     * DE
     * 
     */
    DE,

    /**
     * DSE
     * 
     */
    DSE,

    /**
     * RE
     * 
     */
    RE,

    /**
     * DU-E
     * 
     */
    DUE;

    public String value() {
        return name();
    }

    public static AdditionalDocumentCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
