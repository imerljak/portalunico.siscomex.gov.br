
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import java.util.List;
import java.util.Objects;

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
    private List<String> lacres = null;

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

    public List<String> getLacres() {
        return lacres;
    }

    public void setLacres(List<String> lacres) {
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
        return Objects.equals(nomeCondutor, veiculo.nomeCondutor) &&
                Objects.equals(cpfCondutor, veiculo.cpfCondutor) &&
                Objects.equals(documentoCondutor, veiculo.documentoCondutor) &&
                Objects.equals(placa, veiculo.placa) &&
                Objects.equals(tara, veiculo.tara) &&
                Objects.equals(lacres, veiculo.lacres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCondutor, cpfCondutor, documentoCondutor, placa, tara, lacres);
    }
}
