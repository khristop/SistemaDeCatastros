package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "servicio", schema = "catastro", catalog = "")
public class ServicioEntity {
    private int idServicio;
    private Integer idCalificacion;
    private String nombreServicio;
    private String descripcionServicio;

    @Id
    @Column(name = "ID_SERVICIO")
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
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
    @Column(name = "NOMBRE_SERVICIO")
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    @Basic
    @Column(name = "DESCRIPCION_SERVICIO")
    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServicioEntity that = (ServicioEntity) o;

        if (idServicio != that.idServicio) return false;
        if (idCalificacion != null ? !idCalificacion.equals(that.idCalificacion) : that.idCalificacion != null)
            return false;
        if (nombreServicio != null ? !nombreServicio.equals(that.nombreServicio) : that.nombreServicio != null)
            return false;
        if (descripcionServicio != null ? !descripcionServicio.equals(that.descripcionServicio) : that.descripcionServicio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idServicio;
        result = 31 * result + (idCalificacion != null ? idCalificacion.hashCode() : 0);
        result = 31 * result + (nombreServicio != null ? nombreServicio.hashCode() : 0);
        result = 31 * result + (descripcionServicio != null ? descripcionServicio.hashCode() : 0);
        return result;
    }
}
