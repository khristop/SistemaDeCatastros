package com.igf.controller;

import com.igf.entidades.DepartamentoEntity;
import com.igf.services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;


import java.util.List;

/**
 * Created by Christopher on 4/12/2016.
 */
@Controller
@RequestMapping("/rest")
public class DepartamentoRestController {

    @Autowired
    private IDepartamentoService departamentoService;

    //obtener todos
    @RequestMapping(value = "/departamento", method = RequestMethod.GET)
    public ResponseEntity<List<DepartamentoEntity>> getAllDepartamentos(){
        List<DepartamentoEntity> list = departamentoService.getAllDepartamentos();
        return new ResponseEntity<List<DepartamentoEntity>>(list, HttpStatus.OK);
    }

    //obtener por id
    @RequestMapping(value = "/departamento/{id}", method = RequestMethod.GET)
    public ResponseEntity<DepartamentoEntity> getDepartamentoById(@PathVariable("id") Integer id){
        DepartamentoEntity departamento = departamentoService.getDepartamentoById(id);
        return new ResponseEntity<DepartamentoEntity>(departamento, HttpStatus.OK);
    }

    //agregar nuevo
    @RequestMapping(value = "/departamento", method = RequestMethod.POST)
    public ResponseEntity<Void> agregarDepartamento(@RequestBody DepartamentoEntity departamento, UriComponentsBuilder builder){
        System.out.println("hola que : " + departamento.getNombreDep());
        boolean bandera = departamentoService.addDepartamento(departamento);
        if (bandera == false ){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/rest/departamento/{id}").buildAndExpand(departamento.getIdDep()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //actualizar
    @RequestMapping(value = "/departamento/{id}", method = RequestMethod.PUT)
    public ResponseEntity<DepartamentoEntity> actualizarDepartamento(@RequestBody DepartamentoEntity departamento){
        departamentoService.updateDepartamento(departamento);
        return new ResponseEntity<DepartamentoEntity>(departamento, HttpStatus.OK);
    }

    //borrar
    @RequestMapping(value = "/departamento/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> eliminarDepartamento(@PathVariable("id") Integer id){
        departamentoService.deleteDepartamento(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
