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
 * <p>Classe Java de DocumentoTransporte complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentoTransporte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}IdDocumentoTransporte"/&gt;
 *         &lt;element name="tipoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}TipoDocumentoTransporte"/&gt;
 *         &lt;element name="dataEmissaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/&gt;
 *         &lt;element name="dadosVeiculoConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/&gt;
 *         &lt;element name="dadosUnidadeTransporteConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/&gt;
 *         &lt;element name="dadosConteinerConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/&gt;
 *         &lt;element name="dadosEmbalagemConferem" type="{http://www.pucomex.serpro.gov.br/cct}SimNaoNaoSeAplica"/&gt;
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
@XmlType(name = "DocumentoTransporte", propOrder = {
    "identificacaoDocumentoTransporte",
    "tipoDocumentoTransporte",
    "dataEmissaoDocumentoTransporte",
    "dadosVeiculoConferem",
    "dadosUnidadeTransporteConferem",
    "dadosConteinerConferem",
    "dadosEmbalagemConferem",
    "pesoAferido",
    "motivoNaoPesagem"
})
@Builder(builderMethodName = "documentoTransporteBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DocumentoTransporte {

    @XmlElement(required = true)
    protected String identificacaoDocumentoTransporte;
    @XmlElement(required = true)
    protected String tipoDocumentoTransporte;
    @XmlElement(required = true)
    protected String dataEmissaoDocumentoTransporte;
    @XmlElement(required = true)
    protected String dadosVeiculoConferem;
    @XmlElement(required = true)
    protected String dadosUnidadeTransporteConferem;
    @XmlElement(required = true)
    protected String dadosConteinerConferem;
    @XmlElement(required = true)
    protected String dadosEmbalagemConferem;
    protected BigDecimal pesoAferido;
    protected String motivoNaoPesagem;

}
