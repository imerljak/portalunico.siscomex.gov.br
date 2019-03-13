
package br.gov.siscomex.portalunico.cct.consultardocumentotransporteespecifico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Urf {

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

    @Override
    public String toString() {
        return "Urf{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Urf urf = (Urf) o;
        return Objects.equals(codigo, urf.codigo) &&
                Objects.equals(descricao, urf.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricao);
    }
}
