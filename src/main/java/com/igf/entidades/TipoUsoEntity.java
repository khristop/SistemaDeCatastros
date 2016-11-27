package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "tipo_uso", schema = "catastro", catalog = "")
public class TipoUsoEntity {
    private int idUso;
    private String nombreUso;
    private String descripcion;

    @Id
    @Column(name = "ID_USO")
    public int getIdUso() {
        return idUso;
    }

    public void setIdUso(int idUso) {
        this.idUso = idUso;
    }

    @Basic
    @Column(name = "NOMBRE_USO")
    public String getNombreUso() {
        return nombreUso;
    }

    public void setNombreUso(String nombreUso) {
        this.nombreUso = nombreUso;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoUsoEntity that = (TipoUsoEntity) o;

        if (idUso != that.idUso) return false;
        if (nombreUso != null ? !nombreUso.equals(that.nombreUso) : that.nombreUso != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUso;
        result = 31 * result + (nombreUso != null ? nombreUso.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
