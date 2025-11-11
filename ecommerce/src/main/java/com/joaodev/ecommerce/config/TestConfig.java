package com.joaodev.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodev.ecommerce.entities.Category;
import com.joaodev.ecommerce.entities.Product;
import com.joaodev.ecommerce.repositories.CategoryRepository;
import com.joaodev.ecommerce.repositories.ProductRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Category cat1 = new Category(null, "Informática");
        Category cat2 = new Category(null, "Escritório");
        
        categoryRepository.saveAll(Arrays.asList(cat1, cat2));

        Product p1 = new Product(null, "Computador", 2000.00);
        Product p2 = new Product(null, "Impressora", 800.00);
        Product p3 = new Product(null, "Mouse", 80.00);

        p1.getCategories().add(cat1); 
        
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat2); 

        p3.getCategories().add(cat1);

        productRepository.saveAll(Arrays.asList(p1, p2, p3));
    }
}
