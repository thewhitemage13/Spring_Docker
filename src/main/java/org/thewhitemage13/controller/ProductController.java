package org.thewhitemage13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thewhitemage13.entity.Product;
import org.thewhitemage13.repository.ProductRepository;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    private Logger logger = Logger.getLogger(ProductController.class.getName());

    @Cacheable(value = "allProducts")
    @GetMapping
    public List<Product> getProducts() {
        logger.info("database info");
        return productRepository.findAll();
    }
}
