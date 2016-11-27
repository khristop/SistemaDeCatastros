package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "departamento", schema = "catastro", catalog = "")
public class DepartamentoEntity {
    private int idDep;
    private String nombreDep;

    @Id
    @Column(name = "ID_DEP")
    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    @Basic
    @Column(name = "NOMBRE_DEP")
    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartamentoEntity that = (DepartamentoEntity) o;

        if (idDep != that.idDep) return false;
        if (nombreDep != null ? !nombreDep.equals(that.nombreDep) : that.nombreDep != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDep;
        result = 31 * result + (nombreDep != null ? nombreDep.hashCode() : 0);
        return result;
    }
}
