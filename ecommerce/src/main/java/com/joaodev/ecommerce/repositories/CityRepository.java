package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
