package com.example.demo.myfirstapi;

import com.example.demo.myfirstapi.model.Product;
import com.example.demo.myfirstapi.repository.ProductRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {
    ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    @DisplayName("Test to check repository has data on initialization")
    void repositoryHasProducts() {
        List<Product> expectedProductsList = new ArrayList<>();
        final AtomicLong nextId = new AtomicLong(1);
        expectedProductsList.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        expectedProductsList.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        expectedProductsList.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));

        List<Product> actualProductsList = productRepository.findAll();

        assertEquals(expectedProductsList, actualProductsList);
    }

    @Test
    @DisplayName("Test to get the product by Id")
    void shouldGetCorrectProductById() {
        Optional<Product> expectedProduct = Optional.of(new Product(1L, "Laptop", 1200.00));
        Optional<Product> actualProduct = productRepository.findById(1L);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    @DisplayName("Test to add new product")
    void shouldAddNewProduct() {
        Product newProduct = new Product("Burger", 75.00);
        productRepository.save(newProduct);

        Optional<Product> actualProduct = productRepository.findById(4L);
        assertTrue(actualProduct.isPresent());
    }

    @Test
    @DisplayName("Test to update existing product")
    void shouldUpdateExistingProduct() {
        String newProductName = "Phone";
        double newProductPrice = 500.00;
        long existingProductId = 1L;

        Product newProduct = new Product(existingProductId, newProductName, newProductPrice);
        productRepository.save(newProduct);

        Optional<Product> newActualProduct = productRepository.findById(existingProductId);
        assertEquals(newProductName, newActualProduct.get().getName());
        assertEquals(newProductPrice, newActualProduct.get().getPrice());
    }
}
