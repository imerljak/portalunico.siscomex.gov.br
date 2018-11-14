
package br.gov.siscomex.lpco.incluir_exigencia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class IncluirExigenciaSchema {

    @SerializedName("justificativa")
    @Expose
    private String justificativa;

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public IncluirExigenciaSchema withJustificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("justificativa", justificativa).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(justificativa).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncluirExigenciaSchema) == false) {
            return false;
        }
        IncluirExigenciaSchema rhs = ((IncluirExigenciaSchema) other);
        return new EqualsBuilder().append(justificativa, rhs.justificativa).isEquals();
    }

}
