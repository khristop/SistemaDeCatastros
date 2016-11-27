package com.igf.entidades;

import javax.persistence.*;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "propietario_inmueble", schema = "catastro", catalog = "")
public class PropietarioInmuebleEntity {
    private int idPropietario;
    private String escritura;

    @Id
    @Column(name = "ID_PROPIETARIO")
    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Basic
    @Column(name = "ESCRITURA")
    public String getEscritura() {
        return escritura;
    }

    public void setEscritura(String escritura) {
        this.escritura = escritura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropietarioInmuebleEntity that = (PropietarioInmuebleEntity) o;

        if (idPropietario != that.idPropietario) return false;
        if (escritura != null ? !escritura.equals(that.escritura) : that.escritura != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPropietario;
        result = 31 * result + (escritura != null ? escritura.hashCode() : 0);
        return result;
    }
}
