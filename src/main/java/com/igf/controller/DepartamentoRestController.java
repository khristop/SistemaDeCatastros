package com.igf.controller;

import com.igf.entidades.DepartamentoEntity;
import com.igf.services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

/**
 * Created by Christopher on 4/12/2016.
 */
@Controller
@RequestMapping("/rest")
public class DepartamentoRestController {

    @Autowired
    private IDepartamentoService departamentoService;

    @RequestMapping(value = "/departamento", method = RequestMethod.GET)
    public ResponseEntity<List<DepartamentoEntity>> getAllDepartamentos(){
        List<DepartamentoEntity> list = departamentoService.getAllDepartamentos();
        return new ResponseEntity<List<DepartamentoEntity>>(list, HttpStatus.OK);
    }
}
