package com.igf.entidades;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "detalle_inmueble", schema = "catastro", catalog = "")
public class DetalleInmuebleEntity {
    private int idDetalle;
    private Date fechaResgistro;
    private String estado;
    private String solvencia;
    private Date fechaCobro;
    private String observacion;
    private Integer periodoPago;

    @Id
    @Column(name = "ID_DETALLE")
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    @Basic
    @Column(name = "FECHA_RESGISTRO")
    public Date getFechaResgistro() {
        return fechaResgistro;
    }

    public void setFechaResgistro(Date fechaResgistro) {
        this.fechaResgistro = fechaResgistro;
    }

    @Basic
    @Column(name = "ESTADO")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "SOLVENCIA")
    public String getSolvencia() {
        return solvencia;
    }

    public void setSolvencia(String solvencia) {
        this.solvencia = solvencia;
    }

    @Basic
    @Column(name = "FECHA_COBRO")
    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    @Basic
    @Column(name = "OBSERVACION")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "PERIODO_PAGO")
    public Integer getPeriodoPago() {
        return periodoPago;
    }

    public void setPeriodoPago(Integer periodoPago) {
        this.periodoPago = periodoPago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetalleInmuebleEntity that = (DetalleInmuebleEntity) o;

        if (idDetalle != that.idDetalle) return false;
        if (fechaResgistro != null ? !fechaResgistro.equals(that.fechaResgistro) : that.fechaResgistro != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (solvencia != null ? !solvencia.equals(that.solvencia) : that.solvencia != null) return false;
        if (fechaCobro != null ? !fechaCobro.equals(that.fechaCobro) : that.fechaCobro != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (periodoPago != null ? !periodoPago.equals(that.periodoPago) : that.periodoPago != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDetalle;
        result = 31 * result + (fechaResgistro != null ? fechaResgistro.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (solvencia != null ? solvencia.hashCode() : 0);
        result = 31 * result + (fechaCobro != null ? fechaCobro.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (periodoPago != null ? periodoPago.hashCode() : 0);
        return result;
    }
}
