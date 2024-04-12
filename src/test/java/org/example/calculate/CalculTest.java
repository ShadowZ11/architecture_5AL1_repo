package org.example.calculate;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class CalculTest extends TestCase {


    @Test
    public void testCalculateAddition() {
        int result = Calcul.calculate(5, 3, "+");
        assertEquals(8, result);
    }

    @Test
    public void testCalculateMultiplication() {
        int result = Calcul.calculate(5, 3, "*");
        assertEquals(15, result);
    }

    @Test
    public void testCalculateInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> Calcul.calculate(5, 3, "-"));
    }
}