package com.joaodev.ecommerce.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaodev.ecommerce.entities.Adress;
import com.joaodev.ecommerce.services.AdressService;

@RestController
@RequestMapping(value = "/adresses")
public class AdressResource {

    @Autowired
    private AdressService service;

    @GetMapping
    public ResponseEntity<List<Adress>> findAll(){
        List<Adress> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Adress> findById(@PathVariable Long id){
        Adress obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
