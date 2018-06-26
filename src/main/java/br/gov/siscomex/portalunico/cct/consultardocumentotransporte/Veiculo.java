
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import java.util.LinkedHashSet;
import java.util.Set;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Veiculo {

    @SerializedName("nomeCondutor")
    @Expose
    private String nomeCondutor;
    @SerializedName("cpfCondutor")
    @Expose
    private String cpfCondutor;
    @SerializedName("documentoCondutor")
    @Expose
    private String documentoCondutor;
    @SerializedName("placa")
    @Expose
    private String placa;
    @SerializedName("tara")
    @Expose
    private Double tara;
    @SerializedName("lacres")
    @Expose
    private Set<String> lacres = new LinkedHashSet<String>();

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getCpfCondutor() {
        return cpfCondutor;
    }

    public void setCpfCondutor(String cpfCondutor) {
        this.cpfCondutor = cpfCondutor;
    }

    public String getDocumentoCondutor() {
        return documentoCondutor;
    }

    public void setDocumentoCondutor(String documentoCondutor) {
        this.documentoCondutor = documentoCondutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Set<String> getLacres() {
        return lacres;
    }

    public void setLacres(Set<String> lacres) {


        this.lacres = lacres;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nomeCondutor='" + nomeCondutor + '\'' +
                ", cpfCondutor='" + cpfCondutor + '\'' +
                ", documentoCondutor='" + documentoCondutor + '\'' +
                ", placa='" + placa + '\'' +
                ", tara=" + tara +
                ", lacres=" + lacres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veiculo veiculo = (Veiculo) o;

        if (nomeCondutor != null ? !nomeCondutor.equals(veiculo.nomeCondutor) : veiculo.nomeCondutor != null)
            return false;
        if (cpfCondutor != null ? !cpfCondutor.equals(veiculo.cpfCondutor) : veiculo.cpfCondutor != null) return false;
        if (documentoCondutor != null ? !documentoCondutor.equals(veiculo.documentoCondutor) : veiculo.documentoCondutor != null)
            return false;
        if (placa != null ? !placa.equals(veiculo.placa) : veiculo.placa != null) return false;
        if (tara != null ? !tara.equals(veiculo.tara) : veiculo.tara != null) return false;
        return lacres != null ? lacres.equals(veiculo.lacres) : veiculo.lacres == null;
    }

    @Override
    public int hashCode() {
        int result = nomeCondutor != null ? nomeCondutor.hashCode() : 0;
        result = 31 * result + (cpfCondutor != null ? cpfCondutor.hashCode() : 0);
        result = 31 * result + (documentoCondutor != null ? documentoCondutor.hashCode() : 0);
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        result = 31 * result + (tara != null ? tara.hashCode() : 0);
        result = 31 * result + (lacres != null ? lacres.hashCode() : 0);
        return result;
    }
}
