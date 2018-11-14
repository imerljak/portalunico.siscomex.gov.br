//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de RecepcaoNFF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecepcaoNFF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/&gt;
 *         &lt;element name="cnpjResp" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/&gt;
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/&gt;
 *         &lt;element name="referenciaLocalRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element name="notasFiscais"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="notaFiscalFormulario" type="{http://www.pucomex.serpro.gov.br/cct}NotaFiscalFormulario" maxOccurs="40"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="transportador" type="{http://www.pucomex.serpro.gov.br/cct}Transportador"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/&gt;
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="localArmazenamento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/&gt;
 *         &lt;element name="codigoIdentCarga" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC" minOccurs="0"/&gt;
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoNFF", propOrder = {
    "identificacaoRecepcao",
    "cnpjResp",
    "local",
    "referenciaLocalRecepcao",
    "notasFiscais",
    "transportador",
    "pesoAferido",
    "motivoNaoPesagem",
    "localArmazenamento",
    "codigoIdentCarga",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais"
})
@Builder(builderMethodName = "recepcaoNFFBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecepcaoNFF {

    @XmlElement(required = true)
    protected String identificacaoRecepcao;
    @XmlElement(required = true)
    protected String cnpjResp;
    @XmlElement(required = true)
    protected Local local;
    protected String referenciaLocalRecepcao;
    @XmlElement(required = true)
    protected RecepcaoNFF.NotasFiscais notasFiscais;
    @XmlElement(required = true)
    protected Transportador transportador;
    protected BigDecimal pesoAferido;
    protected String motivoNaoPesagem;
    protected String localArmazenamento;
    protected String codigoIdentCarga;
    protected String avariasIdentificadas;
    protected String divergenciasIdentificadas;
    protected String observacoesGerais;


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
     *         &lt;element name="notaFiscalFormulario" type="{http://www.pucomex.serpro.gov.br/cct}NotaFiscalFormulario" maxOccurs="40"/&gt;
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
        "notaFiscalFormulario"
    })
    @Builder(builderMethodName = "notasFiscaisBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class NotasFiscais {

        @XmlElement(required = true)
        protected List<NotaFiscalFormulario> notaFiscalFormulario;

    }

}
