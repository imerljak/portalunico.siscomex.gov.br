//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:34:44 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DeclarationNFe" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationNFe"/&gt;
 *         &lt;element name="DeclarationNoNF" type="{urn:wco:datamodel:WCO:GoodsDeclaration:1}DeclarationNoNF"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "declarationNFe",
    "declarationNoNF"
})
@XmlRootElement(name = "Declaration")
@Builder(builderMethodName = "declarationBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Declaration {

    @XmlElement(name = "DeclarationNFe")
    protected DeclarationNFe declarationNFe;
    @XmlElement(name = "DeclarationNoNF")
    protected DeclarationNoNF declarationNoNF;

}
