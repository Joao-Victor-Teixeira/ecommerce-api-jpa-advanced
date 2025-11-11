package com.joaodev.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaodev.ecommerce.entities.City;
import com.joaodev.ecommerce.repositories.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public List<City> findAll(){
        return repository.findAll();
    }

    public City findById(Long id){
        Optional<City> obj = repository.findById(id);
        return obj.get();
    }
}
