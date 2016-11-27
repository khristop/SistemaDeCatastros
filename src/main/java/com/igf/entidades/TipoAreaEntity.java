package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "tipo_area", schema = "catastro", catalog = "")
public class TipoAreaEntity {
    private int idArea;
    private String nombreArea;

    @Id
    @Column(name = "ID_AREA")
    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    @Basic
    @Column(name = "NOMBRE_AREA")
    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoAreaEntity that = (TipoAreaEntity) o;

        if (idArea != that.idArea) return false;
        if (nombreArea != null ? !nombreArea.equals(that.nombreArea) : that.nombreArea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArea;
        result = 31 * result + (nombreArea != null ? nombreArea.hashCode() : 0);
        return result;
    }
}
