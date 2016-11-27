package com.igf.entidades;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "tasa_impuesto", schema = "catastro", catalog = "")
public class TasaImpuestoEntity {
    private int idTasa;
    private Integer idArea;
    private String rango;
    private Date fechaCreacion;
    private Double montoPagar;

    @Id
    @Column(name = "ID_TASA")
    public int getIdTasa() {
        return idTasa;
    }

    public void setIdTasa(int idTasa) {
        this.idTasa = idTasa;
    }

    @Basic
    @Column(name = "ID_AREA")
    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    @Basic
    @Column(name = "RANGO")
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Basic
    @Column(name = "FECHA_CREACION")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "MONTO_PAGAR")
    public Double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(Double montoPagar) {
        this.montoPagar = montoPagar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasaImpuestoEntity that = (TasaImpuestoEntity) o;

        if (idTasa != that.idTasa) return false;
        if (idArea != null ? !idArea.equals(that.idArea) : that.idArea != null) return false;
        if (rango != null ? !rango.equals(that.rango) : that.rango != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (montoPagar != null ? !montoPagar.equals(that.montoPagar) : that.montoPagar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTasa;
        result = 31 * result + (idArea != null ? idArea.hashCode() : 0);
        result = 31 * result + (rango != null ? rango.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (montoPagar != null ? montoPagar.hashCode() : 0);
        return result;
    }
}
