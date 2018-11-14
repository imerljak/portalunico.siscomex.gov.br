
package br.gov.siscomex.cct.consultar_documento_transporte;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class VeiculoRodoviario {

    @SerializedName("veiculo")
    @Expose
    @Valid
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
    @Valid
    private Set<Reboque> reboques = new LinkedHashSet<Reboque>();

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public VeiculoRodoviario withVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        return this;
    }

    public Set<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(Set<Reboque> reboques) {
        this.reboques = reboques;
    }

    public VeiculoRodoviario withReboques(Set<Reboque> reboques) {
        this.reboques = reboques;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("veiculo", veiculo).append("reboques", reboques).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(veiculo).append(reboques).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VeiculoRodoviario) == false) {
            return false;
        }
        VeiculoRodoviario rhs = ((VeiculoRodoviario) other);
        return new EqualsBuilder().append(veiculo, rhs.veiculo).append(reboques, rhs.reboques).isEquals();
    }

}
