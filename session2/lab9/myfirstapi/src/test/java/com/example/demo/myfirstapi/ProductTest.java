package com.example.demo.myfirstapi;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

public class ProductTest {
    Product productWithoutId;
    Product productWithId;

    @BeforeEach
    @DisplayName("Create new product Popcorn and Burger")
    void setUp() {
        productWithoutId = new Product("Popcorn", 50.00);
        productWithId = new Product(1011L, "Burger", 75.00);
    }

    @Test
    @DisplayName("Test for getting product Id")
    void shouldGetProductId() {
        assertNull(productWithoutId.getId());

        long actualWithId = productWithId.getId();
        long expectedWithId = 1011L;
        assertEquals(expectedWithId, actualWithId);
    }

    @Test
    @DisplayName("Test for getting product name")
    void shouldGetProductName() {
        String actualWithoutIdName = productWithoutId.getName();
        String expectedWithoutIdName = "Popcorn";
        assertEquals(expectedWithoutIdName, actualWithoutIdName);

        String actualWithIdName = productWithId.getName();
        String expectedWithIdName = "Burger";
        assertEquals(expectedWithIdName, actualWithIdName);
    }

    @Test
    @DisplayName("Test for getting product price")
    void shouldGetProductPrice() {
        double actualWithoutIdPrice = productWithoutId.getPrice();
        double expectedWithoutIdPrice = 50.00;
        assertEquals(expectedWithoutIdPrice, actualWithoutIdPrice, 0.0001);

        double actualWithIdPrice = productWithId.getPrice();
        double expectedWithIdPrice = 75.00;
        assertEquals(expectedWithIdPrice, actualWithIdPrice, 0.0001);
    }

    @Test
    @DisplayName("Test for setting product Id")
    void shouldSetProductId() {
        long newProductId = 5055L;
        productWithoutId.setId(newProductId);

        long actualProductId = productWithoutId.getId();
        assertEquals(newProductId, actualProductId);
    }

    @Test
    @DisplayName("Test for setting product name")
    void shouldSetProductName() {
        String newProductName = "Water Bottle";
        productWithId.setName(newProductName);

        String actualProductName = productWithId.getName();
        assertEquals(newProductName, actualProductName);
    }

    @Test
    @DisplayName("Test for setting product price")
    void shouldSetProductPrice() {
        double newProductPrice = 100.00;
        productWithId.setPrice(newProductPrice);

        double actualProductPrice = productWithId.getPrice();
        assertEquals(newProductPrice, actualProductPrice);
    }

    @Test
    @DisplayName("Test for getting product toString() method")
    void shouldGetCorrectProductToString() {
        String actualProductToString = productWithId.toString();
        String expectedProductToString = "Product{id=1011, name='Burger', price=75.0}";

        assertEquals(expectedProductToString, actualProductToString);
    }

    @Test
    @DisplayName("Test to get correct object equation")
    void shouldGetCorrectObjectEquals() {
        Product expectedProduct = new Product(1011L, "Burger", 75.00);

        assertTrue(productWithId.equals(expectedProduct));
    }

    @Test
    @DisplayName("Test to get correct object hashcode")
    void shouldGetCorrectHashCode() {
        int actualHashCode = productWithId.hashCode();
        int expectedHashCode = Objects.hash(1011L, "Burger", 75.00);

        assertEquals(expectedHashCode, actualHashCode);
    }
}
