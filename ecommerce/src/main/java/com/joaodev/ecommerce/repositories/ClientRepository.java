package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
