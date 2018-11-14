
package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AdditionalInformationStatementTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalInformationStatementTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AAI"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="AAZ"/>
 *     &lt;enumeration value="ACG"/>
 *     &lt;enumeration value="AHZ"/>
 *     &lt;enumeration value="CUS"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="TRA"/>
 *     &lt;enumeration value="AVD"/>
 *     &lt;enumeration value="FGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalInformationStatementTypeCodeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
@XmlEnum
public enum AdditionalInformationStatementTypeCodeType {


    /**
     * Observa��es Gerais
     * 
     */
    AAI,

    /**
     * Comprot
     * 
     */
    ABC,

    /**
     * Motivo retifica��o
     * 
     */
    DEF,

    /**
     * Exporta��o Tempor�ria - Escolhendo esta op��o deve-se tamb�m preencher statementDescription e limit no level GovernmentAgencyGoodsItem/AdditionalInformation
     * 
     */
    AAZ,

    /**
     * Motivo Dispensa NF
     * 
     */
    ACG,

    /**
     * Situa��o Especial
     * 
     */
    AHZ,

    /**
     * Forma Exporta��o
     * 
     */
    CUS,

    /**
     * Prioridade Carga
     * 
     */
    PRI,

    /**
     * Caso Especial de Transporte
     * 
     */
    TRA,

    /**
     * Justificativa depura��o estat�stica qtd/peso/valor - Escolhendo esta op��o deve-se tamb�m preencher statementDescription no level GovernmentAgencyGoodsItem/AdditionalInformation
     * 
     */
    AVD,

    /**
     * Justificativa dispensa NF por outros motivos
     * 
     */
    FGH;

    public String value() {
        return name();
    }

    public static AdditionalInformationStatementTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
