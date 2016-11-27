package com.igf.entidades;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "detalle_empresa", schema = "catastro", catalog = "")
public class DetalleEmpresaEntity {
    private int idDetalleemp;
    private Double montoInicioemp;
    private Date fechaIngreso;
    private Date fechaCobro;
    private String estado;
    private String solvencia;
    private String observacion;
    private Integer peridodPago;

    @Id
    @Column(name = "ID_DETALLEEMP")
    public int getIdDetalleemp() {
        return idDetalleemp;
    }

    public void setIdDetalleemp(int idDetalleemp) {
        this.idDetalleemp = idDetalleemp;
    }

    @Basic
    @Column(name = "MONTO_INICIOEMP")
    public Double getMontoInicioemp() {
        return montoInicioemp;
    }

    public void setMontoInicioemp(Double montoInicioemp) {
        this.montoInicioemp = montoInicioemp;
    }

    @Basic
    @Column(name = "FECHA_INGRESO")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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
    @Column(name = "OBSERVACION")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "PERIDOD_PAGO")
    public Integer getPeridodPago() {
        return peridodPago;
    }

    public void setPeridodPago(Integer peridodPago) {
        this.peridodPago = peridodPago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetalleEmpresaEntity that = (DetalleEmpresaEntity) o;

        if (idDetalleemp != that.idDetalleemp) return false;
        if (montoInicioemp != null ? !montoInicioemp.equals(that.montoInicioemp) : that.montoInicioemp != null)
            return false;
        if (fechaIngreso != null ? !fechaIngreso.equals(that.fechaIngreso) : that.fechaIngreso != null) return false;
        if (fechaCobro != null ? !fechaCobro.equals(that.fechaCobro) : that.fechaCobro != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (solvencia != null ? !solvencia.equals(that.solvencia) : that.solvencia != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (peridodPago != null ? !peridodPago.equals(that.peridodPago) : that.peridodPago != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDetalleemp;
        result = 31 * result + (montoInicioemp != null ? montoInicioemp.hashCode() : 0);
        result = 31 * result + (fechaIngreso != null ? fechaIngreso.hashCode() : 0);
        result = 31 * result + (fechaCobro != null ? fechaCobro.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (solvencia != null ? solvencia.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (peridodPago != null ? peridodPago.hashCode() : 0);
        return result;
    }
}
