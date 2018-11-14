//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de TConhecimentoCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConhecimentoCarga"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConhecimento"/&gt;
 *         &lt;element name="dataEmissaoConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
 *         &lt;element name="codigoMoedaSwift" type="{http://www.pucomex.serpro.gov.br/cct}MoedaSwift" minOccurs="0"/&gt;
 *         &lt;element name="formaPagamentoFrete" type="{http://www.pucomex.serpro.gov.br/cct}TipoFrete" minOccurs="0"/&gt;
 *         &lt;element name="valorFrete" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/&gt;
 *         &lt;element name="paisDestino" type="{http://www.pucomex.serpro.gov.br/cct}Pais" minOccurs="0"/&gt;
 *         &lt;element name="consignadoAOrdem" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/&gt;
 *         &lt;element name="nomeConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60" minOccurs="0"/&gt;
 *         &lt;element name="enderecoConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConhecimentoCarga", propOrder = {
    "numeroConhecimento",
    "dataEmissaoConhecimento",
    "codigoMoedaSwift",
    "formaPagamentoFrete",
    "valorFrete",
    "paisDestino",
    "consignadoAOrdem",
    "nomeConsignatario",
    "enderecoConsignatario"
})
@Builder(builderMethodName = "tConhecimentoCargaBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TConhecimentoCarga {

    @XmlElement(required = true)
    protected String numeroConhecimento;
    @XmlElement(required = true)
    protected String dataEmissaoConhecimento;
    protected String codigoMoedaSwift;
    protected String formaPagamentoFrete;
    @XmlElement(required = true)
    protected BigDecimal valorFrete;
    protected String paisDestino;
    @XmlElement(required = true)
    protected String consignadoAOrdem;
    protected String nomeConsignatario;
    protected String enderecoConsignatario;

}
