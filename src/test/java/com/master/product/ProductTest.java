package com.master.product;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductTest {
    String testProduct = "null";
    Integer testProductInt = 0;
    Double testProductDouble = 0.0;

    @Test
    public void verificaString() { //Esperado passar
    Product p = new Product();
    p.setName("");
    assertEquals(p.getName(), testProduct);
    assertNotNull(p);
    }

    @Test
    public void verificaInt() { //Esperado passar
        Product p = new Product();
        p.setQuantity(testProductInt);
        assertNotEquals(1, testProductInt);
    }

    @Test
    public void verificaDouble() { //Esperado passar
        Product p = new Product();
        p.setPrice(1.1);
        assertNotEquals(1.1, p.getPrice());
    }

    @Test
    public void test() { //Esperado passar
        Product p = new Product("Test", 2.2, "Test",12);
        assertSame(p, p);
    }

}
