package com.igf.services;

import com.igf.dao.DepartamentoDAO;
import com.igf.entidades.DepartamentoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Christopher on 4/12/2016.
 */

@Service
public class IDepartamentoService implements DepartamentoService{

    @Autowired
    private DepartamentoDAO departamentoDAO;

    @Override
    public List<DepartamentoEntity> getAllDepartamentos() {
        return departamentoDAO.getAllDepartamentos();
    }

    @Override
    public DepartamentoEntity getDepartamentoById(int did) {
        DepartamentoEntity depto = departamentoDAO.getDepartamentoById(did);
        return depto;
    }

    @Override
    public synchronized boolean addDepartamento(DepartamentoEntity depto) {
        if (departamentoDAO.departamentoExists(depto.getNombreDep())){
            return false;
        }else {
            departamentoDAO.addDepartamento(depto);
            return true;
        }
    }

    @Override
    public void updateDepartamento(DepartamentoEntity depto) {
        departamentoDAO.updateDepartamento(depto);
    }

    @Override
    public void deleteDepartamento(int did) {
        departamentoDAO.deleteDepartamento(did);
    }
}
