package com.igf.hibernate;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "calificacion_servicio", schema = "catastro", catalog = "")
public class CalificacionServicioEntity {
    private int idCalificacion;
    private Double montoServicio;

    @Id
    @Column(name = "ID_CALIFICACION")
    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    @Basic
    @Column(name = "MONTO_SERVICIO")
    public Double getMontoServicio() {
        return montoServicio;
    }

    public void setMontoServicio(Double montoServicio) {
        this.montoServicio = montoServicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CalificacionServicioEntity that = (CalificacionServicioEntity) o;

        if (idCalificacion != that.idCalificacion) return false;
        if (montoServicio != null ? !montoServicio.equals(that.montoServicio) : that.montoServicio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCalificacion;
        result = 31 * result + (montoServicio != null ? montoServicio.hashCode() : 0);
        return result;
    }
}
