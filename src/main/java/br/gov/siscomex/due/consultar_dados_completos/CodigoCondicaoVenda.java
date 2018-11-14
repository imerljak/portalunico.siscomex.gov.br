
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RecintoAduaneiroDeDespacho
 * <p>
 * 
 * 
 */
public class CodigoCondicaoVenda {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("codigo")
    @Expose
    @NotNull
    private String codigo;

    /**
     * 
     * (Required)
     * 
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public CodigoCondicaoVenda withCodigo(String codigo) {
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
        if ((other instanceof CodigoCondicaoVenda) == false) {
            return false;
        }
        CodigoCondicaoVenda rhs = ((CodigoCondicaoVenda) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).isEquals();
    }

}
