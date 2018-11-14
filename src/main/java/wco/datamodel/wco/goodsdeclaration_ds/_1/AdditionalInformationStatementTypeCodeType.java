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
 * <p>Classe Java de AdditionalInformationStatementTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalInformationStatementTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AAI"/&gt;
 *     &lt;enumeration value="ABC"/&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="AAZ"/&gt;
 *     &lt;enumeration value="ACG"/&gt;
 *     &lt;enumeration value="AHZ"/&gt;
 *     &lt;enumeration value="CUS"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="AVD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalInformationStatementTypeCodeType")
@XmlEnum
public enum AdditionalInformationStatementTypeCodeType {


    /**
     * Observações Gerais
     * 
     */
    AAI,

    /**
     * Comprot
     * 
     */
    ABC,

    /**
     * Motivo retificação
     * 
     */
    DEF,

    /**
     * Exportação Temporária - Escolhendo esta opção deve-se também preencher statementDescription e limit no level GovernmentAgencyGoodsItem/AdditionalInformation
     * 
     */
    AAZ,

    /**
     * Motivo Dispensa NF
     * 
     */
    ACG,

    /**
     * Situação Especial
     * 
     */
    AHZ,

    /**
     * Forma Exportação
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
     * Justificativa depuração estatística qtd/peso/valor - Escolhendo esta opção deve-se também preencher statementDescription no level GovernmentAgencyGoodsItem/AdditionalInformation
     * 
     */
    AVD;

    public String value() {
        return name();
    }

    public static AdditionalInformationStatementTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
