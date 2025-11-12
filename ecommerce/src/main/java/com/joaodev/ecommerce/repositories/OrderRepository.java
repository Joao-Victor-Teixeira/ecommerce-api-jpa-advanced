package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
