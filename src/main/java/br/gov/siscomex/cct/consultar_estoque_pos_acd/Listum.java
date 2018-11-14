
package br.gov.siscomex.cct.consultar_estoque_pos_acd;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Listum {

    @SerializedName("anoCarga")
    @Expose
    private Integer anoCarga;
    @SerializedName("sequenciaCarga")
    @Expose
    private Integer sequenciaCarga;
    @SerializedName("codigoURF")
    @Expose
    private String codigoURF;
    @SerializedName("codigoRA")
    @Expose
    private String codigoRA;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("idResponsavel")
    @Expose
    private String idResponsavel;
    @SerializedName("nomeResponsavel")
    @Expose
    private String nomeResponsavel;
    @SerializedName("numeroDUE")
    @Expose
    private String numeroDUE;
    @SerializedName("numeroRUC")
    @Expose
    private String numeroRUC;
    @SerializedName("codigoPaisImportador")
    @Expose
    private Integer codigoPaisImportador;
    @SerializedName("nomePaisImportador")
    @Expose
    private String nomePaisImportador;
    @SerializedName("codigoSituacaoEspecial")
    @Expose
    private Integer codigoSituacaoEspecial;
    @SerializedName("nomeSituacaoEspecial")
    @Expose
    private String nomeSituacaoEspecial;
    @SerializedName("existeConteiner")
    @Expose
    private String existeConteiner;
    @SerializedName("situacaoEspecial")
    @Expose
    private String situacaoEspecial;

    public Integer getAnoCarga() {
        return anoCarga;
    }

    public void setAnoCarga(Integer anoCarga) {
        this.anoCarga = anoCarga;
    }

    public Listum withAnoCarga(Integer anoCarga) {
        this.anoCarga = anoCarga;
        return this;
    }

    public Integer getSequenciaCarga() {
        return sequenciaCarga;
    }

    public void setSequenciaCarga(Integer sequenciaCarga) {
        this.sequenciaCarga = sequenciaCarga;
    }

    public Listum withSequenciaCarga(Integer sequenciaCarga) {
        this.sequenciaCarga = sequenciaCarga;
        return this;
    }

    public String getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
    }

    public Listum withCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
        return this;
    }

    public String getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
    }

    public Listum withCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Listum withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Listum withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public Listum withIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
        return this;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Listum withNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
        return this;
    }

    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public Listum withNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
        return this;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public Listum withNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    public Integer getCodigoPaisImportador() {
        return codigoPaisImportador;
    }

    public void setCodigoPaisImportador(Integer codigoPaisImportador) {
        this.codigoPaisImportador = codigoPaisImportador;
    }

    public Listum withCodigoPaisImportador(Integer codigoPaisImportador) {
        this.codigoPaisImportador = codigoPaisImportador;
        return this;
    }

    public String getNomePaisImportador() {
        return nomePaisImportador;
    }

    public void setNomePaisImportador(String nomePaisImportador) {
        this.nomePaisImportador = nomePaisImportador;
    }

    public Listum withNomePaisImportador(String nomePaisImportador) {
        this.nomePaisImportador = nomePaisImportador;
        return this;
    }

    public Integer getCodigoSituacaoEspecial() {
        return codigoSituacaoEspecial;
    }

    public void setCodigoSituacaoEspecial(Integer codigoSituacaoEspecial) {
        this.codigoSituacaoEspecial = codigoSituacaoEspecial;
    }

    public Listum withCodigoSituacaoEspecial(Integer codigoSituacaoEspecial) {
        this.codigoSituacaoEspecial = codigoSituacaoEspecial;
        return this;
    }

    public String getNomeSituacaoEspecial() {
        return nomeSituacaoEspecial;
    }

    public void setNomeSituacaoEspecial(String nomeSituacaoEspecial) {
        this.nomeSituacaoEspecial = nomeSituacaoEspecial;
    }

    public Listum withNomeSituacaoEspecial(String nomeSituacaoEspecial) {
        this.nomeSituacaoEspecial = nomeSituacaoEspecial;
        return this;
    }

    public String getExisteConteiner() {
        return existeConteiner;
    }

    public void setExisteConteiner(String existeConteiner) {
        this.existeConteiner = existeConteiner;
    }

    public Listum withExisteConteiner(String existeConteiner) {
        this.existeConteiner = existeConteiner;
        return this;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public Listum withSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("anoCarga", anoCarga).append("sequenciaCarga", sequenciaCarga).append("codigoURF", codigoURF).append("codigoRA", codigoRA).append("latitude", latitude).append("longitude", longitude).append("idResponsavel", idResponsavel).append("nomeResponsavel", nomeResponsavel).append("numeroDUE", numeroDUE).append("numeroRUC", numeroRUC).append("codigoPaisImportador", codigoPaisImportador).append("nomePaisImportador", nomePaisImportador).append("codigoSituacaoEspecial", codigoSituacaoEspecial).append("nomeSituacaoEspecial", nomeSituacaoEspecial).append("existeConteiner", existeConteiner).append("situacaoEspecial", situacaoEspecial).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigoURF).append(nomeSituacaoEspecial).append(latitude).append(numeroRUC).append(anoCarga).append(nomePaisImportador).append(codigoRA).append(idResponsavel).append(existeConteiner).append(numeroDUE).append(codigoSituacaoEspecial).append(sequenciaCarga).append(situacaoEspecial).append(codigoPaisImportador).append(nomeResponsavel).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listum) == false) {
            return false;
        }
        Listum rhs = ((Listum) other);
        return new EqualsBuilder().append(codigoURF, rhs.codigoURF).append(nomeSituacaoEspecial, rhs.nomeSituacaoEspecial).append(latitude, rhs.latitude).append(numeroRUC, rhs.numeroRUC).append(anoCarga, rhs.anoCarga).append(nomePaisImportador, rhs.nomePaisImportador).append(codigoRA, rhs.codigoRA).append(idResponsavel, rhs.idResponsavel).append(existeConteiner, rhs.existeConteiner).append(numeroDUE, rhs.numeroDUE).append(codigoSituacaoEspecial, rhs.codigoSituacaoEspecial).append(sequenciaCarga, rhs.sequenciaCarga).append(situacaoEspecial, rhs.situacaoEspecial).append(codigoPaisImportador, rhs.codigoPaisImportador).append(nomeResponsavel, rhs.nomeResponsavel).append(longitude, rhs.longitude).isEquals();
    }

}
