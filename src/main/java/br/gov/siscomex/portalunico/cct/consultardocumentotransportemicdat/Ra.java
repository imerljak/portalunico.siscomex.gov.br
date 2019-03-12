
package br.gov.siscomex.portalunico.cct.consultardocumentotransportemicdat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ra {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("descricao")
    @Expose
    private String descricao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
