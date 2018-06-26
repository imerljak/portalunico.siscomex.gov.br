
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeiculoRodoviario {

    @SerializedName("veiculo")
    @Expose
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
    private Set<Reboque> reboques = new LinkedHashSet<Reboque>();

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Set<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(Set<Reboque> reboques) {
        this.reboques = reboques;
    }

    @Override
    public String toString() {
        return "VeiculoRodoviario{" +
                "veiculo=" + veiculo +
                ", reboques=" + reboques +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VeiculoRodoviario that = (VeiculoRodoviario) o;

        if (veiculo != null ? !veiculo.equals(that.veiculo) : that.veiculo != null) return false;
        return reboques != null ? reboques.equals(that.reboques) : that.reboques == null;
    }

    @Override
    public int hashCode() {
        int result = veiculo != null ? veiculo.hashCode() : 0;
        result = 31 * result + (reboques != null ? reboques.hashCode() : 0);
        return result;
    }
}
