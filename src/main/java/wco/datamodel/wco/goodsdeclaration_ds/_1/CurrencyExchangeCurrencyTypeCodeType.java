//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CurrencyExchangeCurrencyTypeCodeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyExchangeCurrencyTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFN"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BYN"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNH"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="GHS"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MGA"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZN"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDG"/&gt;
 *     &lt;enumeration value="SDR"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRD"/&gt;
 *     &lt;enumeration value="SSP"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TMT"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyExchangeCurrencyTypeCodeType")
@XmlEnum
public enum CurrencyExchangeCurrencyTypeCodeType {

    AED,
    AFN,
    ALL,
    AMD,
    ANG,
    AOA,
    ARS,
    AUD,
    AWG,
    BBD,
    BDT,
    BGN,
    BHD,
    BIF,
    BMD,
    BND,
    BOB,
    BRL,
    BSD,
    BTN,
    BWP,
    BYN,
    BZD,
    CAD,
    CDF,
    CHF,
    CLF,
    CLP,
    CNH,
    CNY,
    COP,
    CRC,
    CUP,
    CVE,
    CZK,
    DJF,
    DKK,
    DOP,
    DZD,
    EGP,
    ERN,
    ETB,
    EUR,
    FJD,
    FKP,
    GBP,
    GEL,
    GHS,
    GIP,
    GMD,
    GNF,
    GTQ,
    GYD,
    HKD,
    HNL,
    HRK,
    HTG,
    HUF,
    IDR,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    JMD,
    JOD,
    JPY,
    KES,
    KGS,
    KHR,
    KMF,
    KRW,
    KWD,
    KYD,
    KZT,
    LAK,
    LBP,
    LKR,
    LRD,
    LSL,
    LYD,
    MAD,
    MDL,
    MGA,
    MKD,
    MMK,
    MNT,
    MOP,
    MRO,
    MUR,
    MVR,
    MWK,
    MXN,
    MYR,
    MZN,
    NAD,
    NGN,
    NIO,
    NOK,
    NPR,
    NZD,
    OMR,
    PAB,
    PEN,
    PGK,
    PHP,
    PKR,
    PLN,
    PYG,
    QAR,
    RON,
    RSD,
    RUB,
    RWF,
    SAR,
    SBD,
    SCR,
    SDG,
    SDR,
    SEK,
    SGD,
    SHP,
    SLL,
    SOS,
    SRD,
    SSP,
    STD,
    SVC,
    SYP,
    SZL,
    THB,
    TJS,
    TMT,
    TND,
    TOP,
    TRY,
    TTD,
    TWD,
    TZS,
    UAH,
    UGX,
    USD,
    UYU,
    UZS,
    VEF,
    VND,
    VUV,
    WST,
    XAF,
    XAU,
    XCD,
    XOF,
    XPF,
    YER,
    ZAR,
    ZMW;

    public String value() {
        return name();
    }

    public static CurrencyExchangeCurrencyTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
