
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Exportador
 * <p>
 * 
 * 
 */
public class Exportador {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("numeroDoDocumento")
    @Expose
    @NotNull
    private String numeroDoDocumento;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("tipoDoDocumento")
    @Expose
    @NotNull
    private String tipoDoDocumento;
    /**
     * Nacionalidade
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("nacionalidade")
    @Expose
    @Valid
    @NotNull
    private Nacionalidade nacionalidade;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("estrangeiro")
    @Expose
    @NotNull
    private Boolean estrangeiro;

    /**
     * 
     * (Required)
     * 
     */
    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public Exportador withNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getTipoDoDocumento() {
        return tipoDoDocumento;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTipoDoDocumento(String tipoDoDocumento) {
        this.tipoDoDocumento = tipoDoDocumento;
    }

    public Exportador withTipoDoDocumento(String tipoDoDocumento) {
        this.tipoDoDocumento = tipoDoDocumento;
        return this;
    }

    /**
     * Nacionalidade
     * <p>
     * 
     * (Required)
     * 
     */
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Nacionalidade
     * <p>
     * 
     * (Required)
     * 
     */
    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Exportador withNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getEstrangeiro() {
        return estrangeiro;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEstrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public Exportador withEstrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numeroDoDocumento", numeroDoDocumento).append("tipoDoDocumento", tipoDoDocumento).append("nacionalidade", nacionalidade).append("estrangeiro", estrangeiro).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tipoDoDocumento).append(estrangeiro).append(nacionalidade).append(numeroDoDocumento).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exportador) == false) {
            return false;
        }
        Exportador rhs = ((Exportador) other);
        return new EqualsBuilder().append(tipoDoDocumento, rhs.tipoDoDocumento).append(estrangeiro, rhs.estrangeiro).append(nacionalidade, rhs.nacionalidade).append(numeroDoDocumento, rhs.numeroDoDocumento).isEquals();
    }

}
