package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersoaTest {
    
    @Test(expected = AssertionError.class)
    public void testIdadeNegativa1() {
        Persoa p = new Persoa(-1);
        p.isMaiorDeIdade();
    }

    @Test(expected = AssertionError.class)
    public void testIdadeNegativa2() {
        Persoa p = new Persoa(Integer.MIN_VALUE);
        p.isMaiorDeIdade();
    }

    @Test
    public void testIdadeMenorde18_1() {
        Persoa p = new Persoa(0);
        assertFalse(p.isMaiorDeIdade());
    }

    @Test
    public void testIdadeMenorde18_2() {
        Persoa p = new Persoa(17);
        assertFalse(p.isMaiorDeIdade());
    }

    @Test
    public void testIdadeMaiorDe18_1() {
        Persoa p = new Persoa(18);
        assertTrue(p.isMaiorDeIdade());
    }

    @Test
    public void testIdadeMaiorDe18_2() {
        Persoa p = new Persoa(Integer.MAX_VALUE);
        assertTrue(p.isMaiorDeIdade());
    }
}
