package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
