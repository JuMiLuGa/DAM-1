package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void testCalcularDivision() throws Exception {
        Division division = new Division();

        // Prueba caso válido
        float resultado = division.calcularDivision(10, 5);
        assertEquals(2, resultado, 0);

        // Prueba con divisor cero
        try {
            division.calcularDivision(10, 0);
            fail("Se esperaba una excepción.");
        } catch (Exception e) {
            assertEquals("Erro. O divisor non pode ser 0.", e.getMessage());
        }

    }

    @Test
    public void testDividendoCero() throws Exception {
        Division division = new Division();

        float resultado = division.calcularDivision(0, 5);
        assertEquals(0, resultado, 0);
    }

    @Test
    public void testNumerosNegativos() throws Exception {
        Division division = new Division();

        float resultado = division.calcularDivision(-10, 5);
        assertEquals(-2, resultado, 0);

        resultado = division.calcularDivision(10, -5);
        assertEquals(-2, resultado, 0);

        resultado = division.calcularDivision(-10, -5);
        assertEquals(2, resultado, 0);
    }
}