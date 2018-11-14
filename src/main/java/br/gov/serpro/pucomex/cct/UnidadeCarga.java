//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnidadeCarga.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnidadeCarga"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="veiculo"/&gt;
 *     &lt;enumeration value="vagao"/&gt;
 *     &lt;enumeration value="conteiner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnidadeCarga")
@XmlEnum
public enum UnidadeCarga {

    @XmlEnumValue("veiculo")
    VEICULO("veiculo"),
    @XmlEnumValue("vagao")
    VAGAO("vagao"),
    @XmlEnumValue("conteiner")
    CONTEINER("conteiner");
    private final String value;

    UnidadeCarga(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnidadeCarga fromValue(String v) {
        for (UnidadeCarga c: UnidadeCarga.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
