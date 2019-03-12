
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import java.util.List;
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

}
