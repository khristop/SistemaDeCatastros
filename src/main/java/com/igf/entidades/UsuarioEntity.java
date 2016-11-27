package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "usuario", schema = "catastro", catalog = "")
public class UsuarioEntity {
    private int idUser;
    private Integer idAlcandia;
    private Integer idRol;
    private String nombreUser;

    @Id
    @Column(name = "ID_USER")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "ID_ALCANDIA")
    public Integer getIdAlcandia() {
        return idAlcandia;
    }

    public void setIdAlcandia(Integer idAlcandia) {
        this.idAlcandia = idAlcandia;
    }

    @Basic
    @Column(name = "ID_ROL")
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "NOMBRE_USER")
    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        if (idUser != that.idUser) return false;
        if (idAlcandia != null ? !idAlcandia.equals(that.idAlcandia) : that.idAlcandia != null) return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (nombreUser != null ? !nombreUser.equals(that.nombreUser) : that.nombreUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (idAlcandia != null ? idAlcandia.hashCode() : 0);
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (nombreUser != null ? nombreUser.hashCode() : 0);
        return result;
    }
}
