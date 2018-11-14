
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EventosDoHistorico
 * <p>
 * 
 * 
 */
public class EventosDoHistorico {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("evento")
    @Expose
    @NotNull
    private String evento;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("responsavel")
    @Expose
    @NotNull
    private String responsavel;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("dataEHoraDoEvento")
    @Expose
    @NotNull
    private String dataEHoraDoEvento;

    /**
     * 
     * (Required)
     * 
     */
    public String getEvento() {
        return evento;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEvento(String evento) {
        this.evento = evento;
    }

    public EventosDoHistorico withEvento(String evento) {
        this.evento = evento;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public EventosDoHistorico withResponsavel(String responsavel) {
        this.responsavel = responsavel;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getDataEHoraDoEvento() {
        return dataEHoraDoEvento;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDataEHoraDoEvento(String dataEHoraDoEvento) {
        this.dataEHoraDoEvento = dataEHoraDoEvento;
    }

    public EventosDoHistorico withDataEHoraDoEvento(String dataEHoraDoEvento) {
        this.dataEHoraDoEvento = dataEHoraDoEvento;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("evento", evento).append("responsavel", responsavel).append("dataEHoraDoEvento", dataEHoraDoEvento).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataEHoraDoEvento).append(evento).append(responsavel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventosDoHistorico) == false) {
            return false;
        }
        EventosDoHistorico rhs = ((EventosDoHistorico) other);
        return new EqualsBuilder().append(dataEHoraDoEvento, rhs.dataEHoraDoEvento).append(evento, rhs.evento).append(responsavel, rhs.responsavel).isEquals();
    }

}
