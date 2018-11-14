//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de OperacaoUnitizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperacaoUnitizacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoResponsavelUnitizacao" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}TLocalExtend"/&gt;
 *         &lt;element name="unitizacoes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="unitizacao" type="{http://www.pucomex.serpro.gov.br/cct}TUnitizacao"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacaoUnitizacao", propOrder = {
    "identificacaoResponsavelUnitizacao",
    "local",
    "unitizacoes"
})
@Builder(builderMethodName = "operacaoUnitizacaoBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperacaoUnitizacao {

    @XmlElement(required = true)
    protected String identificacaoResponsavelUnitizacao;
    @XmlElement(required = true)
    protected TLocalExtend local;
    @XmlElement(required = true)
    protected OperacaoUnitizacao.Unitizacoes unitizacoes;


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="unitizacao" type="{http://www.pucomex.serpro.gov.br/cct}TUnitizacao"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unitizacao"
    })
    @Builder(builderMethodName = "unitizacoesBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Unitizacoes {

        @XmlElement(required = true)
        protected TUnitizacao unitizacao;

    }

}
