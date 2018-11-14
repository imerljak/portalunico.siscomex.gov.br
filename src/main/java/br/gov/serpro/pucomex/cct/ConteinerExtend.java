//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:33:01 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Classe Java de ConteinerExtend complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConteinerExtend"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.pucomex.serpro.gov.br/cct}TConteiner"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/&gt;
 *         &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConteinerExtend", propOrder = {
    "pesoAferido",
    "motivoNaoPesagem"
})
@Builder(builderMethodName = "conteinerExtendBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ConteinerExtend
    extends TConteiner
{

    protected BigDecimal pesoAferido;
    protected String motivoNaoPesagem;

}
