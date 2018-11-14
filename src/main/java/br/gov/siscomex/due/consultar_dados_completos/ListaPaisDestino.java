
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Moeda
 * <p>
 * 
 * 
 */
public class ListaPaisDestino {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("codigo")
    @Expose
    @NotNull
    private Integer codigo;

    /**
     * 
     * (Required)
     * 
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ListaPaisDestino withCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaPaisDestino) == false) {
            return false;
        }
        ListaPaisDestino rhs = ((ListaPaisDestino) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).isEquals();
    }

}
