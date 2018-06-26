
package br.gov.siscomex.portalunico.cct.consultardocumentotransporte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mensagem {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("mensagem")
    @Expose
    private String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "codigo='" + codigo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mensagem mensagem = (Mensagem) o;

        if (codigo != null ? !codigo.equals(mensagem.codigo) : mensagem.codigo != null) return false;
        return this.mensagem != null ? this.mensagem.equals(mensagem.mensagem) : mensagem.mensagem == null;
    }

    @Override
    public int hashCode() {
        int result = codigo != null ? codigo.hashCode() : 0;
        result = 31 * result + (mensagem != null ? mensagem.hashCode() : 0);
        return result;
    }
}
