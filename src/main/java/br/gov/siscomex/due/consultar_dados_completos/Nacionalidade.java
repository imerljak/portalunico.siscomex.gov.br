
package br.gov.siscomex.due.consultar_dados_completos;

import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Nacionalidade
 * <p>
 * 
 * 
 */
public class Nacionalidade {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("codigo")
    @Expose
    @NotNull
    private Integer codigo;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("nome")
    @Expose
    @NotNull
    private String nome;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("nomeResumido")
    @Expose
    @NotNull
    private String nomeResumido;

    /**
     * 
     * (Required)
     * 
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Nacionalidade withCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nacionalidade withNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getNomeResumido() {
        return nomeResumido;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setNomeResumido(String nomeResumido) {
        this.nomeResumido = nomeResumido;
    }

    public Nacionalidade withNomeResumido(String nomeResumido) {
        this.nomeResumido = nomeResumido;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("nome", nome).append("nomeResumido", nomeResumido).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(nome).append(nomeResumido).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nacionalidade) == false) {
            return false;
        }
        Nacionalidade rhs = ((Nacionalidade) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(nome, rhs.nome).append(nomeResumido, rhs.nomeResumido).isEquals();
    }

}
