package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "actividad_economica", schema = "catastro", catalog = "")
public class ActividadEconomicaEntity {
    private int idActividad;
    private Integer idEmpresa;
    private String nombreActividad;
    private String descripcion;

    @Id
    @Column(name = "ID_ACTIVIDAD")
    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    @Basic
    @Column(name = "ID_EMPRESA")
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Basic
    @Column(name = "NOMBRE_ACTIVIDAD")
    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
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

        ActividadEconomicaEntity that = (ActividadEconomicaEntity) o;

        if (idActividad != that.idActividad) return false;
        if (idEmpresa != null ? !idEmpresa.equals(that.idEmpresa) : that.idEmpresa != null) return false;
        if (nombreActividad != null ? !nombreActividad.equals(that.nombreActividad) : that.nombreActividad != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActividad;
        result = 31 * result + (idEmpresa != null ? idEmpresa.hashCode() : 0);
        result = 31 * result + (nombreActividad != null ? nombreActividad.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
