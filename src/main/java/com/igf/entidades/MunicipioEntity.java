package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "municipio", schema = "catastro", catalog = "")
public class MunicipioEntity {
    private int idMun;
    private Integer idDep;
    private String nombreMun;

    @Id
    @Column(name = "ID_MUN")
    public int getIdMun() {
        return idMun;
    }

    public void setIdMun(int idMun) {
        this.idMun = idMun;
    }

    @Basic
    @Column(name = "ID_DEP")
    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    @Basic
    @Column(name = "NOMBRE_MUN")
    public String getNombreMun() {
        return nombreMun;
    }

    public void setNombreMun(String nombreMun) {
        this.nombreMun = nombreMun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MunicipioEntity that = (MunicipioEntity) o;

        if (idMun != that.idMun) return false;
        if (idDep != null ? !idDep.equals(that.idDep) : that.idDep != null) return false;
        if (nombreMun != null ? !nombreMun.equals(that.nombreMun) : that.nombreMun != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMun;
        result = 31 * result + (idDep != null ? idDep.hashCode() : 0);
        result = 31 * result + (nombreMun != null ? nombreMun.hashCode() : 0);
        return result;
    }
}
