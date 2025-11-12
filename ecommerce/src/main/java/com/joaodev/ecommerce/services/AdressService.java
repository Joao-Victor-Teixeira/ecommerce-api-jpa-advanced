package com.joaodev.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaodev.ecommerce.entities.Adress;
import com.joaodev.ecommerce.repositories.AdressRepository;

@Service
public class AdressService {

    @Autowired
    private AdressRepository repository;

    public List<Adress> findAll(){
        return repository.findAll();
    }

    public Adress findById(Long id){
        Optional<Adress> obj = repository.findById(id);
        return obj.get();
    }
}
