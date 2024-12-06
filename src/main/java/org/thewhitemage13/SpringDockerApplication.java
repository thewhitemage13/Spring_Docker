package org.thewhitemage13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thewhitemage13.entity.Product;
import org.thewhitemage13.repository.ProductRepository;

import java.util.List;

@SpringBootApplication
public class SpringDockerApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "name");
        productRepository.save(product);

        List<Product> products = productRepository.findAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
