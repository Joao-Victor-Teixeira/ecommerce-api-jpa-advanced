package com.joaodev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
