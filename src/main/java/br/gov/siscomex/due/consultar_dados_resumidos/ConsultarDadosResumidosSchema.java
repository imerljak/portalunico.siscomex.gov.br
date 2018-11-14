
package br.gov.siscomex.due.consultar_dados_resumidos;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsultarDadosResumidosSchema {

    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("situacaoDUE")
    @Expose
    private Integer situacaoDUE;
    @SerializedName("dataSituacaoDUE")
    @Expose
    private String dataSituacaoDUE;
    @SerializedName("indicadorBloqueio")
    @Expose
    private Integer indicadorBloqueio;
    @SerializedName("controleAdministrativo")
    @Expose
    private Integer controleAdministrativo;
    @SerializedName("uaEmbarque")
    @Expose
    private String uaEmbarque;
    @SerializedName("uaDespacho")
    @Expose
    private String uaDespacho;
    @SerializedName("responsavelUADespacho")
    @Expose
    private Object responsavelUADespacho;
    @SerializedName("codigoRecintoAduaneiroDespacho")
    @Expose
    private String codigoRecintoAduaneiroDespacho;
    @SerializedName("codigoRecintoAduaneiroEmbarque")
    @Expose
    private String codigoRecintoAduaneiroEmbarque;
    @SerializedName("latitudeDespacho")
    @Expose
    private String latitudeDespacho;
    @SerializedName("longitudeDespacho")
    @Expose
    private String longitudeDespacho;
    @SerializedName("declarante")
    @Expose
    @Valid
    private Declarante declarante;
    @SerializedName("exportadores")
    @Expose
    @Valid
    private List<Exportadore> exportadores = new ArrayList<Exportadore>();
    @SerializedName("situacaoCarga")
    @Expose
    @Valid
    private List<Integer> situacaoCarga = new ArrayList<Integer>();

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public ConsultarDadosResumidosSchema withNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
        return this;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public ConsultarDadosResumidosSchema withNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    public Integer getSituacaoDUE() {
        return situacaoDUE;
    }

    public void setSituacaoDUE(Integer situacaoDUE) {
        this.situacaoDUE = situacaoDUE;
    }

    public ConsultarDadosResumidosSchema withSituacaoDUE(Integer situacaoDUE) {
        this.situacaoDUE = situacaoDUE;
        return this;
    }

    public String getDataSituacaoDUE() {
        return dataSituacaoDUE;
    }

    public void setDataSituacaoDUE(String dataSituacaoDUE) {
        this.dataSituacaoDUE = dataSituacaoDUE;
    }

    public ConsultarDadosResumidosSchema withDataSituacaoDUE(String dataSituacaoDUE) {
        this.dataSituacaoDUE = dataSituacaoDUE;
        return this;
    }

    public Integer getIndicadorBloqueio() {
        return indicadorBloqueio;
    }

    public void setIndicadorBloqueio(Integer indicadorBloqueio) {
        this.indicadorBloqueio = indicadorBloqueio;
    }

    public ConsultarDadosResumidosSchema withIndicadorBloqueio(Integer indicadorBloqueio) {
        this.indicadorBloqueio = indicadorBloqueio;
        return this;
    }

    public Integer getControleAdministrativo() {
        return controleAdministrativo;
    }

    public void setControleAdministrativo(Integer controleAdministrativo) {
        this.controleAdministrativo = controleAdministrativo;
    }

    public ConsultarDadosResumidosSchema withControleAdministrativo(Integer controleAdministrativo) {
        this.controleAdministrativo = controleAdministrativo;
        return this;
    }

    public String getUaEmbarque() {
        return uaEmbarque;
    }

    public void setUaEmbarque(String uaEmbarque) {
        this.uaEmbarque = uaEmbarque;
    }

    public ConsultarDadosResumidosSchema withUaEmbarque(String uaEmbarque) {
        this.uaEmbarque = uaEmbarque;
        return this;
    }

    public String getUaDespacho() {
        return uaDespacho;
    }

    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    public ConsultarDadosResumidosSchema withUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
        return this;
    }

    public Object getResponsavelUADespacho() {
        return responsavelUADespacho;
    }

    public void setResponsavelUADespacho(Object responsavelUADespacho) {
        this.responsavelUADespacho = responsavelUADespacho;
    }

    public ConsultarDadosResumidosSchema withResponsavelUADespacho(Object responsavelUADespacho) {
        this.responsavelUADespacho = responsavelUADespacho;
        return this;
    }

    public String getCodigoRecintoAduaneiroDespacho() {
        return codigoRecintoAduaneiroDespacho;
    }

    public void setCodigoRecintoAduaneiroDespacho(String codigoRecintoAduaneiroDespacho) {
        this.codigoRecintoAduaneiroDespacho = codigoRecintoAduaneiroDespacho;
    }

    public ConsultarDadosResumidosSchema withCodigoRecintoAduaneiroDespacho(String codigoRecintoAduaneiroDespacho) {
        this.codigoRecintoAduaneiroDespacho = codigoRecintoAduaneiroDespacho;
        return this;
    }

    public String getCodigoRecintoAduaneiroEmbarque() {
        return codigoRecintoAduaneiroEmbarque;
    }

    public void setCodigoRecintoAduaneiroEmbarque(String codigoRecintoAduaneiroEmbarque) {
        this.codigoRecintoAduaneiroEmbarque = codigoRecintoAduaneiroEmbarque;
    }

    public ConsultarDadosResumidosSchema withCodigoRecintoAduaneiroEmbarque(String codigoRecintoAduaneiroEmbarque) {
        this.codigoRecintoAduaneiroEmbarque = codigoRecintoAduaneiroEmbarque;
        return this;
    }

    public String getLatitudeDespacho() {
        return latitudeDespacho;
    }

    public void setLatitudeDespacho(String latitudeDespacho) {
        this.latitudeDespacho = latitudeDespacho;
    }

    public ConsultarDadosResumidosSchema withLatitudeDespacho(String latitudeDespacho) {
        this.latitudeDespacho = latitudeDespacho;
        return this;
    }

    public String getLongitudeDespacho() {
        return longitudeDespacho;
    }

    public void setLongitudeDespacho(String longitudeDespacho) {
        this.longitudeDespacho = longitudeDespacho;
    }

    public ConsultarDadosResumidosSchema withLongitudeDespacho(String longitudeDespacho) {
        this.longitudeDespacho = longitudeDespacho;
        return this;
    }

    public Declarante getDeclarante() {
        return declarante;
    }

    public void setDeclarante(Declarante declarante) {
        this.declarante = declarante;
    }

    public ConsultarDadosResumidosSchema withDeclarante(Declarante declarante) {
        this.declarante = declarante;
        return this;
    }

    public List<Exportadore> getExportadores() {
        return exportadores;
    }

    public void setExportadores(List<Exportadore> exportadores) {
        this.exportadores = exportadores;
    }

    public ConsultarDadosResumidosSchema withExportadores(List<Exportadore> exportadores) {
        this.exportadores = exportadores;
        return this;
    }

    public List<Integer> getSituacaoCarga() {
        return situacaoCarga;
    }

    public void setSituacaoCarga(List<Integer> situacaoCarga) {
        this.situacaoCarga = situacaoCarga;
    }

    public ConsultarDadosResumidosSchema withSituacaoCarga(List<Integer> situacaoCarga) {
        this.situacaoCarga = situacaoCarga;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDUE", numeroDUE).append("numeroRUC", numeroRUC).append("situacaoDUE", situacaoDUE).append("dataSituacaoDUE", dataSituacaoDUE).append("indicadorBloqueio", indicadorBloqueio).append("controleAdministrativo", controleAdministrativo).append("uaEmbarque", uaEmbarque).append("uaDespacho", uaDespacho).append("responsavelUADespacho", responsavelUADespacho).append("codigoRecintoAduaneiroDespacho", codigoRecintoAduaneiroDespacho).append("codigoRecintoAduaneiroEmbarque", codigoRecintoAduaneiroEmbarque).append("latitudeDespacho", latitudeDespacho).append("longitudeDespacho", longitudeDespacho).append("declarante", declarante).append("exportadores", exportadores).append("situacaoCarga", situacaoCarga).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exportadores).append(responsavelUADespacho).append(declarante).append(numeroRUC).append(uaDespacho).append(codigoRecintoAduaneiroEmbarque).append(latitudeDespacho).append(longitudeDespacho).append(indicadorBloqueio).append(numeroDUE).append(situacaoDUE).append(dataSituacaoDUE).append(situacaoCarga).append(uaEmbarque).append(controleAdministrativo).append(codigoRecintoAduaneiroDespacho).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsultarDadosResumidosSchema) == false) {
            return false;
        }
        ConsultarDadosResumidosSchema rhs = ((ConsultarDadosResumidosSchema) other);
        return new EqualsBuilder().append(exportadores, rhs.exportadores).append(responsavelUADespacho, rhs.responsavelUADespacho).append(declarante, rhs.declarante).append(numeroRUC, rhs.numeroRUC).append(uaDespacho, rhs.uaDespacho).append(codigoRecintoAduaneiroEmbarque, rhs.codigoRecintoAduaneiroEmbarque).append(latitudeDespacho, rhs.latitudeDespacho).append(longitudeDespacho, rhs.longitudeDespacho).append(indicadorBloqueio, rhs.indicadorBloqueio).append(numeroDUE, rhs.numeroDUE).append(situacaoDUE, rhs.situacaoDUE).append(dataSituacaoDUE, rhs.dataSituacaoDUE).append(situacaoCarga, rhs.situacaoCarga).append(uaEmbarque, rhs.uaEmbarque).append(controleAdministrativo, rhs.controleAdministrativo).append(codigoRecintoAduaneiroDespacho, rhs.codigoRecintoAduaneiroDespacho).isEquals();
    }

}
