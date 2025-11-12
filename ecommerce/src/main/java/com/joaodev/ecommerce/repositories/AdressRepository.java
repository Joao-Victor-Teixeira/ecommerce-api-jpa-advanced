package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long> {

}
