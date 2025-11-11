package com.joaodev.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodev.ecommerce.entities.Category;
import com.joaodev.ecommerce.repositories.CategoryRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Category cat1 = new Category(null, "Informática");
        Category cat2 = new Category(null, "Escritório");
        
        categoryRepository.saveAll(Arrays.asList(cat1,cat2));
    }
}
