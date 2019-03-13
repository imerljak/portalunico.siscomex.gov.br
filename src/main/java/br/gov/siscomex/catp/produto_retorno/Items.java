
package br.gov.siscomex.catp.produto_retorno;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Items {

    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("erros")
    @Expose
    @Valid
    private List<String> erros = new ArrayList<String>();
    @SerializedName("sucesso")
    @Expose
    private Boolean sucesso;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Items withSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Items withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public Items withErros(List<String> erros) {
        this.erros = erros;
        return this;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    public Items withSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seq", seq).append("codigo", codigo).append("erros", erros).append("sucesso", sucesso).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(erros).append(sucesso).append(seq).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Items) == false) {
            return false;
        }
        Items rhs = ((Items) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(erros, rhs.erros).append(sucesso, rhs.sucesso).append(seq, rhs.seq).isEquals();
    }

}
