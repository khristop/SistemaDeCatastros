package com.igf.dao;

import com.igf.entidades.DepartamentoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Christopher on 4/12/2016.
 */
@Transactional
@Repository
public class IDepartamentoDAO implements DepartamentoDAO{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public DepartamentoEntity getDepartamentoById(int did) {
        return hibernateTemplate.get(DepartamentoEntity.class, did);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<DepartamentoEntity> getAllDepartamentos() {
        String dq1 = "FROM DepartamentoEntity as dep ORDER BY dep.id";
        return (List<DepartamentoEntity>) hibernateTemplate.find(dq1);
    }

    @Override
    public boolean addDepartamento(DepartamentoEntity depto) {
        hibernateTemplate.save(depto);
        return false;
    }

    @Override
    public void updateDepartamento(DepartamentoEntity depto) {
        DepartamentoEntity dep = getDepartamentoById(depto.getIdDep());
        dep.setNombreDep(depto.getNombreDep());
        hibernateTemplate.update(dep);
    }

    @Override
    public void deleteDepartamento(int did) {
        hibernateTemplate.delete(getDepartamentoById(did));
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean departamentoExists(String name) {
        String dq1 = "FROM departamento as dep WHERE dep.id = ?";
        List<DepartamentoEntity> departamentos = (List<DepartamentoEntity>) hibernateTemplate.find(dq1, name);
        return departamentos.size() > 0 ? true : false;
    }
}
