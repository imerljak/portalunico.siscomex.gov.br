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
 * <p>Classe Java de RecepcaoDocumentoCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecepcaoDocumentoCarga"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/&gt;
 *         &lt;element name="cnpjResp" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/&gt;
 *         &lt;element name="referenciaLocalRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}entregador"/&gt;
 *         &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/&gt;
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="localArmazenamento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element name="codigoIdentCarga" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="transitoSimplificado" type="{http://www.pucomex.serpro.gov.br/cct}TransitoSimplificadoRecepcao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoDocumentoCarga", propOrder = {
    "identificacaoRecepcao",
    "cnpjResp",
    "local",
    "referenciaLocalRecepcao",
    "entregador",
    "documentos",
    "pesoAferido",
    "motivoNaoPesagem",
    "localArmazenamento",
    "codigoIdentCarga",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais",
    "transitoSimplificado"
})
@Builder(builderMethodName = "recepcaoDocumentoCargaBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecepcaoDocumentoCarga {

    @XmlElement(required = true)
    protected String identificacaoRecepcao;
    @XmlElement(required = true)
    protected String cnpjResp;
    @XmlElement(required = true)
    protected Local local;
    protected String referenciaLocalRecepcao;
    @XmlElement(required = true)
    protected Entregador entregador;
    @XmlElement(required = true)
    protected Documentos documentos;
    protected BigDecimal pesoAferido;
    protected String motivoNaoPesagem;
    protected String localArmazenamento;
    protected String codigoIdentCarga;
    protected String avariasIdentificadas;
    protected String divergenciasIdentificadas;
    protected String observacoesGerais;
    protected TransitoSimplificadoRecepcao transitoSimplificado;

}
