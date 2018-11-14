
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Ncm
 * <p>
 * 
 * 
 */
public class Ncm {

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
    @SerializedName("descricao")
    @Expose
    @NotNull
    private String descricao;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("unidadeMedidaEstatistica")
    @Expose
    @NotNull
    private String unidadeMedidaEstatistica;

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

    public Ncm withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Ncm withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getUnidadeMedidaEstatistica() {
        return unidadeMedidaEstatistica;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
    }

    public Ncm withUnidadeMedidaEstatistica(String unidadeMedidaEstatistica) {
        this.unidadeMedidaEstatistica = unidadeMedidaEstatistica;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("descricao", descricao).append("unidadeMedidaEstatistica", unidadeMedidaEstatistica).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unidadeMedidaEstatistica).append(codigo).append(descricao).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ncm) == false) {
            return false;
        }
        Ncm rhs = ((Ncm) other);
        return new EqualsBuilder().append(unidadeMedidaEstatistica, rhs.unidadeMedidaEstatistica).append(codigo, rhs.codigo).append(descricao, rhs.descricao).isEquals();
    }

}
