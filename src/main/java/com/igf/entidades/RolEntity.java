package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "rol", schema = "catastro", catalog = "")
public class RolEntity {
    private int idRol;
    private String nombreRol;
    private String descripcionRol;

    @Id
    @Column(name = "ID_ROL")
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "NOMBRE_ROL")
    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Basic
    @Column(name = "DESCRIPCION_ROL")
    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolEntity rolEntity = (RolEntity) o;

        if (idRol != rolEntity.idRol) return false;
        if (nombreRol != null ? !nombreRol.equals(rolEntity.nombreRol) : rolEntity.nombreRol != null) return false;
        if (descripcionRol != null ? !descripcionRol.equals(rolEntity.descripcionRol) : rolEntity.descripcionRol != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRol;
        result = 31 * result + (nombreRol != null ? nombreRol.hashCode() : 0);
        result = 31 * result + (descripcionRol != null ? descripcionRol.hashCode() : 0);
        return result;
    }
}
