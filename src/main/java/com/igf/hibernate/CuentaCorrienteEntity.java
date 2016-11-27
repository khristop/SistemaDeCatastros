package com.igf.hibernate;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "cuenta_corriente", schema = "catastro", catalog = "")
public class CuentaCorrienteEntity {
    private int idCuenta;
    private Integer idInmueble;
    private Integer idTasa;
    private String nombreCuentac;
    private String descripcionc;

    @Id
    @Column(name = "ID_CUENTA")
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Basic
    @Column(name = "ID_INMUEBLE")
    public Integer getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Integer idInmueble) {
        this.idInmueble = idInmueble;
    }

    @Basic
    @Column(name = "ID_TASA")
    public Integer getIdTasa() {
        return idTasa;
    }

    public void setIdTasa(Integer idTasa) {
        this.idTasa = idTasa;
    }

    @Basic
    @Column(name = "NOMBRE_CUENTAC")
    public String getNombreCuentac() {
        return nombreCuentac;
    }

    public void setNombreCuentac(String nombreCuentac) {
        this.nombreCuentac = nombreCuentac;
    }

    @Basic
    @Column(name = "DESCRIPCIONC")
    public String getDescripcionc() {
        return descripcionc;
    }

    public void setDescripcionc(String descripcionc) {
        this.descripcionc = descripcionc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuentaCorrienteEntity that = (CuentaCorrienteEntity) o;

        if (idCuenta != that.idCuenta) return false;
        if (idInmueble != null ? !idInmueble.equals(that.idInmueble) : that.idInmueble != null) return false;
        if (idTasa != null ? !idTasa.equals(that.idTasa) : that.idTasa != null) return false;
        if (nombreCuentac != null ? !nombreCuentac.equals(that.nombreCuentac) : that.nombreCuentac != null)
            return false;
        if (descripcionc != null ? !descripcionc.equals(that.descripcionc) : that.descripcionc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCuenta;
        result = 31 * result + (idInmueble != null ? idInmueble.hashCode() : 0);
        result = 31 * result + (idTasa != null ? idTasa.hashCode() : 0);
        result = 31 * result + (nombreCuentac != null ? nombreCuentac.hashCode() : 0);
        result = 31 * result + (descripcionc != null ? descripcionc.hashCode() : 0);
        return result;
    }
}
