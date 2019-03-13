
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VeiculoRodoviario {

    @SerializedName("cpjCnpjResponsavel")
    @Expose
    private String cpjCnpjResponsavel;
    @SerializedName("nomeResponsavel")
    @Expose
    private String nomeResponsavel;
    @SerializedName("veiculo")
    @Expose
    private Veiculo veiculo;
    @SerializedName("reboques")
    @Expose
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
        return "VeiculoRodoviario{" +
                "cpjCnpjResponsavel='" + cpjCnpjResponsavel + '\'' +
                ", nomeResponsavel='" + nomeResponsavel + '\'' +
                ", veiculo=" + veiculo +
                ", reboques=" + reboques +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeiculoRodoviario that = (VeiculoRodoviario) o;
        return Objects.equals(cpjCnpjResponsavel, that.cpjCnpjResponsavel) &&
                Objects.equals(nomeResponsavel, that.nomeResponsavel) &&
                Objects.equals(veiculo, that.veiculo) &&
                Objects.equals(reboques, that.reboques);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpjCnpjResponsavel, nomeResponsavel, veiculo, reboques);
    }
}
