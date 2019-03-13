
package br.gov.siscomex.cct.consultar_documento_transporte_especifico;

import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class VeiculoRodoviario {

    @SerializedName("cpjCnpjResponsavel")
    @Expose
    private String cpjCnpjResponsavel;
    @SerializedName("nomeResponsavel")
    @Expose
    private String nomeResponsavel;
    @SerializedName("veiculo")
    @Expose
    @Valid
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
    @Valid
    private List<Reboque> reboques = null;

    public String getCpjCnpjResponsavel() {
        return cpjCnpjResponsavel;
    }

    public void setCpjCnpjResponsavel(String cpjCnpjResponsavel) {
        this.cpjCnpjResponsavel = cpjCnpjResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(List<Reboque> reboques) {
        this.reboques = reboques;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cpjCnpjResponsavel", cpjCnpjResponsavel).append("nomeResponsavel", nomeResponsavel).append("veiculo", veiculo).append("reboques", reboques).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nomeResponsavel).append(cpjCnpjResponsavel).append(reboques).append(veiculo).toHashCode();
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
        return new EqualsBuilder().append(nomeResponsavel, rhs.nomeResponsavel).append(cpjCnpjResponsavel, rhs.cpjCnpjResponsavel).append(reboques, rhs.reboques).append(veiculo, rhs.veiculo).isEquals();
    }

}
