package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
