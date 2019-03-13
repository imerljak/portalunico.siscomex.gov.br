
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IdentificacaoDoEmitente
 * <p>
 * 
 * 
 */
public class IdentificacaoDoEmitente {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("numero")
    @Expose
    @NotNull
    private String numero;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("cnpj")
    @Expose
    @NotNull
    private Boolean cnpj;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("cpf")
    @Expose
    @NotNull
    private Boolean cpf;

    /**
     * 
     * (Required)
     * 
     */
    public String getNumero() {
        return numero;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public IdentificacaoDoEmitente withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getCnpj() {
        return cnpj;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCnpj(Boolean cnpj) {
        this.cnpj = cnpj;
    }

    public IdentificacaoDoEmitente withCnpj(Boolean cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Boolean getCpf() {
        return cpf;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCpf(Boolean cpf) {
        this.cpf = cpf;
    }

    public IdentificacaoDoEmitente withCpf(Boolean cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numero", numero).append("cnpj", cnpj).append("cpf", cpf).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cpf).append(cnpj).append(numero).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentificacaoDoEmitente) == false) {
            return false;
        }
        IdentificacaoDoEmitente rhs = ((IdentificacaoDoEmitente) other);
        return new EqualsBuilder().append(cpf, rhs.cpf).append(cnpj, rhs.cnpj).append(numero, rhs.numero).isEquals();
    }

}
