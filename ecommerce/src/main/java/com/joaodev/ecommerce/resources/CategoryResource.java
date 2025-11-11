package com.joaodev.ecommerce.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaodev.ecommerce.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<Category> findAll(){
        Category cat = new Category(1L, "Informática");
        return ResponseEntity.ok().body(cat);
    }
}
