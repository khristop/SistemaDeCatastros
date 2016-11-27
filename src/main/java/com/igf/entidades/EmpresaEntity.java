package com.igf.entidades;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Christopher on 27/11/2016.
 */
@Entity
@Table(name = "empresa", schema = "catastro", catalog = "")
public class EmpresaEntity {
    private int idEmpresa;
    private Integer idInmueble;
    private Integer idCierre;
    private Integer idDetalleemp;
    private String nombreEmpresa;
    private Double balancesInicial;
    private String direccion;
    private Date fecharRegistro;
    private String razonSocial;
    private Integer nitEmpresa;

    @Id
    @Column(name = "ID_EMPRESA")
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
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
    @Column(name = "ID_CIERRE")
    public Integer getIdCierre() {
        return idCierre;
    }

    public void setIdCierre(Integer idCierre) {
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
    @Column(name = "NOMBRE_EMPRESA")
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Basic
    @Column(name = "BALANCES_INICIAL")
    public Double getBalancesInicial() {
        return balancesInicial;
    }

    public void setBalancesInicial(Double balancesInicial) {
        this.balancesInicial = balancesInicial;
    }

    @Basic
    @Column(name = "DIRECCION")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "FECHAR_REGISTRO")
    public Date getFecharRegistro() {
        return fecharRegistro;
    }

    public void setFecharRegistro(Date fecharRegistro) {
        this.fecharRegistro = fecharRegistro;
    }

    @Basic
    @Column(name = "RAZON_SOCIAL")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "NIT_EMPRESA")
    public Integer getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Integer nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpresaEntity that = (EmpresaEntity) o;

        if (idEmpresa != that.idEmpresa) return false;
        if (idInmueble != null ? !idInmueble.equals(that.idInmueble) : that.idInmueble != null) return false;
        if (idCierre != null ? !idCierre.equals(that.idCierre) : that.idCierre != null) return false;
        if (idDetalleemp != null ? !idDetalleemp.equals(that.idDetalleemp) : that.idDetalleemp != null) return false;
        if (nombreEmpresa != null ? !nombreEmpresa.equals(that.nombreEmpresa) : that.nombreEmpresa != null)
            return false;
        if (balancesInicial != null ? !balancesInicial.equals(that.balancesInicial) : that.balancesInicial != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (fecharRegistro != null ? !fecharRegistro.equals(that.fecharRegistro) : that.fecharRegistro != null)
            return false;
        if (razonSocial != null ? !razonSocial.equals(that.razonSocial) : that.razonSocial != null) return false;
        if (nitEmpresa != null ? !nitEmpresa.equals(that.nitEmpresa) : that.nitEmpresa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmpresa;
        result = 31 * result + (idInmueble != null ? idInmueble.hashCode() : 0);
        result = 31 * result + (idCierre != null ? idCierre.hashCode() : 0);
        result = 31 * result + (idDetalleemp != null ? idDetalleemp.hashCode() : 0);
        result = 31 * result + (nombreEmpresa != null ? nombreEmpresa.hashCode() : 0);
        result = 31 * result + (balancesInicial != null ? balancesInicial.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (fecharRegistro != null ? fecharRegistro.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (nitEmpresa != null ? nitEmpresa.hashCode() : 0);
        return result;
    }
}
