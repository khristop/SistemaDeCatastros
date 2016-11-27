package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "propietario", schema = "catastro", catalog = "")
public class PropietarioEntity {
    private int idRecidente;
    private Integer idInmueble;
    private Integer idTipo;
    private Integer idPropietario;
    private String nombreRecidente;
    private Integer edad;
    private String sexo;
    private Integer duiPropietario;
    private Integer nit;
    private String direccion;

    @Id
    @Column(name = "ID_RECIDENTE")
    public int getIdRecidente() {
        return idRecidente;
    }

    public void setIdRecidente(int idRecidente) {
        this.idRecidente = idRecidente;
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
    @Column(name = "ID_TIPO")
    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    @Basic
    @Column(name = "ID_PROPIETARIO")
    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Basic
    @Column(name = "NOMBRE_RECIDENTE")
    public String getNombreRecidente() {
        return nombreRecidente;
    }

    public void setNombreRecidente(String nombreRecidente) {
        this.nombreRecidente = nombreRecidente;
    }

    @Basic
    @Column(name = "EDAD")
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "SEXO")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "DUI_PROPIETARIO")
    public Integer getDuiPropietario() {
        return duiPropietario;
    }

    public void setDuiPropietario(Integer duiPropietario) {
        this.duiPropietario = duiPropietario;
    }

    @Basic
    @Column(name = "NIT")
    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    @Basic
    @Column(name = "DIRECCION")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropietarioEntity that = (PropietarioEntity) o;

        if (idRecidente != that.idRecidente) return false;
        if (idInmueble != null ? !idInmueble.equals(that.idInmueble) : that.idInmueble != null) return false;
        if (idTipo != null ? !idTipo.equals(that.idTipo) : that.idTipo != null) return false;
        if (idPropietario != null ? !idPropietario.equals(that.idPropietario) : that.idPropietario != null)
            return false;
        if (nombreRecidente != null ? !nombreRecidente.equals(that.nombreRecidente) : that.nombreRecidente != null)
            return false;
        if (edad != null ? !edad.equals(that.edad) : that.edad != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (duiPropietario != null ? !duiPropietario.equals(that.duiPropietario) : that.duiPropietario != null)
            return false;
        if (nit != null ? !nit.equals(that.nit) : that.nit != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRecidente;
        result = 31 * result + (idInmueble != null ? idInmueble.hashCode() : 0);
        result = 31 * result + (idTipo != null ? idTipo.hashCode() : 0);
        result = 31 * result + (idPropietario != null ? idPropietario.hashCode() : 0);
        result = 31 * result + (nombreRecidente != null ? nombreRecidente.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (duiPropietario != null ? duiPropietario.hashCode() : 0);
        result = 31 * result + (nit != null ? nit.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        return result;
    }
}
