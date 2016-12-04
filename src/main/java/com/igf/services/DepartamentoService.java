package com.igf.services;

import com.igf.entidades.DepartamentoEntity;

import java.util.List;

/**
 * Created by Christopher on 4/12/2016.
 */
public interface DepartamentoService {
    List<DepartamentoEntity> getAllDepartamentos();
    DepartamentoEntity getDepartamentoById(int did);
    boolean addDepartamento(DepartamentoEntity depto);
    void updateDepartamento(DepartamentoEntity depto);
    void deleteDepartamento(int did);

}
