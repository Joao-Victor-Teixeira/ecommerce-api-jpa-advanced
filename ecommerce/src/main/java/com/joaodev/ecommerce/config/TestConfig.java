package com.joaodev.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodev.ecommerce.entities.Category;
import com.joaodev.ecommerce.entities.City;
import com.joaodev.ecommerce.entities.Product;
import com.joaodev.ecommerce.entities.State;
import com.joaodev.ecommerce.repositories.CategoryRepository;
import com.joaodev.ecommerce.repositories.CityRepository;
import com.joaodev.ecommerce.repositories.ProductRepository;
import com.joaodev.ecommerce.repositories.StateRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private StateRepository stateRepository;

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


        State est1 = new State(null, "Minas Gerais");
        State est2 = new State(null, "São Paulo");

        stateRepository.saveAll(Arrays.asList(est1, est2));

        City c1 = new City(null, "Uberlândia", est1);
        City c2 = new City(null, "São Paulo", est2);
        City c3 = new City(null, "Campinas", est2);

        est1.getCities().add(c1);
        est2.getCities().add(c2);
        est2.getCities().add(c3);

        cityRepository.saveAll(Arrays.asList(c1, c2, c3));

    }
}
