
package br.gov.siscomex.cct.consultar_due_ruc;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ListaGranei {

    @SerializedName("tipoGranel")
    @Expose
    private Integer tipoGranel;
    @SerializedName("sgUnidadeMedida")
    @Expose
    private ListaGranei.SgUnidadeMedida sgUnidadeMedida;
    @SerializedName("quantidade")
    @Expose
    private Double quantidade;

    public Integer getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(Integer tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public ListaGranei withTipoGranel(Integer tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }

    public ListaGranei.SgUnidadeMedida getSgUnidadeMedida() {
        return sgUnidadeMedida;
    }

    public void setSgUnidadeMedida(ListaGranei.SgUnidadeMedida sgUnidadeMedida) {
        this.sgUnidadeMedida = sgUnidadeMedida;
    }

    public ListaGranei withSgUnidadeMedida(ListaGranei.SgUnidadeMedida sgUnidadeMedida) {
        this.sgUnidadeMedida = sgUnidadeMedida;
        return this;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public ListaGranei withQuantidade(Double quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tipoGranel", tipoGranel).append("sgUnidadeMedida", sgUnidadeMedida).append("quantidade", quantidade).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sgUnidadeMedida).append(quantidade).append(tipoGranel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListaGranei) == false) {
            return false;
        }
        ListaGranei rhs = ((ListaGranei) other);
        return new EqualsBuilder().append(sgUnidadeMedida, rhs.sgUnidadeMedida).append(quantidade, rhs.quantidade).append(tipoGranel, rhs.tipoGranel).isEquals();
    }

    public enum SgUnidadeMedida {

        @SerializedName("kg")
        KG("kg"),
        @SerializedName("m3")
        M_3("m3");
        private final String value;
        private final static Map<String, ListaGranei.SgUnidadeMedida> CONSTANTS = new HashMap<String, ListaGranei.SgUnidadeMedida>();

        static {
            for (ListaGranei.SgUnidadeMedida c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SgUnidadeMedida(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ListaGranei.SgUnidadeMedida fromValue(String value) {
            ListaGranei.SgUnidadeMedida constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
