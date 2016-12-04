package com.igf.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "departamento", schema = "catastro")
public class DepartamentoEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID_DEP")
    private int idDep;

    @Column(name = "NOMBRE_DEP")
    private String nombreDep;

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }


    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }
}
