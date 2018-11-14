//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.14 às 04:12:02 PM BRST 
//


package wco.datamodel.wco.goodsdeclaration._1;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentCategoryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentDrawbackHsClassificationTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentDrawbackRecipientIdTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentItemIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentQuantityQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentValueWithExchangeCoverAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentValueWithoutExchangeCoverAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationLimitDateTimeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationStatementDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationStatementTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressCountryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressCountrySubDivisionCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressLineTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ClassificationIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ClassificationIdentificationTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityCommercialDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommunicationIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommunicationTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ContactNameTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CurrencyExchangeCurrencyTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarantIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarationIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarationOfficeIdentificationCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DestinationCountryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExitOfficeIdentificationCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExporterIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExporterNameTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureNetNetWeightMeasureType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureTariffQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureUnitDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentAgencyGoodsItemCustomsValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentProcedureCurrentCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ImporterNameTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceIssueDateTimeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceQuantityQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.PreviousDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCharacteristicsDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCharacteristicsTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCriteriaConformanceDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCriteriaConformanceTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductIdentifierTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.TradeTermsConditionCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.UCRTraderAssignedReferenceIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseLatitudeMeasureType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseLongitudeMeasureType;


/**
 * <p>Classe Java de DeclarationNoNF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationNoNF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarationIdentificationIDType" minOccurs="0"/&gt;
 *         &lt;element name="DeclarationOffice"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarationOfficeIdentificationCodeType"/&gt;
 *                   &lt;element name="Warehouse" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/&gt;
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/&gt;
 *                             &lt;element name="LatitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLatitudeMeasureType" minOccurs="0"/&gt;
 *                             &lt;element name="LongitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLongitudeMeasureType" minOccurs="0"/&gt;
 *                             &lt;element name="Address" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
 *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/&gt;
 *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrencyExchange"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CurrencyTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CurrencyExchangeCurrencyTypeCodeType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Declarant"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarantIdentificationIDType"/&gt;
 *                   &lt;element name="Contact" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ContactNameTextType"/&gt;
 *                             &lt;element name="Communication" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationIdentificationIDType"/&gt;
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationTypeCodeType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExitOffice"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExitOfficeIdentificationCodeType"/&gt;
 *                   &lt;element name="Warehouse" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType" minOccurs="0"/&gt;
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GoodsShipment" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Exporter"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterNameTextType"/&gt;
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterIdentificationIDType"/&gt;
 *                             &lt;element name="Address"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/&gt;
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType"/&gt;
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/&gt;
 *                             &lt;element name="Destination" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/&gt;
 *                                       &lt;element name="GoodsMeasure"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/&gt;
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/&gt;
 *                                       &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType" minOccurs="0"/&gt;
 *                                       &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType" minOccurs="0"/&gt;
 *                                       &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithoutExchangeCoverAmountType" minOccurs="0"/&gt;
 *                                       &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType" minOccurs="0"/&gt;
 *                                       &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/&gt;
 *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/&gt;
 *                                       &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType" minOccurs="0"/&gt;
 *                                                 &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType" minOccurs="0"/&gt;
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
 *                                                 &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/&gt;
 *                                                 &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
 *                                       &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/&gt;
 *                                       &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/&gt;
 *                                       &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Commodity"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/&gt;
 *                                       &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/&gt;
 *                                       &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/&gt;
 *                                       &lt;element name="Classification"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/&gt;
 *                                                 &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/&gt;
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/&gt;
 *                                                 &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Product" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/&gt;
 *                                                 &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/&gt;
 *                                                 &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/&gt;
 *                                                 &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GoodsMeasure"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GovernmentProcedure" maxOccurs="4"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/&gt;
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ValuationAdjustment" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/&gt;
 *                                       &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Importer"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ImporterNameTextType"/&gt;
 *                             &lt;element name="Address"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Invoice"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
 *                             &lt;element name="AdditionalInformation" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
 *                                       &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TradeTerms"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}TradeTermsConditionCodeType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UCR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}UCRTraderAssignedReferenceIDType"/&gt;
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
@XmlType(name = "DeclarationNoNF", propOrder = {
    "id",
    "declarationOffice",
    "additionalInformation",
    "currencyExchange",
    "declarant",
    "exitOffice",
    "goodsShipment",
    "ucr"
})
@Builder(builderMethodName = "declarationNoNFBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeclarationNoNF {

    @XmlElement(name = "ID")
    protected DeclarationIdentificationIDType id;
    @XmlElement(name = "DeclarationOffice", required = true)
    protected DeclarationNoNF.DeclarationOffice declarationOffice;
    @XmlElement(name = "AdditionalInformation")
    protected List<DeclarationNoNF.AdditionalInformation> additionalInformation;
    @XmlElement(name = "CurrencyExchange", required = true)
    protected DeclarationNoNF.CurrencyExchange currencyExchange;
    @XmlElement(name = "Declarant", required = true)
    protected DeclarationNoNF.Declarant declarant;
    @XmlElement(name = "ExitOffice", required = true)
    protected DeclarationNoNF.ExitOffice exitOffice;
    @XmlElement(name = "GoodsShipment", required = true)
    protected List<DeclarationNoNF.GoodsShipment> goodsShipment;
    @XmlElement(name = "UCR")
    protected DeclarationNoNF.UCR ucr;


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
     *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
     *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/&gt;
     *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
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
        "statementCode",
        "statementDescription",
        "statementTypeCode"
    })
    @Builder(builderMethodName = "additionalInformationBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class AdditionalInformation {

        @XmlElement(name = "StatementCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String statementCode;
        @XmlElement(name = "StatementDescription")
        protected AdditionalInformationStatementDescriptionTextType statementDescription;
        @XmlElement(name = "StatementTypeCode")
        @XmlSchemaType(name = "token")
        protected AdditionalInformationStatementTypeCodeType statementTypeCode;

    }


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
     *         &lt;element name="CurrencyTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CurrencyExchangeCurrencyTypeCodeType"/&gt;
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
        "currencyTypeCode"
    })
    @Builder(builderMethodName = "currencyExchangeBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class CurrencyExchange {

        @XmlElement(name = "CurrencyTypeCode", required = true)
        @XmlSchemaType(name = "token")
        protected CurrencyExchangeCurrencyTypeCodeType currencyTypeCode;

    }


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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarantIdentificationIDType"/&gt;
     *         &lt;element name="Contact" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ContactNameTextType"/&gt;
     *                   &lt;element name="Communication" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationIdentificationIDType"/&gt;
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationTypeCodeType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "id",
        "contact"
    })
    @Builder(builderMethodName = "declarantBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Declarant {

        @XmlElement(name = "ID", required = true)
        protected DeclarantIdentificationIDType id;
        @XmlElement(name = "Contact")
        protected DeclarationNoNF.Declarant.Contact contact;


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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ContactNameTextType"/&gt;
         *         &lt;element name="Communication" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationIdentificationIDType"/&gt;
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationTypeCodeType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "name",
            "communication"
        })
        @Builder(builderMethodName = "contactBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Contact {

            @XmlElement(name = "Name", required = true)
            protected ContactNameTextType name;
            @XmlElement(name = "Communication", required = true)
            protected List<DeclarationNoNF.Declarant.Contact.Communication> communication;


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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationIdentificationIDType"/&gt;
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommunicationTypeCodeType"/&gt;
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
                "id",
                "typeCode"
            })
            @Builder(builderMethodName = "communicationBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class Communication {

                @XmlElement(name = "ID", required = true)
                protected CommunicationIdentificationIDType id;
                @XmlElement(name = "TypeCode", required = true)
                @XmlSchemaType(name = "token")
                protected CommunicationTypeCodeType typeCode;

            }

        }

    }


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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarationOfficeIdentificationCodeType"/&gt;
     *         &lt;element name="Warehouse" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/&gt;
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/&gt;
     *                   &lt;element name="LatitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLatitudeMeasureType" minOccurs="0"/&gt;
     *                   &lt;element name="LongitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLongitudeMeasureType" minOccurs="0"/&gt;
     *                   &lt;element name="Address" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "id",
        "warehouse"
    })
    @Builder(builderMethodName = "declarationOfficeBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DeclarationOffice {

        @XmlElement(name = "ID", required = true)
        protected DeclarationOfficeIdentificationCodeType id;
        @XmlElement(name = "Warehouse")
        protected DeclarationNoNF.DeclarationOffice.Warehouse warehouse;


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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/&gt;
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/&gt;
         *         &lt;element name="LatitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLatitudeMeasureType" minOccurs="0"/&gt;
         *         &lt;element name="LongitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLongitudeMeasureType" minOccurs="0"/&gt;
         *         &lt;element name="Address" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/&gt;
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
        @XmlType(name = "", propOrder = {
            "id",
            "typeCode",
            "latitudeMeasure",
            "longitudeMeasure",
            "address"
        })
        @Builder(builderMethodName = "warehouseBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Warehouse {

            @XmlElement(name = "ID", required = true)
            protected WarehouseIdentificationIDType id;
            @XmlElement(name = "TypeCode", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;
            @XmlElement(name = "LatitudeMeasure")
            protected WarehouseLatitudeMeasureType latitudeMeasure;
            @XmlElement(name = "LongitudeMeasure")
            protected WarehouseLongitudeMeasureType longitudeMeasure;
            @XmlElement(name = "Address")
            protected DeclarationNoNF.DeclarationOffice.Warehouse.Address address;


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
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/&gt;
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
                "line"
            })
            @Builder(builderMethodName = "addressBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class Address {

                @XmlElement(name = "Line")
                protected AddressLineTextType line;

            }

        }

    }


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
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExitOfficeIdentificationCodeType"/&gt;
     *         &lt;element name="Warehouse" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType" minOccurs="0"/&gt;
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/&gt;
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
    @XmlType(name = "", propOrder = {
        "id",
        "warehouse"
    })
    @Builder(builderMethodName = "exitOfficeBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class ExitOffice {

        @XmlElement(name = "ID", required = true)
        protected ExitOfficeIdentificationCodeType id;
        @XmlElement(name = "Warehouse")
        protected DeclarationNoNF.ExitOffice.Warehouse warehouse;


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
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType" minOccurs="0"/&gt;
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/&gt;
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
            "id",
            "typeCode"
        })
        @Builder(builderMethodName = "warehouseBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Warehouse {

            @XmlElement(name = "ID")
            protected WarehouseIdentificationIDType id;
            @XmlElement(name = "TypeCode", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;

        }

    }


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
     *         &lt;element name="Exporter"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterNameTextType"/&gt;
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterIdentificationIDType"/&gt;
     *                   &lt;element name="Address"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/&gt;
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType"/&gt;
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/&gt;
     *                   &lt;element name="Destination" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/&gt;
     *                             &lt;element name="GoodsMeasure"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/&gt;
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/&gt;
     *                             &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType" minOccurs="0"/&gt;
     *                             &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType" minOccurs="0"/&gt;
     *                             &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithoutExchangeCoverAmountType" minOccurs="0"/&gt;
     *                             &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType" minOccurs="0"/&gt;
     *                             &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/&gt;
     *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/&gt;
     *                             &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType" minOccurs="0"/&gt;
     *                                       &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType" minOccurs="0"/&gt;
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
     *                                       &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/&gt;
     *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
     *                             &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/&gt;
     *                             &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/&gt;
     *                             &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Commodity"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/&gt;
     *                             &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/&gt;
     *                             &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/&gt;
     *                             &lt;element name="Classification"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/&gt;
     *                                       &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/&gt;
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/&gt;
     *                                       &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Product" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/&gt;
     *                                       &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/&gt;
     *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/&gt;
     *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GoodsMeasure"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GovernmentProcedure" maxOccurs="4"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/&gt;
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ValuationAdjustment" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/&gt;
     *                             &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Importer"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ImporterNameTextType"/&gt;
     *                   &lt;element name="Address"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Invoice"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
     *                   &lt;element name="AdditionalInformation" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
     *                             &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TradeTerms"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}TradeTermsConditionCodeType"/&gt;
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
    @XmlType(name = "", propOrder = {
        "exporter",
        "governmentAgencyGoodsItem",
        "importer",
        "invoice",
        "tradeTerms"
    })
    @Builder(builderMethodName = "goodsShipmentBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class GoodsShipment {

        @XmlElement(name = "Exporter", required = true)
        protected DeclarationNoNF.GoodsShipment.Exporter exporter;
        @XmlElement(name = "GovernmentAgencyGoodsItem", required = true)
        protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;
        @XmlElement(name = "Importer", required = true)
        protected DeclarationNoNF.GoodsShipment.Importer importer;
        @XmlElement(name = "Invoice", required = true)
        protected DeclarationNoNF.GoodsShipment.Invoice invoice;
        @XmlElement(name = "TradeTerms", required = true)
        protected DeclarationNoNF.GoodsShipment.TradeTerms tradeTerms;


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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterNameTextType"/&gt;
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterIdentificationIDType"/&gt;
         *         &lt;element name="Address"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/&gt;
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "name",
            "id",
            "address"
        })
        @Builder(builderMethodName = "exporterBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Exporter {

            @XmlElement(name = "Name", required = true)
            protected ExporterNameTextType name;
            @XmlElement(name = "ID", required = true)
            protected ExporterIdentificationIDType id;
            @XmlElement(name = "Address", required = true)
            protected DeclarationNoNF.GoodsShipment.Exporter.Address address;


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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/&gt;
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
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
                "countryCode",
                "countrySubDivisionCode",
                "line"
            })
            @Builder(builderMethodName = "addressBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class Address {

                @XmlElement(name = "CountryCode", required = true)
                @XmlSchemaType(name = "token")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode", required = true)
                @XmlSchemaType(name = "token")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "Line", required = true)
                protected AddressLineTextType line;

            }

        }


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
         *         &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType"/&gt;
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/&gt;
         *         &lt;element name="Destination" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/&gt;
         *                   &lt;element name="GoodsMeasure"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/&gt;
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/&gt;
         *                   &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType" minOccurs="0"/&gt;
         *                   &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType" minOccurs="0"/&gt;
         *                   &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithoutExchangeCoverAmountType" minOccurs="0"/&gt;
         *                   &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType" minOccurs="0"/&gt;
         *                   &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/&gt;
         *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/&gt;
         *                   &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType" minOccurs="0"/&gt;
         *                             &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType" minOccurs="0"/&gt;
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
         *                             &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/&gt;
         *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
         *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/&gt;
         *                   &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/&gt;
         *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Commodity"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/&gt;
         *                   &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/&gt;
         *                   &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/&gt;
         *                   &lt;element name="Classification"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/&gt;
         *                             &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/&gt;
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/&gt;
         *                             &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Product" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/&gt;
         *                             &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/&gt;
         *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/&gt;
         *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GoodsMeasure"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GovernmentProcedure" maxOccurs="4"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/&gt;
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ValuationAdjustment" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/&gt;
         *                   &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "customsValueAmount",
            "sequenceNumeric",
            "destination",
            "additionalDocument",
            "additionalInformation",
            "commodity",
            "goodsMeasure",
            "governmentProcedure",
            "previousDocument",
            "valuationAdjustment"
        })
        @Builder(builderMethodName = "governmentAgencyGoodsItemBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class GovernmentAgencyGoodsItem {

            @XmlElement(name = "CustomsValueAmount", required = true)
            protected GovernmentAgencyGoodsItemCustomsValueAmountType customsValueAmount;
            @XmlElement(name = "SequenceNumeric", required = true)
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "Destination", required = true)
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination> destination;
            @XmlElement(name = "AdditionalDocument")
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> additionalDocument;
            @XmlElement(name = "AdditionalInformation")
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> additionalInformation;
            @XmlElement(name = "Commodity", required = true)
            protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity commodity;
            @XmlElement(name = "GoodsMeasure", required = true)
            protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure goodsMeasure;
            @XmlElement(name = "GovernmentProcedure", required = true)
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> governmentProcedure;
            @XmlElement(name = "PreviousDocument")
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> previousDocument;
            @XmlElement(name = "ValuationAdjustment")
            protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment valuationAdjustment;


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
             *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/&gt;
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/&gt;
             *         &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType" minOccurs="0"/&gt;
             *         &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType" minOccurs="0"/&gt;
             *         &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithoutExchangeCoverAmountType" minOccurs="0"/&gt;
             *         &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType" minOccurs="0"/&gt;
             *         &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/&gt;
             *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/&gt;
             *         &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType" minOccurs="0"/&gt;
             *                   &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType" minOccurs="0"/&gt;
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
             *                   &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/&gt;
             *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType" minOccurs="0"/&gt;
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
            @XmlType(name = "", propOrder = {
                "categoryCode",
                "id",
                "drawbackHsClassification",
                "drawbackRecipientId",
                "valueWithoutExchangeCoverAmount",
                "valueWithExchangeCoverAmount",
                "itemID",
                "quantityQuantity",
                "invoice"
            })
            @Builder(builderMethodName = "additionalDocumentBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class AdditionalDocument {

                @XmlElement(name = "CategoryCode")
                @XmlSchemaType(name = "token")
                protected AdditionalDocumentCategoryCodeType categoryCode;
                @XmlElement(name = "ID")
                protected AdditionalDocumentIdentificationIDType id;
                @XmlElement(name = "DrawbackHsClassification")
                protected AdditionalDocumentDrawbackHsClassificationTextType drawbackHsClassification;
                @XmlElement(name = "DrawbackRecipientId")
                protected AdditionalDocumentDrawbackRecipientIdTextType drawbackRecipientId;
                @XmlElement(name = "ValueWithoutExchangeCoverAmount")
                protected AdditionalDocumentValueWithoutExchangeCoverAmountType valueWithoutExchangeCoverAmount;
                @XmlElement(name = "ValueWithExchangeCoverAmount")
                protected AdditionalDocumentValueWithExchangeCoverAmountType valueWithExchangeCoverAmount;
                @XmlElement(name = "ItemID")
                protected AdditionalDocumentItemIDType itemID;
                @XmlElement(name = "QuantityQuantity")
                protected AdditionalDocumentQuantityQuantityType quantityQuantity;
                @XmlElement(name = "Invoice")
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Invoice> invoice;


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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType" minOccurs="0"/&gt;
                 *         &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType" minOccurs="0"/&gt;
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
                 *         &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType" minOccurs="0"/&gt;
                 *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType" minOccurs="0"/&gt;
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
                    "id",
                    "issueDateTime",
                    "typeCode",
                    "customsValueAmount",
                    "quantityQuantity"
                })
                @Builder(builderMethodName = "invoiceBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class Invoice {

                    @XmlElement(name = "ID")
                    protected InvoiceIdentificationIDType id;
                    @XmlElement(name = "IssueDateTime")
                    protected InvoiceIssueDateTimeType issueDateTime;
                    @XmlElement(name = "TypeCode")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String typeCode;
                    @XmlElement(name = "CustomsValueAmount")
                    protected GovernmentAgencyGoodsItemCustomsValueAmountType customsValueAmount;
                    @XmlElement(name = "QuantityQuantity")
                    protected InvoiceQuantityQuantityType quantityQuantity;

                }

            }


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
             *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
             *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/&gt;
             *         &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/&gt;
             *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
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
                "statementCode",
                "statementDescription",
                "limitDateTime",
                "statementTypeCode"
            })
            @Builder(builderMethodName = "additionalInformationBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class AdditionalInformation {

                @XmlElement(name = "StatementCode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String statementCode;
                @XmlElement(name = "StatementDescription")
                protected AdditionalInformationStatementDescriptionTextType statementDescription;
                @XmlElement(name = "LimitDateTime")
                protected AdditionalInformationLimitDateTimeType limitDateTime;
                @XmlElement(name = "StatementTypeCode")
                @XmlSchemaType(name = "token")
                protected AdditionalInformationStatementTypeCodeType statementTypeCode;

            }


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
             *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/&gt;
             *         &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/&gt;
             *         &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/&gt;
             *         &lt;element name="Classification"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/&gt;
             *                   &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/&gt;
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/&gt;
             *                   &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Product" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/&gt;
             *                   &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/&gt;
             *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/&gt;
             *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/&gt;
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
            @XmlType(name = "", propOrder = {
                "description",
                "valueAmount",
                "commercialDescription",
                "classification",
                "goodsMeasure",
                "product",
                "productCharacteristics",
                "productCriteriaConformance"
            })
            @Builder(builderMethodName = "commodityBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class Commodity {

                @XmlElement(name = "Description")
                protected CommodityDescriptionTextType description;
                @XmlElement(name = "ValueAmount", required = true)
                protected CommodityValueAmountType valueAmount;
                @XmlElement(name = "CommercialDescription")
                protected CommodityCommercialDescriptionTextType commercialDescription;
                @XmlElement(name = "Classification", required = true)
                protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification classification;
                @XmlElement(name = "GoodsMeasure", required = true)
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure> goodsMeasure;
                @XmlElement(name = "Product")
                protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Product product;
                @XmlElement(name = "ProductCharacteristics")
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics> productCharacteristics;
                @XmlElement(name = "ProductCriteriaConformance")
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance> productCriteriaConformance;


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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/&gt;
                 *         &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/&gt;
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
                    "id",
                    "identificationTypeCode"
                })
                @Builder(builderMethodName = "classificationBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class Classification {

                    @XmlElement(name = "ID")
                    protected ClassificationIdentificationIDType id;
                    @XmlElement(name = "IdentificationTypeCode", required = true)
                    @XmlSchemaType(name = "token")
                    protected ClassificationIdentificationTypeCodeType identificationTypeCode;

                }


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
                 *         &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/&gt;
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/&gt;
                 *         &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
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
                    "unitDescription",
                    "typeCode",
                    "tariffQuantity"
                })
                @Builder(builderMethodName = "goodsMeasureBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class GoodsMeasure {

                    @XmlElement(name = "UnitDescription")
                    protected GoodsMeasureUnitDescriptionTextType unitDescription;
                    @XmlElement(name = "TypeCode", required = true)
                    @XmlSchemaType(name = "token")
                    protected GoodsMeasureTypeCodeType typeCode;
                    @XmlElement(name = "TariffQuantity", required = true)
                    protected GoodsMeasureTariffQuantityType tariffQuantity;

                }


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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/&gt;
                 *         &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/&gt;
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
                    "id",
                    "identifierTypeCode"
                })
                @Builder(builderMethodName = "productBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class Product {

                    @XmlElement(name = "ID", required = true)
                    protected ProductIdentificationIDType id;
                    @XmlElement(name = "IdentifierTypeCode", required = true)
                    @XmlSchemaType(name = "token")
                    protected ProductIdentifierTypeCodeType identifierTypeCode;

                }


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
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/&gt;
                 *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/&gt;
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
                    "typeCode",
                    "description"
                })
                @Builder(builderMethodName = "productCharacteristicsBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class ProductCharacteristics {

                    @XmlElement(name = "TypeCode", required = true)
                    protected ProductCharacteristicsTypeCodeType typeCode;
                    @XmlElement(name = "Description", required = true)
                    protected ProductCharacteristicsDescriptionTextType description;

                }


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
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/&gt;
                 *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/&gt;
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
                    "typeCode",
                    "description"
                })
                @Builder(builderMethodName = "productCriteriaConformanceBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class ProductCriteriaConformance {

                    @XmlElement(name = "TypeCode", required = true)
                    protected ProductCriteriaConformanceTypeCodeType typeCode;
                    @XmlElement(name = "Description", required = true)
                    protected ProductCriteriaConformanceDescriptionTextType description;

                }

            }


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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/&gt;
             *         &lt;element name="GoodsMeasure"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
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
            @XmlType(name = "", propOrder = {
                "countryCode",
                "goodsMeasure"
            })
            @Builder(builderMethodName = "destinationBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class Destination {

                @XmlElement(name = "CountryCode", required = true)
                @XmlSchemaType(name = "token")
                protected DestinationCountryCodeType countryCode;
                @XmlElement(name = "GoodsMeasure", required = true)
                protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure goodsMeasure;


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
                 *         &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/&gt;
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
                    "tariffQuantity"
                })
                @Builder(builderMethodName = "goodsMeasureBuilder")
                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public static class GoodsMeasure {

                    @XmlElement(name = "TariffQuantity", required = true)
                    protected GoodsMeasureTariffQuantityType tariffQuantity;

                }

            }


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
             *         &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/&gt;
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
                "netNetWeightMeasure"
            })
            @Builder(builderMethodName = "goodsMeasureBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class GoodsMeasure {

                @XmlElement(name = "NetNetWeightMeasure", required = true)
                protected GoodsMeasureNetNetWeightMeasureType netNetWeightMeasure;

            }


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
             *         &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/&gt;
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
                "currentCode"
            })
            @Builder(builderMethodName = "governmentProcedureBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class GovernmentProcedure {

                @XmlElement(name = "CurrentCode", required = true)
                protected GovernmentProcedureCurrentCodeType currentCode;

            }


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
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/&gt;
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/&gt;
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
                "id",
                "typeCode"
            })
            @Builder(builderMethodName = "previousDocumentBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class PreviousDocument {

                @XmlElement(name = "ID")
                protected PreviousDocumentIdentificationIDType id;
                @XmlElement(name = "TypeCode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String typeCode;

            }


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
             *         &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/&gt;
             *         &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/&gt;
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
                "additionCode",
                "percentageNumeric"
            })
            @Builder(builderMethodName = "valuationAdjustmentBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class ValuationAdjustment {

                @XmlElement(name = "AdditionCode", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String additionCode;
                @XmlElement(name = "PercentageNumeric", required = true)
                protected BigDecimal percentageNumeric;

            }

        }


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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ImporterNameTextType"/&gt;
         *         &lt;element name="Address"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
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
        @XmlType(name = "", propOrder = {
            "name",
            "address"
        })
        @Builder(builderMethodName = "importerBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Importer {

            @XmlElement(name = "Name", required = true)
            protected ImporterNameTextType name;
            @XmlElement(name = "Address", required = true)
            protected DeclarationNoNF.GoodsShipment.Importer.Address address;


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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/&gt;
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/&gt;
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
                "countryCode",
                "line"
            })
            @Builder(builderMethodName = "addressBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class Address {

                @XmlElement(name = "CountryCode", required = true)
                @XmlSchemaType(name = "token")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "Line", required = true)
                protected AddressLineTextType line;

            }

        }


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
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/&gt;
         *         &lt;element name="AdditionalInformation" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
         *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
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
        @XmlType(name = "", propOrder = {
            "typeCode",
            "additionalInformation"
        })
        @Builder(builderMethodName = "invoiceBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Invoice {

            @XmlElement(name = "TypeCode")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;
            @XmlElement(name = "AdditionalInformation")
            protected DeclarationNoNF.GoodsShipment.Invoice.AdditionalInformation additionalInformation;


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
             *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/&gt;
             *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/&gt;
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
                "statementCode",
                "statementTypeCode"
            })
            @Builder(builderMethodName = "additionalInformationBuilder")
            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public static class AdditionalInformation {

                @XmlElement(name = "StatementCode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String statementCode;
                @XmlElement(name = "StatementTypeCode")
                @XmlSchemaType(name = "token")
                protected AdditionalInformationStatementTypeCodeType statementTypeCode;

            }

        }


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
         *         &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}TradeTermsConditionCodeType"/&gt;
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
            "conditionCode"
        })
        @Builder(builderMethodName = "tradeTermsBuilder")
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class TradeTerms {

            @XmlElement(name = "ConditionCode", required = true)
            @XmlSchemaType(name = "token")
            protected TradeTermsConditionCodeType conditionCode;

        }

    }


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
     *         &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}UCRTraderAssignedReferenceIDType"/&gt;
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
        "traderAssignedReferenceID"
    })
    @Builder(builderMethodName = "uCRBuilder")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class UCR {

        @XmlElement(name = "TraderAssignedReferenceID", required = true)
        protected UCRTraderAssignedReferenceIDType traderAssignedReferenceID;

    }

}
