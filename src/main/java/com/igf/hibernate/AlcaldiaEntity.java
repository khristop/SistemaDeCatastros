package com.igf.hibernate;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "alcaldia", schema = "catastro", catalog = "")
public class AlcaldiaEntity {
    private int idAlcandia;
    private Integer idInmueble;
    private Integer idMun;
    private String nombreAlcaldia;

    @Id
    @Column(name = "ID_ALCANDIA")
    public int getIdAlcandia() {
        return idAlcandia;
    }

    public void setIdAlcandia(int idAlcandia) {
        this.idAlcandia = idAlcandia;
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
    @Column(name = "ID_MUN")
    public Integer getIdMun() {
        return idMun;
    }

    public void setIdMun(Integer idMun) {
        this.idMun = idMun;
    }

    @Basic
    @Column(name = "NOMBRE_ALCALDIA")
    public String getNombreAlcaldia() {
        return nombreAlcaldia;
    }

    public void setNombreAlcaldia(String nombreAlcaldia) {
        this.nombreAlcaldia = nombreAlcaldia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlcaldiaEntity that = (AlcaldiaEntity) o;

        if (idAlcandia != that.idAlcandia) return false;
        if (idInmueble != null ? !idInmueble.equals(that.idInmueble) : that.idInmueble != null) return false;
        if (idMun != null ? !idMun.equals(that.idMun) : that.idMun != null) return false;
        if (nombreAlcaldia != null ? !nombreAlcaldia.equals(that.nombreAlcaldia) : that.nombreAlcaldia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAlcandia;
        result = 31 * result + (idInmueble != null ? idInmueble.hashCode() : 0);
        result = 31 * result + (idMun != null ? idMun.hashCode() : 0);
        result = 31 * result + (nombreAlcaldia != null ? nombreAlcaldia.hashCode() : 0);
        return result;
    }
}
