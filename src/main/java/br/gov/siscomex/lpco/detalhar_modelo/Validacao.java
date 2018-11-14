
package br.gov.siscomex.lpco.detalhar_modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Validacao {

    @SerializedName("obrigatorio")
    @Expose
    private Boolean obrigatorio;
    @SerializedName("permiteMultiplosValores")
    @Expose
    private Boolean permiteMultiplosValores;
    @SerializedName("mascara")
    @Expose
    private String mascara;
    @SerializedName("tamanhoMaximo")
    @Expose
    private Integer tamanhoMaximo;
    @SerializedName("qtdCasasDecimais")
    @Expose
    private Integer qtdCasasDecimais;

    public Boolean getObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public Validacao withObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
        return this;
    }

    public Boolean getPermiteMultiplosValores() {
        return permiteMultiplosValores;
    }

    public void setPermiteMultiplosValores(Boolean permiteMultiplosValores) {
        this.permiteMultiplosValores = permiteMultiplosValores;
    }

    public Validacao withPermiteMultiplosValores(Boolean permiteMultiplosValores) {
        this.permiteMultiplosValores = permiteMultiplosValores;
        return this;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Validacao withMascara(String mascara) {
        this.mascara = mascara;
        return this;
    }

    public Integer getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public Validacao withTamanhoMaximo(Integer tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        return this;
    }

    public Integer getQtdCasasDecimais() {
        return qtdCasasDecimais;
    }

    public void setQtdCasasDecimais(Integer qtdCasasDecimais) {
        this.qtdCasasDecimais = qtdCasasDecimais;
    }

    public Validacao withQtdCasasDecimais(Integer qtdCasasDecimais) {
        this.qtdCasasDecimais = qtdCasasDecimais;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("obrigatorio", obrigatorio).append("permiteMultiplosValores", permiteMultiplosValores).append("mascara", mascara).append("tamanhoMaximo", tamanhoMaximo).append("qtdCasasDecimais", qtdCasasDecimais).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(permiteMultiplosValores).append(qtdCasasDecimais).append(obrigatorio).append(mascara).append(tamanhoMaximo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Validacao) == false) {
            return false;
        }
        Validacao rhs = ((Validacao) other);
        return new EqualsBuilder().append(permiteMultiplosValores, rhs.permiteMultiplosValores).append(qtdCasasDecimais, rhs.qtdCasasDecimais).append(obrigatorio, rhs.obrigatorio).append(mascara, rhs.mascara).append(tamanhoMaximo, rhs.tamanhoMaximo).isEquals();
    }

}
