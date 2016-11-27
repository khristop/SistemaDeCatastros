package com.igf.hibernate;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "cierre_operacion", schema = "catastro", catalog = "")
public class CierreOperacionEntity {
    private int idCierre;
    private Integer idDetalleemp;
    private Date fechaCierre;
    private String motivo;

    @Id
    @Column(name = "ID_CIERRE")
    public int getIdCierre() {
        return idCierre;
    }

    public void setIdCierre(int idCierre) {
        this.idCierre = idCierre;
    }

    @Basic
    @Column(name = "ID_DETALLEEMP")
    public Integer getIdDetalleemp() {
        return idDetalleemp;
    }

    public void setIdDetalleemp(Integer idDetalleemp) {
        this.idDetalleemp = idDetalleemp;
    }

    @Basic
    @Column(name = "FECHA_CIERRE")
    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    @Basic
    @Column(name = "MOTIVO")
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CierreOperacionEntity that = (CierreOperacionEntity) o;

        if (idCierre != that.idCierre) return false;
        if (idDetalleemp != null ? !idDetalleemp.equals(that.idDetalleemp) : that.idDetalleemp != null) return false;
        if (fechaCierre != null ? !fechaCierre.equals(that.fechaCierre) : that.fechaCierre != null) return false;
        if (motivo != null ? !motivo.equals(that.motivo) : that.motivo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCierre;
        result = 31 * result + (idDetalleemp != null ? idDetalleemp.hashCode() : 0);
        result = 31 * result + (fechaCierre != null ? fechaCierre.hashCode() : 0);
        result = 31 * result + (motivo != null ? motivo.hashCode() : 0);
        return result;
    }
}
