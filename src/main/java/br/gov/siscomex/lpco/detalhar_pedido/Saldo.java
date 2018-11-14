
package br.gov.siscomex.lpco.detalhar_pedido;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Saldo {

    @SerializedName("saldoQuantidadeComercial")
    @Expose
    private Double saldoQuantidadeComercial;
    @SerializedName("saldoQuantidadeEstatistica")
    @Expose
    private Double saldoQuantidadeEstatistica;
    @SerializedName("saldoVMLE")
    @Expose
    private Double saldoVMLE;
    @SerializedName("saldoPesoLiquido")
    @Expose
    private Double saldoPesoLiquido;
    @SerializedName("saldoValorFinanciado")
    @Expose
    private Double saldoValorFinanciado;
    @SerializedName("saldoValorCondicaoVenda")
    @Expose
    private Double saldoValorCondicaoVenda;

    public Double getSaldoQuantidadeComercial() {
        return saldoQuantidadeComercial;
    }

    public void setSaldoQuantidadeComercial(Double saldoQuantidadeComercial) {
        this.saldoQuantidadeComercial = saldoQuantidadeComercial;
    }

    public Saldo withSaldoQuantidadeComercial(Double saldoQuantidadeComercial) {
        this.saldoQuantidadeComercial = saldoQuantidadeComercial;
        return this;
    }

    public Double getSaldoQuantidadeEstatistica() {
        return saldoQuantidadeEstatistica;
    }

    public void setSaldoQuantidadeEstatistica(Double saldoQuantidadeEstatistica) {
        this.saldoQuantidadeEstatistica = saldoQuantidadeEstatistica;
    }

    public Saldo withSaldoQuantidadeEstatistica(Double saldoQuantidadeEstatistica) {
        this.saldoQuantidadeEstatistica = saldoQuantidadeEstatistica;
        return this;
    }

    public Double getSaldoVMLE() {
        return saldoVMLE;
    }

    public void setSaldoVMLE(Double saldoVMLE) {
        this.saldoVMLE = saldoVMLE;
    }

    public Saldo withSaldoVMLE(Double saldoVMLE) {
        this.saldoVMLE = saldoVMLE;
        return this;
    }

    public Double getSaldoPesoLiquido() {
        return saldoPesoLiquido;
    }

    public void setSaldoPesoLiquido(Double saldoPesoLiquido) {
        this.saldoPesoLiquido = saldoPesoLiquido;
    }

    public Saldo withSaldoPesoLiquido(Double saldoPesoLiquido) {
        this.saldoPesoLiquido = saldoPesoLiquido;
        return this;
    }

    public Double getSaldoValorFinanciado() {
        return saldoValorFinanciado;
    }

    public void setSaldoValorFinanciado(Double saldoValorFinanciado) {
        this.saldoValorFinanciado = saldoValorFinanciado;
    }

    public Saldo withSaldoValorFinanciado(Double saldoValorFinanciado) {
        this.saldoValorFinanciado = saldoValorFinanciado;
        return this;
    }

    public Double getSaldoValorCondicaoVenda() {
        return saldoValorCondicaoVenda;
    }

    public void setSaldoValorCondicaoVenda(Double saldoValorCondicaoVenda) {
        this.saldoValorCondicaoVenda = saldoValorCondicaoVenda;
    }

    public Saldo withSaldoValorCondicaoVenda(Double saldoValorCondicaoVenda) {
        this.saldoValorCondicaoVenda = saldoValorCondicaoVenda;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("saldoQuantidadeComercial", saldoQuantidadeComercial).append("saldoQuantidadeEstatistica", saldoQuantidadeEstatistica).append("saldoVMLE", saldoVMLE).append("saldoPesoLiquido", saldoPesoLiquido).append("saldoValorFinanciado", saldoValorFinanciado).append("saldoValorCondicaoVenda", saldoValorCondicaoVenda).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(saldoVMLE).append(saldoValorFinanciado).append(saldoQuantidadeEstatistica).append(saldoQuantidadeComercial).append(saldoValorCondicaoVenda).append(saldoPesoLiquido).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Saldo) == false) {
            return false;
        }
        Saldo rhs = ((Saldo) other);
        return new EqualsBuilder().append(saldoVMLE, rhs.saldoVMLE).append(saldoValorFinanciado, rhs.saldoValorFinanciado).append(saldoQuantidadeEstatistica, rhs.saldoQuantidadeEstatistica).append(saldoQuantidadeComercial, rhs.saldoQuantidadeComercial).append(saldoValorCondicaoVenda, rhs.saldoValorCondicaoVenda).append(saldoPesoLiquido, rhs.saldoPesoLiquido).isEquals();
    }

}
