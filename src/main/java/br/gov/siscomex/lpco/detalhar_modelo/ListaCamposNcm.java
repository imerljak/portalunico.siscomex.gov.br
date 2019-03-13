
package br.gov.siscomex.lpco.detalhar_modelo;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaCamposNcm {

    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("tipo")
    @Expose
    private ListaCamposNcm.Tipo tipo;
    @SerializedName("validacao")
    @Expose
    @Valid
    private Validacao_ validacao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ListaCamposNcm withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaCamposNcm withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ListaCamposNcm.Tipo getTipo() {
        return tipo;
    }

    public void setTipo(ListaCamposNcm.Tipo tipo) {
        this.tipo = tipo;
    }

    public ListaCamposNcm withTipo(ListaCamposNcm.Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public Validacao_ getValidacao() {
        return validacao;
    }

    public void setValidacao(Validacao_ validacao) {
        this.validacao = validacao;
    }

    public ListaCamposNcm withValidacao(Validacao_ validacao) {
        this.validacao = validacao;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codigo", codigo).append("nome", nome).append("tipo", tipo).append("validacao", validacao).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(nome).append(tipo).append(validacao).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaCamposNcm) == false) {
            return false;
        }
        ListaCamposNcm rhs = ((ListaCamposNcm) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(nome, rhs.nome).append(tipo, rhs.tipo).append(validacao, rhs.validacao).isEquals();
    }

    public enum Tipo {

        @SerializedName("BOOLEANO")
        BOOLEANO("BOOLEANO"),
        @SerializedName("DATA")
        DATA("DATA"),
        @SerializedName("DATA_HORA")
        DATA_HORA("DATA_HORA"),
        @SerializedName("NUMERO_INTEIRO")
        NUMERO_INTEIRO("NUMERO_INTEIRO"),
        @SerializedName("NUMERO_REAL")
        NUMERO_REAL("NUMERO_REAL"),
        @SerializedName("TEXTO")
        TEXTO("TEXTO");
        private final String value;
        private final static Map<String, ListaCamposNcm.Tipo> CONSTANTS = new HashMap<String, ListaCamposNcm.Tipo>();

        static {
            for (ListaCamposNcm.Tipo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Tipo(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ListaCamposNcm.Tipo fromValue(String value) {
            ListaCamposNcm.Tipo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
