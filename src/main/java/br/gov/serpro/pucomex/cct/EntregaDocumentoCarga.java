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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de EntregaDocumentoCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntregaDocumentoCarga"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoEntrega" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/&gt;
 *         &lt;element name="identificacaoPessoaJuridica" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/&gt;
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/&gt;
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}recebedor"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/&gt;
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntregaDocumentoCarga", propOrder = {
    "identificacaoEntrega",
    "identificacaoPessoaJuridica",
    "local",
    "documentos",
    "recebedor",
    "pesoAferido",
    "motivoNaoPesagem"
})
@Builder(builderMethodName = "entregaDocumentoCargaBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntregaDocumentoCarga {

    @XmlElement(required = true)
    protected String identificacaoEntrega;
    @XmlElement(required = true)
    protected String identificacaoPessoaJuridica;
    @XmlElement(required = true)
    protected Local local;
    @XmlElement(required = true)
    protected Documentos documentos;
    @XmlElement(required = true)
    protected Recebedor recebedor;
    protected BigDecimal pesoAferido;
    protected String motivoNaoPesagem;

}
