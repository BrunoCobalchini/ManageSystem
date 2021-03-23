package com.master.product;


import org.junit.Test;

public class ProductTest {
    String testProduct = "null";
    Integer testProductInt = 0;
    Double testProductDouble = 0.0;

    @Test
    public void verificaString() { //Esperado passar
    Product p = new Product();
    p.setName("");
    }

    @Test
    public void verificaInt() { //Esperado passar
        Product p = new Product();
        p.setQuantity(1212);
    }

    @Test
    public void verificaDouble() { //Esperado passar
        Product p = new Product();
        p.setPrice(1);
    }

    @Test
    public void test() { //Esperado passar
        Product p = new Product("Test", 2.2, "Test",12, "Test");
    }

    @Test
    public static void testAssets() { //Esperado passar

    }
}
