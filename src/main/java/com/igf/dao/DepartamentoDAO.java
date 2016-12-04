package com.igf.dao;

import com.igf.entidades.DepartamentoEntity;

import java.util.List;

/**
 * Created by Christopher on 28/11/2016.
 */
public interface DepartamentoDAO {
    List<DepartamentoEntity> getAllDepartamentos();
    DepartamentoEntity getDepartamentoById(int did);
    boolean addDepartamento(DepartamentoEntity depto);
    void updateDepartamento(DepartamentoEntity depto);
    void deleteDepartamento(int did);
    boolean departamentoExists(String name);
}
