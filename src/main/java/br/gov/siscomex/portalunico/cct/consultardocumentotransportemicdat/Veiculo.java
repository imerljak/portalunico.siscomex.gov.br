
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import java.util.List;
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

}
