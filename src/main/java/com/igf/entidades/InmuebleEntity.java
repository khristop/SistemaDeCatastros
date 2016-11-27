package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "inmueble", schema = "catastro", catalog = "")
public class InmuebleEntity {
    private int idInmueble;
    private Integer idUso;
    private Integer idDetalle;
    private Integer idCalificacion;
    private String nombreInmueble;
    private String sector;
    private String mapa;
    private String parcela;
    private String indice;
    private String tamano;

    @Id
    @Column(name = "ID_INMUEBLE")
    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    @Basic
    @Column(name = "ID_USO")
    public Integer getIdUso() {
        return idUso;
    }

    public void setIdUso(Integer idUso) {
        this.idUso = idUso;
    }

    @Basic
    @Column(name = "ID_DETALLE")
    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    @Basic
    @Column(name = "ID_CALIFICACION")
    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    @Basic
    @Column(name = "NOMBRE_INMUEBLE")
    public String getNombreInmueble() {
        return nombreInmueble;
    }

    public void setNombreInmueble(String nombreInmueble) {
        this.nombreInmueble = nombreInmueble;
    }

    @Basic
    @Column(name = "SECTOR")
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Basic
    @Column(name = "MAPA")
    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    @Basic
    @Column(name = "PARCELA")
    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "INDICE")
    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    @Basic
    @Column(name = "TAMANO")
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InmuebleEntity that = (InmuebleEntity) o;

        if (idInmueble != that.idInmueble) return false;
        if (idUso != null ? !idUso.equals(that.idUso) : that.idUso != null) return false;
        if (idDetalle != null ? !idDetalle.equals(that.idDetalle) : that.idDetalle != null) return false;
        if (idCalificacion != null ? !idCalificacion.equals(that.idCalificacion) : that.idCalificacion != null)
            return false;
        if (nombreInmueble != null ? !nombreInmueble.equals(that.nombreInmueble) : that.nombreInmueble != null)
            return false;
        if (sector != null ? !sector.equals(that.sector) : that.sector != null) return false;
        if (mapa != null ? !mapa.equals(that.mapa) : that.mapa != null) return false;
        if (parcela != null ? !parcela.equals(that.parcela) : that.parcela != null) return false;
        if (indice != null ? !indice.equals(that.indice) : that.indice != null) return false;
        if (tamano != null ? !tamano.equals(that.tamano) : that.tamano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idInmueble;
        result = 31 * result + (idUso != null ? idUso.hashCode() : 0);
        result = 31 * result + (idDetalle != null ? idDetalle.hashCode() : 0);
        result = 31 * result + (idCalificacion != null ? idCalificacion.hashCode() : 0);
        result = 31 * result + (nombreInmueble != null ? nombreInmueble.hashCode() : 0);
        result = 31 * result + (sector != null ? sector.hashCode() : 0);
        result = 31 * result + (mapa != null ? mapa.hashCode() : 0);
        result = 31 * result + (parcela != null ? parcela.hashCode() : 0);
        result = 31 * result + (indice != null ? indice.hashCode() : 0);
        result = 31 * result + (tamano != null ? tamano.hashCode() : 0);
        return result;
    }
}
