package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {

    @Test
    public void testCompute() {
        App app = new App();
        int price = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes");
        assertEquals(18, price);
    }

    @Test
    public void testComputeRefacto() {
        AppRefacto app = new AppRefacto();
        int price = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes");
        assertEquals(18, price);
    }

}
