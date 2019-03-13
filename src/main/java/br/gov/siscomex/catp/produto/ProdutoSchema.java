
package br.gov.siscomex.catp.produto;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProdutoSchema {

    @SerializedName("items")
    @Expose
    @Valid
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ProdutoSchema withItems(Items items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("items", items).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(items).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProdutoSchema) == false) {
            return false;
        }
        ProdutoSchema rhs = ((ProdutoSchema) other);
        return new EqualsBuilder().append(items, rhs.items).isEquals();
    }

}
