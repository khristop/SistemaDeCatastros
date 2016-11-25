package com.igf.controller;

import com.igf.dao.CatastroDAO;
import com.igf.model.Catastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by khris on 11-22-16.
 */
@RestController
public class CatastroRestController {


    @Autowired
    private CatastroDAO catastroDAO;


    @GetMapping("/catastro")
    public List<Catastro> getCatastros() {
        return catastroDAO.list();
    }

    @GetMapping("/catastro/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") Long id) {

        Catastro catastro = catastroDAO.get(id);
        if (catastro == null) {
            return new ResponseEntity("No se encontro el catastro con ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(catastro, HttpStatus.OK);
    }

    @PostMapping(value = "/catastro")
    public ResponseEntity createCatastro(@RequestBody Catastro catastro) {

        catastroDAO.create(catastro);

        return new ResponseEntity(catastro, HttpStatus.OK);
    }

    @DeleteMapping("/catastro/{id}")
    public ResponseEntity deletCatastro(@PathVariable Long id) {

        if (null == catastroDAO.delete(id)) {
            return new ResponseEntity("No Catastro found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(id, HttpStatus.OK);

    }

    @PutMapping("/catastro/{id}")
    public ResponseEntity updateCatastro(@PathVariable Long id, @RequestBody Catastro catastro) {

        catastro = catastroDAO.update(id, catastro);

        if (null == catastro) {
            return new ResponseEntity("No Catastro found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(catastro, HttpStatus.OK);
    }

}