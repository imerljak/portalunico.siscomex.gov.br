//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 
 * 	
 * 		Quando uma Nota Fiscal for fomulário, enviar neste campo como identificador o seguinte formato:
 * 	
 * 	Prefixo F para determinar que é nota Formulário
 * 		1 caracter
 * 	cUF - Código da UF do emitente do Documento Fiscal 
 * 		2 caracteres
 * 	AAMM - Ano e Mês de emissão da NF-e 
 * 		4 caracteres
 * 	CNPJ - CNPJ do emitente 
 * 		14 caracteres
 * 	mod - Modelo do Documento Fiscal 
 * 		2 caracteres
 * 	serie - Série do Documento Fiscal 
 * 		3 caracteres
 * 	nNF - Número do Documento Fiscal 
 * 	9 caracteres
 * 	tpEmis – forma de emissão da NF-e
 * 		1 caracteres
 * 	cNF - Código Numérico que compõe a Chave de Acesso 
 * 		8 caracteres
 * 
 * 		
 * 		O identificador da Nota Fiscal Formulário seguirá regras semelhantes ao da NFe. Apenas o primeiro caracter que deve ser um F e não é necessário o digito verificador ao final.
 * 		Para maiores detalhes do preenchimento, seguir o manual da NF-e. http://www.nfe.fazenda.gov.br/portal/listaConteudo.aspx?tipoConteudo=33ol5hhSYZk=
 * 	
 * 
 * <p>Classe Java de ReferencedInvoiceIdentificationIDType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReferencedInvoiceIdentificationIDType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedInvoiceIdentificationIDType", propOrder = {
    "value"
})
@Builder(builderMethodName = "referencedInvoiceIdentificationIDTypeBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReferencedInvoiceIdentificationIDType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeID;

}
