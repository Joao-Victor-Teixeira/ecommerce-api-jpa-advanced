package com.joaodev.ecommerce.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodev.ecommerce.entities.Adress;
import com.joaodev.ecommerce.entities.CardPayment;
import com.joaodev.ecommerce.entities.Category;
import com.joaodev.ecommerce.entities.City;
import com.joaodev.ecommerce.entities.Client;
import com.joaodev.ecommerce.entities.Order;
import com.joaodev.ecommerce.entities.OrderItem;
import com.joaodev.ecommerce.entities.Payment;
import com.joaodev.ecommerce.entities.PaymentBankSlip;
import com.joaodev.ecommerce.entities.Product;
import com.joaodev.ecommerce.entities.State;
import com.joaodev.ecommerce.entities.enums.ClientType;
import com.joaodev.ecommerce.entities.enums.PaymentStatus;
import com.joaodev.ecommerce.repositories.AdressRepository;
import com.joaodev.ecommerce.repositories.CategoryRepository;
import com.joaodev.ecommerce.repositories.CityRepository;
import com.joaodev.ecommerce.repositories.ClientRepository;
import com.joaodev.ecommerce.repositories.OrderItemRepository;
import com.joaodev.ecommerce.repositories.OrderRepository;
import com.joaodev.ecommerce.repositories.PaymentRepository;
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

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AdressRepository adressRepository;

    @Autowired OrderRepository orderRepository;

    @Autowired PaymentRepository paymentRepository;

    @Autowired OrderItemRepository orderItemRepository;

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

        Client cli1 = new Client(null, "Maria Silva", "maria@gmail.com", "36378912377", ClientType.INDIVIDUAL);
        cli1.getTelephones().addAll(Arrays.asList("27363323", "93838393"));

        Adress a1 = new Adress(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
        Adress a2 = new Adress(null, "Av Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);

        cli1.getAdresses().add(a1);
        cli1.getAdresses().add(a2);

        clientRepository.saveAll(Arrays.asList(cli1));
        adressRepository.saveAll(Arrays.asList(a1, a2));

       Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), cli1, a1);
       Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), cli1, a2);

       Payment pay1 = new CardPayment(null, PaymentStatus.PAID, o1, 6);
       o1.setPayment(pay1);

       Payment pay2 = new PaymentBankSlip(null, PaymentStatus.PENDING, o2, Instant.parse("2019-08-12T00:00:00Z"), null);
       o2.setPayment(pay2);

       cli1.getOrders().add(o1);
       cli1.getOrders().add(o2);

       orderRepository.saveAll(Arrays.asList(o1, o2));

       paymentRepository.saveAll(Arrays.asList(pay1, pay2));

       OrderItem oi1 = new OrderItem(o1, p1, 0.00, 1, 2000.00);
       OrderItem oi2 = new OrderItem(o1, p3, 0.00, 2, 80.00);
       OrderItem oi3 = new OrderItem(o2, p2, 100.00, 1, 800.00);

       o1.getIntems().add(oi1);
       o1.getIntems().add(oi2);

       o2.getIntems().add(oi3);

       p1.getItems().addAll(Arrays.asList(oi1));
       p2.getItems().addAll(Arrays.asList(oi3));
       p3.getItems().addAll(Arrays.asList(oi2));

       orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3));
    }
}
