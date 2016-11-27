package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "tipo_propietario", schema = "catastro", catalog = "")
public class TipoPropietarioEntity {
    private int idTipo;
    private String nombreTipo;
    private String descripcion;

    @Id
    @Column(name = "ID_TIPO")
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    @Basic
    @Column(name = "NOMBRE_TIPO")
    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoPropietarioEntity that = (TipoPropietarioEntity) o;

        if (idTipo != that.idTipo) return false;
        if (nombreTipo != null ? !nombreTipo.equals(that.nombreTipo) : that.nombreTipo != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipo;
        result = 31 * result + (nombreTipo != null ? nombreTipo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
